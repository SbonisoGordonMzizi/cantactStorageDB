package com.techcreate.model;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
public class DbPathConstractor {
     {
         dbDirCreater(System.getenv("HOME")+"/.propsDb");
         propsFileCreater(System.getenv("HOME")+"/.propsDb");
     }


    public String dbPathCreater() {
        Properties properties = new Properties();
        String dbPathFromPropsFile = "";
        String homedir = System.getenv("HOME");


        try(FileInputStream inputStream = new FileInputStream(homedir + modelConst.PROPARTYDIR.getValue()+"db.props")){
                properties.load(inputStream);
                dbPathFromPropsFile = properties.getProperty("Path");


        } catch (IOException e) {
            System.out.println("Can not read property file " + e.getMessage());
        }

        if (dbPathFromPropsFile.equals("default")) {
            dbDirCreater(homedir+modelConst.DATABASEDIR.getValue());
            return modelConst.JDBCPATH.getValue() + homedir + modelConst.DATABASEDIR.getValue() + modelConst.DATABASENAME.getValue();
        } else {
            dbDirCreater(dbPathFromPropsFile+modelConst.DATABASEDIR.getValue());
            return modelConst.JDBCPATH.getValue() + dbPathFromPropsFile + modelConst.DATABASEDIR.getValue() + modelConst.DATABASENAME.getValue();
        }

    }
    private void dbDirCreater(String dbPathDir){
        File file = new File(dbPathDir);
        if(file.exists() == false){
            file.mkdir();
        }

    }
    private void propsFileCreater(String propsFileDir){
        Properties properties = new Properties();
        properties.setProperty("Path","default");
        File file = new File(propsFileDir+"/db.props");

        if(file.exists() == false) {
            try (FileOutputStream out = new FileOutputStream(propsFileDir + "/db.props")) {
                properties.store(out, "database path");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

    }

}

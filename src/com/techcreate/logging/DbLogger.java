package com.techcreate.logging;

import java.io.File;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.*;

public class DbLogger {
    private String logPath;
    private static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    {
        this.logPath = path();
    }
    public void dbLogging(String message){

        LogManager.getLogManager().reset();

        try {
            FileHandler fileHandler = new FileHandler(logPath+"/constactStorageDB.log",true);
            fileHandler.setFormatter(new SimpleFormatter());
            fileHandler.setLevel(Level.INFO);
            logger.addHandler(fileHandler);

            logger.log(Level.INFO,message);
        }catch (IOException e){
            e.getMessage();
        }

    }

    private String path(){
        Properties properties = new Properties();
        String dbPathFromPropsFile = "";
        String homedir = System.getenv("HOME");

        File file = new File(homedir+"/.dbLogs");
        if(file.exists() == false){
            file.mkdir();
        }
        return homedir+"/.dbLogs";
    }

}

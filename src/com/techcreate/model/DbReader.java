package com.techcreate.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import com.techcreate.logging.DbLogger;

public class DbReader {
    ArrayList<HashMap<String,String>> dbRecords = new ArrayList<>();
    DbLogger dbLogger = new DbLogger();
    private void dataBaseRead(int codeValue) {
        DbPathConstractor dbPathConstractor = new DbPathConstractor();
        ResultSet result = null;
        try (Connection conn = DriverManager.getConnection(dbPathConstractor.dbPathCreater())) {
            //DATABASE CREATING CODE
            Statement statement = conn.createStatement();
            if(codeValue == 200) {
                result = statement.executeQuery(modelConst.DATA_READ_FOR_CONTACT.getValue());
                while(result.next()){
                    HashMap<String,String> dbRecord = new HashMap<>();
                    if((result.getString("FirstName")) != null) {
                        dbRecord.put("FirstName",result.getString("FirstName"));
                    }
                    if((result.getString("SecondName")) != null) {
                        dbRecord.put("SecondName",result.getString("SecondName"));
                    }
                    if((result.getString("LastName")) != null) {
                        dbRecord.put("LastName",result.getString("LastName"));
                    }
                    if((result.getString("Status")) != null) {
                        dbRecord.put("Status",result.getString("Status"));
                    }
                    if((result.getString("CellNumber")) != null) {
                        dbRecord.put("CellNumber",result.getString("CellNumber"));
                    }
                    if((result.getString("Alt_CellNumber")) != null) {
                        dbRecord.put("Alt_CellNumber",result.getString("Alt_CellNumber"));
                    }
                    if((result.getString("Home_PhoneNumber")) != null) {
                        dbRecord.put("Home_PhoneNumber",result.getString("Home_PhoneNumber"));
                    }
                    if((result.getString("WorkNumber")) != null) {
                        dbRecord.put("WorkNumber",result.getString("WorkNumber"));
                    }
                    if((result.getString("Email")) != null) {
                        dbRecord.put("Email",result.getString("Email"));
                    }
                    dbRecords.add(dbRecord);

                }
            }else if(codeValue ==250) {
                result = statement.executeQuery(modelConst.DATA_READ_FOR_LOGIN.getValue());
                while (result.next()){

                    HashMap<String,String> dbRecord = new HashMap<>();
                    dbRecord.put("UserName",result.getString("UserName"));
                    dbRecord.put("Password",result.getString("Password"));
                    dbRecords.add(dbRecord);
                }
            }

            result.close();
            statement.close();
        } catch (SQLException e) {
            System.out.println("ERROR!!!!  >>  "+e.getMessage());
            dbLogger.dbLogging("ERROR!!!!  >>  "+e.getMessage());
        }

    }

    public ArrayList<HashMap<String,String>> dbRead(int codeValue){
        dataBaseRead(codeValue);
        return dbRecords;
    }
}

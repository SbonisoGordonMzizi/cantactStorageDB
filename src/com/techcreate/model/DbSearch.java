package com.techcreate.model;

import java.sql.*;
import java.util.HashMap;

public class DbSearch {
    public HashMap<String, String> dbSearch(HashMap<String,String> searchName){
        DbPathConstractor dbPathConstractor = new DbPathConstractor();
        HashMap<String,String> dbRecord = new HashMap<>();
        try(Connection conn = DriverManager.getConnection(dbPathConstractor.dbPathCreater())){
            Statement statement = conn.createStatement();
            String Name = searchName.get("FirstName");

            ResultSet result =statement.executeQuery("SELECT * FROM contacts WHERE FirstName="+"\'"+Name+"\'"+";");
            while(result.next()){

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
                return dbRecord;
            }
            result.close();
            statement.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return dbRecord;
    }
}

package com.techcreate.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;

import com.techcreate.controller.DbController;

public class dbWriter {
    public void dbWrite(int codeValue, HashMap<String,String> userData) {
       // DbController dbController = new DbController();

        DbPathConstractor dbPathConstractor = new DbPathConstractor();
        ResultSet resultSet = null;
        try (Connection conn = DriverManager.getConnection(dbPathConstractor.dbPathCreater())) {
            //DATABASE CREATING CODE
            Statement statement = conn.createStatement();
            if(codeValue == 100) {
                //Write contact table
                String firstName = "";
                String secondName = "";
                String lastName = "";
                String status = "";
                String cellNumber = "";
                String altCellNumber = "";
                String homePhoneNumber = "";
                String workNumber = "";
                String email = "";

                if(userData.containsKey("FirstName")) {
                    firstName = userData.get("FirstName");
                }
                if(userData.containsKey("SecondName")) {
                    secondName = userData.get("SecondName");
                }
                if(userData.containsKey("LastName")) {
                    lastName = userData.get("LastName");
                }
                if(userData.containsKey("Status")) {
                    status = userData.get("Status");
                }
                if(userData.containsKey("CellPhone")) {
                    cellNumber = userData.get("CellPhone");
                }
                if(userData.containsKey("AltCellNumber")) {
                    altCellNumber = userData.get("AltCellNumber");
                }
                if(userData.containsKey("HomeNumber")) {
                    homePhoneNumber = userData.get("HomeNumber");
                }
                if(userData.containsKey("WorkNumber")) {
                    workNumber = userData.get("WorkNumber");
                }
                if(userData.containsKey("Email")) {
                    email = userData.get("Email");
                }

                if(firstName != "" && lastName != "" && cellNumber != "") {
                    statement.executeUpdate("INSERT INTO contacts (FirstName,SecondName,LastName,Status,CellNumber,Alt_CellNumber,Home_PhoneNumber,WorkNumber,Email) VALUES(" + '\"' + firstName + '\"' + "," + '\"' + secondName + '\"' + "," +
                            '\"' + lastName + '\"' + "," + '\"' + status + '\"' + "," +
                            '\"' + cellNumber + '\"' + "," + '\"' + altCellNumber + '\"' + "," +
                            '\"' + homePhoneNumber + '\"' + "," + '\"' + workNumber + '\"' + "," +
                            '\"' + email + '\"' + ");");
                }else {
                    System.out.println("FirstName , LastName  and CellPhome can not be empty !!!!!!");
                }


            }else if(codeValue ==101) {

                if(userData.size() == 4) {

                    String FirstName = userData.get("FirstName");;
                    String LastName =  userData.get("LastName");;
                    String Username = userData.get("UserName");;
                    String Password =  userData.get("PassWord");;
                    statement.executeUpdate("INSERT INTO login (FirstName,LastName,UserName,Password) VALUES("+'\"'+FirstName+'\"'+","+'\"'+LastName+'\"'+","+'\"'+Username+'\"'+","+'\"'+Password+'\"'+");");

                }
            }
            statement.close();
        } catch (SQLException e) {
            System.out.println("ERROR!!!!  >>  " + e.getMessage());
        }
    }
}

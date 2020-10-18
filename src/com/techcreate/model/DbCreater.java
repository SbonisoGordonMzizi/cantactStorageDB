package com.techcreate.model;

import com.techcreate.logging.DbLogger;

import java.sql.*;

public class DbCreater {
    DbLogger dbLogger = new DbLogger();
    public boolean dbcreate(){
        DbPathConstractor dbPathConstractor = new DbPathConstractor();
        int sqlUpdateStatus = 0;
        try(Connection conn = DriverManager.getConnection(dbPathConstractor.dbPathCreater()) ){
            //DATABASE CREATING CODE
            Statement statement = conn.createStatement();
            sqlUpdateStatus = statement.executeUpdate(modelConst.TABLE_CONTACT.getValue());
            sqlUpdateStatus = statement.executeUpdate(modelConst.TABLE_LOGIN.getValue());
            statement.close();
        }catch (SQLException e){
            System.out.println("ERROR!!!!  >>  "+e.getMessage());
            dbLogger.dbLogging("ERROR!!!!  >>  "+e.getMessage());
        }
     return true;
    }
}

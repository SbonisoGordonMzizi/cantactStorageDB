package com.techcreate.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class DbDetete {
    public int dbDelete(HashMap<String,String> searchName) {
        DbPathConstractor dbPathConstractor = new DbPathConstractor();
        int status = -1;
        try (Connection conn = DriverManager.getConnection(dbPathConstractor.dbPathCreater())) {
            Statement statement = conn.createStatement();
            String Name = searchName.get("FirstName");
            status = statement.executeUpdate("DELETE FROM contacts WHERE FirstName="+"\'"+Name+"\'"+";");

             statement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
     return status;
    }
}

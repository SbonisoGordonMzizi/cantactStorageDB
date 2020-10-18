package com.techcreate.model;

import com.techcreate.logging.DbLogger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class DbUpdate {
    DbLogger dbLogger = new DbLogger();
    public int dbFieldsUpdate(HashMap<String,String> fieldsData){
        DbPathConstractor dbPathConstractor = new DbPathConstractor();
        int status = -1;
        try (Connection conn = DriverManager.getConnection(dbPathConstractor.dbPathCreater())) {
            Statement statement = conn.createStatement();
            String updateName = fieldsData.get("updateName");
            if(fieldsData.size() > 1){
                if(fieldsData.containsKey("firstName")) {
                    String firstName = fieldsData.get("firstName");
                    status = statement.executeUpdate("UPDATE contacts SET FirstName="+"\'"+firstName+"\'"+"WHERE FirstName="+"\'"+updateName+"\'"+";");
                }
                if(fieldsData.containsKey("secondName")) {
                    String secondName = fieldsData.get("secondName");
                    status = statement.executeUpdate("UPDATE contacts SET SecondName="+"\'"+secondName+"\'"+"WHERE FirstName="+"\'"+updateName+"\'"+";");

                }
                if(fieldsData.containsKey("lastName")) {
                    String lastName = fieldsData.get("lastName");
                    status = statement.executeUpdate("UPDATE contacts SET LastName="+"\'"+lastName+"\'"+"WHERE FirstName="+"\'"+updateName+"\'"+";");
                }
                if(fieldsData.containsKey("status")) {
                    String dbstatus = fieldsData.get("status");
                    status = statement.executeUpdate("UPDATE contacts SET Status="+"\'"+dbstatus+"\'"+"WHERE FirstName="+"\'"+updateName+"\'"+";");
                }
                if(fieldsData.containsKey("cellPhone")) {
                    String cellNumber = fieldsData.get("cellPhone");
                    status = statement.executeUpdate("UPDATE contacts SET CellNumber="+"\'"+cellNumber+"\'"+"WHERE FirstName="+"\'"+updateName+"\'"+";");
                }
                if(fieldsData.containsKey("altCellNumber")) {
                    String altCellNumber = fieldsData.get("altCellNumber");
                    status = statement.executeUpdate("UPDATE contacts SET Alt_CellNumber="+"\'"+altCellNumber+"\'"+"WHERE FirstName="+"\'"+updateName+"\'"+";");
                }
                if(fieldsData.containsKey("homeNumber")) {
                    String homePhoneNumber = fieldsData.get("homeNumber");
                    status = statement.executeUpdate("UPDATE contacts SET Home_PhoneNumber="+"\'"+homePhoneNumber+"\'"+"WHERE FirstName="+"\'"+updateName+"\'"+";");
                }
                if(fieldsData.containsKey("workNumber")) {
                    String workNumber = fieldsData.get("workNumber");
                    status = statement.executeUpdate("UPDATE contacts SET WorkNumber="+"\'"+workNumber+"\'"+"WHERE FirstName="+"\'"+updateName+"\'"+";");
                }
                if(fieldsData.containsKey("email")) {
                    String email = fieldsData.get("email");
                    status = statement.executeUpdate("UPDATE contacts SET Email="+"\'"+email+"\'"+"WHERE FirstName="+"\'"+updateName+"\'"+";");
                }

            }
            statement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            dbLogger.dbLogging(e.getMessage());
        }
        return status;
    }
}

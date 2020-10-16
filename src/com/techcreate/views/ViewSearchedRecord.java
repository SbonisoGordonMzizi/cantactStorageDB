package com.techcreate.views;

import java.util.ArrayList;
import java.util.HashMap;

public class ViewSearchedRecord {
    public void searchedRecord(HashMap<String,String> dbRecord){
        int count = 1;
        System.out.println("*****************SEARCH RESULT******************\n");


            System.out.print(count+" ) ");
            count++;
            if(dbRecord.containsKey("FirstName")){
                System.out.print(dbRecord.get("FirstName")+" ");
            }
            if(dbRecord.containsKey("SecondName")) {
                System.out.print( dbRecord.get("SecondName")+" ");
            }
            if(dbRecord.containsKey("LastName")) {
                System.out.print( dbRecord.get("LastName")+" ");
            }
            if(dbRecord.containsKey("Status")) {
                System.out.print(  dbRecord.get("Status")+" ");
            }
            if( dbRecord.containsKey("CellNumber")) {
                System.out.print( dbRecord.get("CellNumber")+" ");
            }
            if(dbRecord.containsKey("Alt_CellNumber")) {
                System.out.print(   dbRecord.get("Alt_CellNumber")+" ");
            }
            if(dbRecord.containsKey("Home_PhoneNumber")) {
                System.out.print(  dbRecord.get("Home_PhoneNumber")+" ");
            }
            if( dbRecord.containsKey("WorkNumber")) {
                System.out.print( dbRecord.get("WorkNumber")+" ");
            }
            if( dbRecord.containsKey("Email")) {
                System.out.print(  dbRecord.get("Email")+"\n");            }

        System.out.println("***************** END ******************\n");

    }
}

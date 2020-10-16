package com.techcreate.views;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashMap;

public class ViewAllRecords {

    public void dbRecordReader(ArrayList<HashMap<String,String>> dbRecords){
        int count = 1;
        System.out.println("*****************CONTACTS LIST******************\n");
        for(int i = 0; i < dbRecords.size();i++){
            HashMap<String,String> me = new HashMap<>();
            me = dbRecords.get(i);
            System.out.print(count+" ) ");
            count++;
            if(me.containsKey("FirstName")){
                System.out.print(me.get("FirstName")+" ");
            }
            if(me.containsKey("SecondName")) {
                System.out.print( me.get("SecondName")+" ");
            }
            if(me.containsKey("LastName")) {
                System.out.print( me.get("LastName")+" ");
            }
            if(me.containsKey("Status")) {
                System.out.print(  me.get("Status")+" ");
            }
            if( me.containsKey("CellNumber")) {
                System.out.print( me.get("CellNumber")+" ");
            }
            if(me.containsKey("Alt_CellNumber")) {
                System.out.print(   me.get("Alt_CellNumber")+" ");
            }
            if(me.containsKey("Home_PhoneNumber")) {
                System.out.print(  me.get("Home_PhoneNumber")+" ");
            }
            if( me.containsKey("WorkNumber")) {
                System.out.print( me.get("WorkNumber")+" ");
            }
            if( me.containsKey("Email")) {
                System.out.print(  me.get("Email")+"\n");            }
        }
        System.out.println("***************** END ******************\n");

    }
}

package com.techcreate.views;

import java.util.HashMap;
import java.util.Scanner;

public class DeleteRecordView {
    public HashMap<String, String> delete(){
        HashMap<String,String> userNameToDelete = new HashMap<>();

        System.out.println("_________________DELETING___________________");
        System.out.println("_______Provide Contact Name to delete_______");
        System.out.println("____________________________________________\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter UserName : ");
        String ContactName =scanner.next();
        userNameToDelete.put("FirstName",ContactName);
        return userNameToDelete;
    }
}

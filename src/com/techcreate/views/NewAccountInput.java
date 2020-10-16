package com.techcreate.views;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Handler;

public class NewAccountInput {
    HashMap<String,String> newCountData = new HashMap<>();

    public HashMap<String,String> userLoginInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("_____________CREATE NEW ACCOUNT______________");
        System.out.println("_____________________________________________");
        System.out.print("Enter FirstName : ");
        String firstName = scanner.next();
        System.out.print("Enter LastName : ");
        String lastName = scanner.next();
        System.out.print("Enter UserName : ");
        String userName = scanner.next();
        System.out.print("Enter Password : ");
        String passWord = scanner.next();

        newCountData.put("FirstName",firstName);
        newCountData.put("LastName",lastName);
        newCountData.put("UserName",userName);
        newCountData.put("PassWord",passWord);
        scanner.close();
        return newCountData;
    }
}

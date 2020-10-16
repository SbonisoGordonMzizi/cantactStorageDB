package com.techcreate.views;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class UserAddView {

    HashMap<String,String> userInputData = new HashMap<>();
    public HashMap<String,String> addUser(){
        Scanner scanner = new Scanner(System.in);
        String option = "";

        System.out.println("______________ADD USER CONTACT_______________");
        System.out.println("_____________________________________________\n");

        System.out.println("<<>>              Required               <<>>");
        System.out.print("Enter FirstName : ");
        String firstName = scanner.next();
        userInputData.put("FirstName",firstName);

        System.out.println("SecondName  <<>> Optional <<>>");
        System.out.print("Provide SecondName :: yes or no ::> ");
        option  = scanner.next();
        if(option.toLowerCase().equals("yes")) {
            System.out.print("Enter SecondName : ");
            String secondName = scanner.next();
            userInputData.put("SecondName",secondName);
        }

        System.out.println("<<>>              Required               <<>>");
        System.out.print("Enter LastName : ");
        String lastname = scanner.next();
        userInputData.put("LastName",lastname);

        System.out.println("Status   <<>> Optional <<>>");
        System.out.print("Provide Status :: yes or no ::> ");
        option  = scanner.next();
        if(option.toLowerCase().equals("yes")) {
            System.out.print("Enter Status : ");
            String status = scanner.next();
            userInputData.put("Status",status);
        }

        System.out.println("<<>>              Required             <<>>");
        System.out.print("Enter  Cell Number : ");
        String cellNumber = scanner.next();
        userInputData.put ("CellPhone",cellNumber);

        System.out.println("Alt CellNumber  <<>> Optional <<>>");
        System.out.print("Provide Alt CellNumber :: yes or no ::> ");
        option  = scanner.next();
        if(option.toLowerCase().equals("yes")) {
            System.out.print("Enter  Alt Cell Number : ");
            String atlCellNumber = scanner.next();
            userInputData.put("AltCellNumber",atlCellNumber);
        }

        System.out.println("Home PhoneNumber  <<>> Optional <<>>");
        System.out.print(" Provide Home PhoneNumber :: yes or no ::> ");
        option  = scanner.next();
        if(option.toLowerCase().equals("yes")) {
            System.out.print("Enter  Home PhoneNumber : ");
            String homeNumber = scanner.next();
            userInputData.put("HomeNumber",homeNumber);
        }

        System.out.println("Work Number  <<>> Optional <<>>");
        System.out.print("Provide Work Number :: yes or no ::> ");
        option  = scanner.next();
        if(option.toLowerCase().equals("yes")) {
            System.out.print("Enter  Work Number : ");
            String workNumber = scanner.next();
            userInputData.put("WorkNumber",workNumber);
        }
        System.out.println("Email  <<>> Optional <<>>");
        System.out.print("Provide Email :: yes or no ::> ");
        option  = scanner.next();
        if(option.toLowerCase().equals("yes")) {
            System.out.println("<<>>              Optional               <<>>");
            System.out.print("Enter Email Address : ");
            String email = scanner.next();
            userInputData.put("Email",email);
        }

        return userInputData;
    }
}

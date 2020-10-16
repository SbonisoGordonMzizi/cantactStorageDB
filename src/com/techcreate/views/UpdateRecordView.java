package com.techcreate.views;

import java.util.HashMap;
import java.util.Scanner;

public class UpdateRecordView {

    HashMap<String,String> userInputData = new HashMap<>();
    public HashMap<String,String> updateUser(){
        Scanner scanner = new Scanner(System.in);
        String option = "";
        boolean checkFiled = false;


        System.out.println("_________________UPDATING____________________");
        System.out.println("_____Provide Name Of a Contact To Update_____");
        System.out.println("_____________________________________________\n");
        System.out.print("Enter UserName : ");
        String contactName = scanner.next();
        userInputData.put("updateName",contactName);
        System.out.println("\n");



        System.out.println("__________CONTACT FIELD TO UPDATE____________");
        System.out.println("_____________________________________________\n");

        if(checkFiled == false) {
            System.out.print("Update FirstName :: yes or no ::> ");
            option = scanner.next();
            if (option.toLowerCase().equals("yes")) {
                System.out.print("Enter FirstName : ");
                String firstName = scanner.next();
                userInputData.put("firstName", firstName);
                checkFiled = true;
            }

        }
        if(checkFiled == false) {
            System.out.print("Update SecondName :: yes or no ::> ");
            option = scanner.next();
            if (option.toLowerCase().equals("yes")) {
                System.out.print("Enter SecondName : ");
                String secondName = scanner.next();
                userInputData.put("secondName", secondName);
                checkFiled = true;
            }
        }
        if(checkFiled == false) {
            System.out.print("Update LastName :: yes or no ::> ");
            option = scanner.next();
            if (option.toLowerCase().equals("yes")) {
                System.out.print("Enter LastName : ");
                String lastname = scanner.next();
                userInputData.put("lastName", lastname);
                checkFiled = true;
            }
        }
        if(checkFiled == false) {
            System.out.print("Update Status :: yes or no ::> ");
            option = scanner.next();
            if (option.toLowerCase().equals("yes")) {
                System.out.print("Enter Status : ");
                String status = scanner.next();
                userInputData.put("status", status);
                checkFiled = true;
            }
        }

        if(checkFiled == false) {
            System.out.print("Update CellNumber :: yes or no ::> ");
            option = scanner.next();
            if (option.toLowerCase().equals("yes")) {
                System.out.print("Enter  Cell Number : ");
                String cellNumber = scanner.next();
                userInputData.put("cellPhone", cellNumber);
                checkFiled = true;
            }
        }

        if(checkFiled == false) {
            System.out.print("Update Alt CellNumber :: yes or no ::> ");
            option = scanner.next();
            if (option.toLowerCase().equals("yes")) {
                System.out.print("Enter  Alt Cell Number : ");
                String atlCellNumber = scanner.next();
                userInputData.put("altCellNumber", atlCellNumber);
                checkFiled = true;
            }
        }

        if(checkFiled == false) {
            System.out.print("Update Home PhoneNumber :: yes or no ::> ");
            option = scanner.next();
            if (option.toLowerCase().equals("yes")) {
                System.out.print("Enter  Home PhoneNumber : ");
                String homeNumber = scanner.next();
                userInputData.put("homeNumber", homeNumber);
                checkFiled = true;
            }
        }

        if(checkFiled == false) {
            System.out.print("Update Work Number :: yes or no ::> ");
            option = scanner.next();
            if (option.toLowerCase().equals("yes")) {
                System.out.print("Enter  Work Number : ");
                String workNumber = scanner.next();
                userInputData.put("workNumber", workNumber);
                checkFiled = true;
            }
        }

        if(checkFiled == false) {
            System.out.print("Update Email :: yes or no ::> ");
            option = scanner.next();
            if (option.toLowerCase().equals("yes")) {
                System.out.println("<<>>              Optional               <<>>");
                System.out.print("Enter Email Address : ");
                String email = scanner.next();
                userInputData.put("email", email);
                checkFiled = true;
            }
        }
            return userInputData;
        }
}

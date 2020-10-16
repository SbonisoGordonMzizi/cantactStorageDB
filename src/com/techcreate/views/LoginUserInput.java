package com.techcreate.views;

import java.util.ArrayList;
import java.util.Scanner;

public class LoginUserInput {
    ArrayList<String> passwdAndUserName = new ArrayList<>();

    public ArrayList<String> userLoginInput(){
        System.out.println("____________________LOGIN____________________");
        System.out.println("_____________________________________________\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter UserName : ");
        String userName =scanner.next();
        System.out.print("Enter Password : ");
        String passWord =scanner.next();

        passwdAndUserName.add(userName);
        passwdAndUserName.add(passWord);

        return passwdAndUserName;
    }
}

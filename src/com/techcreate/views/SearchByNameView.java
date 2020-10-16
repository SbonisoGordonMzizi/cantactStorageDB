package com.techcreate.views;

import java.util.HashMap;
import java.util.Scanner;

public class SearchByNameView {
    public HashMap<String, String> search(){
        HashMap<String,String> userNameToSearch = new HashMap<>();

        System.out.println("_________________SEARCHING___________________");
        System.out.println("__________Provide Name To Search For_________");
        System.out.println("_____________________________________________\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter UserName : ");
        String ContactName =scanner.next();
        userNameToSearch.put("FirstName",ContactName);
        return userNameToSearch;
    }
}

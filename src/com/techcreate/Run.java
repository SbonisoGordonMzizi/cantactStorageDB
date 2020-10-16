package com.techcreate;
import com.techcreate.controller.DbController;

import java.util.Scanner;

public class Run {

    public static  void main(String[] args){
      DbController dbController = new DbController();
        manu();
        System.out.print(">>  ");
      Scanner scanner = new Scanner(System.in);
      String value = scanner.next();

      switch (value) {
          case "1":
              dbController.bdControlLogin(1);
           break;
          case "2":
              dbController.bdControlLogin(2);
              break;
          default:
              errorMenu();
              break;
       }
    }
    public static void manu(){
        System.out.println("_______________CONTACT STORAGE_______________");
        System.out.println("_____________________________________________");
        System.out.println("_____________________________________________");
        System.out.println("<<>> Enter    1 :   Login                <<>>");
        System.out.println("<<>> Enter    2 :   New Account          <<>>");
        System.out.println("_____________________________________________");
        System.out.println("_____________________________________________");
    }
    public static void errorMenu(){
        System.out.println("___________ PROVIDE VALID INPUT______________");
        System.out.println("_____________________________________________");
        System.out.println("_____________________________________________");
        System.out.println("<<>> Enter    1 :   Login                <<>>");
        System.out.println("<<>> Enter    2 :   New Account          <<>>");
        System.out.println("_____________________________________________");
        System.out.println("_____________________________________________");
    }
}

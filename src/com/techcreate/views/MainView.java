package com.techcreate.views;

import java.util.Scanner;
import com.techcreate.controller.DbController;

public class MainView {
    DbController dbController = new DbController();
    public void mainView(){
        menu();
        boolean loopStatus = true;

        while(loopStatus) {
            System.out.print(">>  ");
            Scanner scanner = new Scanner(System.in);
            String value = scanner.next();

            switch (value) {
                case "3": dbController.dbControllerManu(3);
                break;
                case "4": dbController.dbControllerManu(4);
                break;
                case "5": dbController.dbControllerManu(5);
                break;
                case "6": dbController.dbControllerManu(6);
                break;
                case "7": dbController.dbControllerManu(7);
                break;
                case "8": dbController.dbControllerManu(8);
                    break;
                case "0": loopStatus = false;
                     System.out.println("_____________________________________________");
                     System.out.println("___________THANK YOU FOR USING ME____________");
                     System.out.println("_____________________________________________\n");
                break;
                default:
                    errorMenu();
                    break;
            }
        }
    }
    private void menu(){
        System.out.println("________WELCOME TO CONTACT STORAGE___________");
        System.out.println("_____________________________________________");
        System.out.println("_____________________________________________");
        System.out.println("<<>> Enter    3 :   View Contacts        <<>>");
        System.out.println("<<>> Enter    4 :   Add  Contacts        <<>>");
        System.out.println("<<>> Enter    5 :   Search By Name       <<>>");
        System.out.println("<<>> Enter    6 :   Update Contact       <<>>");
        System.out.println("<<>> Enter    7 :   Delete               <<>>");
        System.out.println("<<>> Enter    8 :   View Menu            <<>>");
        System.out.println("<<>> Enter    0 :   Exit                  <<>>");
        System.out.println("_____________________________________________");
        System.out.println("_____________________________________________");
    }
    private void errorMenu(){
        System.out.println("_____________________________________________");
        System.out.println("___________PROVIDE VALID INPUT_______________");
        System.out.println("_____________________________________________\n");
        System.out.println("<<>> Enter    3 :   View Contacts        <<>>");
        System.out.println("<<>> Enter    4 :   Add  Contacts        <<>>");
        System.out.println("<<>> Enter    5 :   Search By Name       <<>>");
        System.out.println("<<>> Enter    6 :   Update Contact       <<>>");
        System.out.println("<<>> Enter    7 :   Delete               <<>>");
        System.out.println("<<>> Enter    8 :   View Menu            <<>>");
        System.out.println("<<>> Enter    0 :   Exit                 <<>>");
        System.out.println("_____________________________________________");
        System.out.println("_____________________________________________");
    }
}

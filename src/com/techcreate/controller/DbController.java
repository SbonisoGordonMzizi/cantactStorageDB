package com.techcreate.controller;

import com.techcreate.model.*;
import com.techcreate.views.*;
import  com.techcreate.views.NewAccountInput;

import javax.naming.directory.SearchResult;
import java.util.ArrayList;
import java.util.HashMap;
import com.techcreate.logging.DbLogger;

public class DbController {
    DbLogger dbLogger = new DbLogger();
    public void bdControlLogin(int codeValue){

        switch (codeValue){
            case 1: login();
            break;
            case 2:
                ArrayList<HashMap<String,String>> dbRecords = new ArrayList<>();
                DbReader dbReader = new DbReader();
                dbRecords = dbReader.dbRead(250);
                if(dbRecords.size() == 0){
                    dbNewAccount();
                }else if(dbRecords.size() == 1){
                    System.out.println("___________ONLY ONE USER CAN EXIST___________");
                    dbLogger.dbLogging("___________ONLY ONE USER CAN EXIST___________");
                    System.out.println("__________ONE USER ALREADY EXISTING__________\n");
                    login();
                }
            break;

        }

    }
    public void dbControllerManu(int codeValue){
        switch (codeValue){
            case 3:
                viewContact();
                break;
            case 4:
                 addContact();
                break;
            case 5:
                dbSearch();
                break;
            case 6:
                dbUpdate();
                break;
            case 7:dbDelete();
                break;
            case 8: menu();
                break;
        }
    }
    private void login(){
            //ViewLogin
        ArrayList<HashMap<String,String>> dbRecords = new ArrayList<>();
        ArrayList<String> userNameAndPasswd = new ArrayList<>();
        HashMap<String,String> userPasswdFromDb = new HashMap<>();
        MainView main = new MainView();
        LoginUserInput loginUserInput = new LoginUserInput();
        DbReader dbReader = new DbReader();

        boolean loginStatus = false;

        dbRecords = dbReader.dbRead(250);
        if(dbRecords.size() == 1) {
            userPasswdFromDb = dbRecords.get(0);
            userNameAndPasswd = loginUserInput.userLoginInput();
            if ((userPasswdFromDb.get("Password")).equals(userNameAndPasswd.get(1)) && (userPasswdFromDb.get("UserName").equals(userNameAndPasswd.get(0)))) {
                loginStatus = true;
                 System.out.println("_____________LOGIN SUCCESSFULLY______________");
                dbLogger.dbLogging("_____________LOGIN SUCCESSFULLY______________");
                main.mainView();
            }
            if (loginStatus == false) {
                System.out.println("__________________LOGIN FAILED____________________");
                dbLogger.dbLogging("__________________LOGIN FAILED____________________");
            }
        }else if(dbRecords.size() ==0){
                System.out.println("_______________ACCOUNT DO NOT EXIST_______________");
                dbLogger.dbLogging("_______________ACCOUNT DO NOT EXIST_______________");
            dbNewAccount();
        }

    }
    private void viewContact(){
        //view conatct
        ArrayList<HashMap<String,String>> dbRecords = new ArrayList<>();
        ViewAllRecords viewAllRecords = new ViewAllRecords();
        DbReader dbReader = new DbReader();
        dbRecords = dbReader.dbRead(200);
        viewAllRecords.dbRecordReader(dbRecords);

    }
    private  void addContact(){
        dbWriter writerUserdata = new dbWriter();
        HashMap<String,String> useradd = new HashMap<>();
        UserAddView userAddView = new UserAddView();
        useradd = userAddView.addUser();
        writerUserdata.dbWrite(100,useradd);


    }
    private void dbUpdate(){
        //update record to a database
        int status = 0;
        HashMap<String,String> userUpdate = new HashMap<>();
        UpdateRecordView updateRecordView = new UpdateRecordView();
        DbUpdate dbUpdate = new DbUpdate();
        userUpdate = updateRecordView.updateUser();
        status = dbUpdate.dbFieldsUpdate(userUpdate);
        if(status > 0){
            System.out.println("_____________RECORD UPDATED_________________");
            dbLogger.dbLogging("_____________RECORD UPDATED_________________");
        }else if(status == 0){
            System.out.println("___________RECORD DO NOT EXIST______________");
            dbLogger.dbLogging("___________RECORD DO NOT EXIST______________");
        }
    }
    private void dbDelete(){
        //delete record from database
        int status = 0;
        DbDetete dbDetete = new DbDetete();
        DeleteRecordView deleteRecordView= new DeleteRecordView();
        HashMap<String,String> userNameToDelete = new HashMap<>();
        userNameToDelete = deleteRecordView.delete();
        status = dbDetete.dbDelete(userNameToDelete);
        if(status > 0){
            System.out.println("_____________RECORD DELETED_________________");
            dbLogger.dbLogging("_____________RECORD DELETED_________________");
        }else if(status == 0){
            System.out.println("___________RECORD DO NOT EXIST______________");
            dbLogger.dbLogging("___________RECORD DO NOT EXIST______________");
        }
    }
    private void dbSearch(){
        //search records by name in database
        ViewSearchedRecord viewRecord = new ViewSearchedRecord();
        SearchByNameView searchByNameView = new SearchByNameView();
        DbSearch search = new DbSearch();
        HashMap<String,String> userNameToSearch = new HashMap<>();
        HashMap<String,String> searchResult = new HashMap<>();
        userNameToSearch = searchByNameView.search();
        searchResult =search.dbSearch(userNameToSearch);
        if(searchResult.size() != 0){

            viewRecord.searchedRecord(searchResult);

        };

    }
    private void dbNewAccount(){
        //ViewNewAccount;
        NewAccountInput newAccountInput = new NewAccountInput();
        dbWriter writerUserdata = new dbWriter();
        System.out.println("View New Account");
        HashMap<String,String> newUserData = new HashMap<>();
        newUserData =  newAccountInput.userLoginInput();

        writerUserdata.dbWrite(101,newUserData);
    }
    private void menu(){
        System.out.println("___________CONTACT STORAGE MENU______________");
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

}

package com.techcreate.model;

enum modelConst {
    //Path Constructor Constants
    DATABASENAME("dataStorage.db"),
    DATABASEDIR("/.db/"),
    PROPARTYDIR("/.propsDb/"),
    JDBCPATH("jdbc:sqlite:"),

    //Sql Statement for creating Tables
    TABLE_CONTACT("CREATE TABLE IF NOT EXISTS contacts(contID INTEGER PRIMARY KEY, FirstName VARCHAR(20) NOT NULL,SecondName VARCHAR(20),LastName VARCHAR(20) NOT NULL, Status VARCHAR(4)," +
            "CellNumber VARCHAR(10) NOT NULL,Alt_CellNumber VARCHAR(10),Home_PhoneNumber VARCHAR(10), WorkNumber VARCHAR(10), Email VARCHAR(30));"),
    TABLE_LOGIN("CREATE TABLE IF NOT EXISTS login( userID INTEGER PRIMARY KEY, FirstName VARCHAR(20) NOT NULL, LastName VARCHAR(20) NOT NULL,UserName VARCHAR(15) NOT NULL," +
            "Password VARCHAR(500) NOT NULL);"),


    DATA_READ_FOR_LOGIN("SELECT UserName,Password FROM login WHERE userID=1"),
    DATA_READ_FOR_CONTACT("SELECT * FROM contacts");
    private String value;
    modelConst(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

package com.cy.demo_01;

public class interface03 {
    public static void main(String[] args) {
        mysql mysql = new mysql();
        t(mysql);
        System.out.println("============");
        oracledb oracledb = new oracledb();
        t(oracledb);
    }
    public static void t(DBinterface db){
        db.connect();
        db.close();
    }
}

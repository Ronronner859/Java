package com.cy.demo_01;

public class oracledb implements DBinterface {
    @Override
    public void connect() {
        System.out.println("连接oracle");
    }

    @Override
    public void close() {
        System.out.println("关闭oracle");
    }
}

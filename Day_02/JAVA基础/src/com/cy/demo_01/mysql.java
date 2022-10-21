package com.cy.demo_01;

public class mysql implements DBinterface {
    @Override
    public void connect() {
        System.out.println("链接mysql!");
    }

    @Override
    public void close() {
        System.out.println("关闭mysql!");
    }
}

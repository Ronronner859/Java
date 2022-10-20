package com.cy.demo_01;

public class interface02 {
    public static void main(String[] args) {

    }
}
//如果一个类 implements实现接口
//必须实现该接口的所有的抽象方法
class A implements Ainterface{

    @Override
    public void hi() {
        System.out.println("hhh");
    }
}

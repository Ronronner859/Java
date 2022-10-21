package com.cy.demo_01;

public interface Ainterface {
    //属性
    public int n1 =10;
    //写方法
    //在接口中，抽象方法的abstract可以省略
    public abstract void hi();
    //jdk8之后：可以有默认的实现方法，需要使用default关键字修饰
    default public void ok(){
        System.out.println("ok...");
    }
    public static void cry(){
        System.out.println("cry..");
    }
}

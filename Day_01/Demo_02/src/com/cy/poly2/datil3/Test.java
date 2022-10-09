package com.cy.poly2.datil3;

public class Test {
    public static void main(String[] args) {
        //动态绑定机制 A 是编译类型 B是运行类型
        A a = new B();
        System.out.println(a.sum());
        System.out.println(a.sum1());

    }
}
class A{
    int a = 10;
    public int sum(){
        return geta() + 10;
    }
    public int geta(){
        return a;
    }
    public int sum1(){
        return a + 10;
    }
    public int geta1(){
        return a;
    }
}
class B extends  A{
    int a = 20;
//    public int sum(){
//        return a + 10;
//    }
    public int geta(){
        return a;
    }
    public int sum1(){
        return a + 10;
    }
    public int geta1(){
        return a;
    }
}

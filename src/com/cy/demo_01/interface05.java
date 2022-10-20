package com.cy.demo_01;

public class interface05 {
    public static void main(String[] args) {
        System.out.println(IB.n1); //n1 为static
//        IB.n1 =1;
    }
}
interface IB{
    int n1 = 100;//public static final int n1  = 100;
    void h1();
}
interface IC{
    void say();
}
interface ID extends IB,IC{

}
class pig implements IB,IC{

    @Override
    public void h1() {

    }

    @Override
    public void say() {

    }
}
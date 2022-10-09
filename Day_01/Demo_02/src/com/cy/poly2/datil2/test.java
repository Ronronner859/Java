package com.cy.poly2.datil2;

public class test {
    public static void main(String[] args) {
        sub sub = new sub();
        System.out.println(sub.c);
        sub.display();//看编译类型
        Base b = sub;//看编译类型
        System.out.println(b==sub);
        System.out.println(b.c);//看编译类型
        b.display();//看运行类型
    }
}
class Base{
    int c = 10;
    public void display(){
        System.out.println(this.c);
    }
}
class sub extends Base{
    int c = 20;
    public void display(){
        System.out.println(this.c);
    }
}
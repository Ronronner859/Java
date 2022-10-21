package com.cy.demo_01;

public class interface06 {
    public static void main(String[] args) {
        littlemonkey littlemonkey = new littlemonkey("wukong");
        littlemonkey.climbing();

    }
}
class monkey{
    private String name;

    public monkey(String name) {
        this.name = name;
    }

    public void climbing(){
        System.out.println(name+"猴子上树！");
    }
}

class littlemonkey extends monkey{

    public littlemonkey(String name) {
        super(name);
    }
}

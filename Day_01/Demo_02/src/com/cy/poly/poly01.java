package com.cy.poly;

public class poly01 {
    public static void main(String[] args) {
        mater mater = new mater("火狐");
        dog dog = new dog("小黄");
        bone bone = new bone("肉");
        mater.feed(dog,bone);
        System.out.println("===================");
        cat cat = new cat("小花猫");
        fish fish = new fish("小花鱼");
        mater.feed(cat,fish);

        System.out.println("====================");
        /*
        复盘
        复盘
        复盘
        复盘
        复盘
        复盘

        复盘
        复盘
        复盘
        复盘
         */
    }
}

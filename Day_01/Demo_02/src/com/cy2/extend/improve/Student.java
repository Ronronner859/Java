package com.cy2.extend.improve;

public class Student {
    //拿来共有属性和方法
    public String name;
    public int age;
    private double socre;
    public void setSocre(double socre) {
        this.socre = socre;
    }


    public void show(){
        System.out.println("它是"+name+"，年龄"+age+",成绩"+socre);
    }
}

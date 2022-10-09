package com.cy2.extend;

public class pupil {
    public String name;
    public int age;
    private double socre;

    public void setSocre(double socre) {
        this.socre = socre;
    }

    public void test(){
        System.out.println("他是"+name+"在。。。");
    }

    public void show(){
        System.out.println("他是"+name+"，年龄"+age+",成绩"+socre);
    }
}

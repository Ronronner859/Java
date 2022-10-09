package com.cy2.extend.improve4;

public class netepad extends Computer {
    private String color;

    public netepad(String cpu, int neicun, String yp, String color) {
        super(cpu, neicun, yp);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void printinfo(){
        System.out.println("netepad:");
        System.out.println(show() + " color:" + color);
    }
}

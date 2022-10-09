package com.cy2.extend.improve4;

public class Computer {
    private String cpu;
    private int neicun ;
    private String yp;

    public Computer(String cpu, int neicun, String yp) {
        this.cpu = cpu;
        this.neicun = neicun;
        this.yp = yp;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getNeicun() {
        return neicun;
    }

    public void setNeicun(int neicun) {
        this.neicun = neicun;
    }

    public String getYp() {
        return yp;
    }

    public void setYp(String yp) {
        this.yp = yp;
    }

    public String show(){
        return "cpu="+cpu+",neicun="+neicun+",yp="+yp;
    }
}

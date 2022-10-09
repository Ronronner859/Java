package com.cy2.extend.improve4;

public class pc extends Computer {
    private String pinpai;

    public pc(String cpu, int neicun, String yp, String pinpai) {
        super(cpu, neicun, yp);
        this.pinpai = pinpai;
    }

    public String getPinpai() {
        return pinpai;
    }

    public void setPinpai(String pinpai) {
        this.pinpai = pinpai;
    }
    public void printinfo(){
        System.out.println("pc:");
        System.out.println(show() + " brand:" + pinpai);
    }
}

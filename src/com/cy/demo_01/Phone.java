package com.cy.demo_01;

public class Phone implements usbinterface {  //phon 这个类实现usb这个接口
    //phone这个类需要去实现这个接口的 规定和声明的方法

    @Override
    public void start() {
        System.out.println("手机开始工作！");
    }

    @Override
    public void stop() {
        System.out.println("手机停止工作！");
    }
}

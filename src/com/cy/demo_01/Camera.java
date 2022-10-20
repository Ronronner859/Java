package com.cy.demo_01;

public class Camera implements usbinterface {
    @Override
    public void start() {
        System.out.println("相机开始工作！");
    }

    @Override
    public void stop() {
        System.out.println("相机停止工作！");
    }
}

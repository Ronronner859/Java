package com.cy2.extend.improve;

public class TestExtends {
    public static void main(String[] args) {
        pupil pupil = new pupil();
        pupil.name = "小名";
        pupil.age = 11;
        pupil.test();
        pupil.setSocre(90);
        pupil.show();

        System.out.println("===================");

        pupil pupil2 = new pupil();
        pupil2.name = "小真";
        pupil2.age = 13;
        pupil2.test();
        pupil2.setSocre(94);
        pupil2.show();


    }

}

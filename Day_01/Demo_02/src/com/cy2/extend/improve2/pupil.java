package com.cy2.extend.improve2;

public class pupil extends base {
    public pupil() {
//        super();//默认调用父类的构造器
        super("aa");
        System.out.println("pup...");
    }
    public pupil(String name){
        super("aa");
        System.out.println("pup22.....");
    }

    public void show(){
        System.out.println("a="+a+",b="+b+",c="+c+",d="+setA(a));
        t1();
        t2();
        t3();
        t();
    }
}

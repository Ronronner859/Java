package com.cy2.extend.improve2;

public class base extends top{
    public int a =100;
    protected int b =100;
    int c =100;
    private int d = 1000;

//    public base() {
//        System.out.println("base...");
//    }
        public base(String name) {
        System.out.println("base...");
    }

    public void t1(){
        System.out.println("1111");
    }
    //私有属性用方法调用
    public int setA(int a) {
       return a;
    }

    protected void  t2(){
        System.out.println("2222");
    }
    void t3(){
        System.out.println("3333");
    }
    private void t4(){
        System.out.println("4444");
    }
    //私有方法用方法调用
    public void t(){
        t4();
    }
}

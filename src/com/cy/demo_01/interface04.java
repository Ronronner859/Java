package com.cy.demo_01;

public class interface04 {
    public static void main(String[] args) {

    }
}
interface IA{
    void say(); //可以省略abstract
    void hi(); //修饰符 public protected 默认 private 这里的方法是public的
}
class cat implements IA{ //快捷键 ait+enter 实现所有抽象方法 不然会报错

    @Override
    public void say() {

    }

    @Override
    public void hi() {

    }
}
abstract class tiger implements IA{
    //可以不实现接口的方法
}
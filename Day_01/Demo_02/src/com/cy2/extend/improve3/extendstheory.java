package com.cy2.extend.improve3;

//继承内存的布局
public class extendstheory {
    public static void main(String[] args) {
        sno sno = new sno();//内存的布局
        System.out.println(sno.name);
//        System.out.println(sno.age);//私有无法访问
        System.out.println(sno.getAge());
        System.out.println(sno.hobby);
        // 输出的是？
        /**
         *    层级的向上寻找
         *    先访问子类 子类没有 访问父类 父类没有访问爷爷类
         */


    }
}
class grandpa{
    String name = "爷爷";
    String hobby ="快乐";
    int age = 100;
}
class father extends grandpa{
    String name = "爸爸";
    private int age = 34; //私有了 通过公共方法

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class sno extends father{
    String name = "二儿子";
}
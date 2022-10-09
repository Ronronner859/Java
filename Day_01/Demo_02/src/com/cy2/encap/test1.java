package com.cy2.encap;

public class test1 {
    public static void main(String[] args) {
        person person = new person();
        person.setName("cyCYCYCY");
        person.setAge(222);
        person.setSalary(10000);
        System.out.println(person.info());
        System.out.println(person.getSalary());
        //构造器指定属性
       person smith = new person("smith", 200, 50000);
        System.out.println("===smith===");
        System.out.println(smith.info());
    }
}
class person{
    public String name;
    private int age;//私有化
    private double salary;

    //构造器 alt insert
    public person() {

    }

    public person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        //将set方法写进去 进行验证
        this.setName(name);//等价 this.
        this.setAge(age);
        this.setSalary(salary);
    }
    //alt insert

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length()>2 && name.length()<6){
            this.name = name;
        }else {
            System.out.println("名字的长度不对！");
            this.name = "NONAME";
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>0 && age<120)
        {
            this.age = age;
        }else {
        System.out.println("你设置的年龄不对，给默认年龄！");
            this.age = 10;
        }

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String info(){
        return "信息："+ "name="+name+"  age="+age+"  salary="+salary;
    }
}

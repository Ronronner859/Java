package com.cy.poly2.多态数组;

public class teacher extends preson {
    private double salary;

    public teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String say() {
        return "老师："+super.say()+" salary:"+salary;
    }
    public void tea(){
        System.out.println("老师："+getName()+"正在..");
    }
}

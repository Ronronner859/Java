package com.cy.poly2.多态数组;

public class student extends preson {
    private double grade;

    public student(String name, int age, double grade) {
        super(name, age);
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String say() {
       return "学生"+super.say()+" score"+grade;
    }
    public void stu(){
        System.out.println("学生："+getName()+"正在..");
    }
}

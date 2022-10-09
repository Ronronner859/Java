package com.cy.poly;

public class mater {
    private String name;

    public mater(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //
    public void feed(animal dog,food bon){
        System.out.println("主人"+name+"给"+dog.getName()+"吃"+bon.getName());
    }
//    public void feed(dog dog,bone bon){
//        System.out.println("主人"+name+"给"+dog.getName()+"吃"+bon.getName());
//    }
//
//    public void feed(cat dog,fish bon){
//        System.out.println("主人"+name+"给"+dog.getName()+"吃"+bon.getName());
//    }

}

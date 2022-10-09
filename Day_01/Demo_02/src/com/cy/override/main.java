package com.cy.override;

public class main {
    public static void main(String[] args) {
        person person = new person("cy",22);
        System.out.println(person.say());
        student student = new student("maiy",19,1222,99);
        System.out.println(student.say());


    }
}

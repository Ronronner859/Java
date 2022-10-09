package com.cy.override;

public class student extends person{
    private int id;
    private int score;

    public student(String name, int age, int id, int score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }
    public String say(){
        return super.say()+"id="+id+" score="+score;
    }
   public void show(){
       System.out.println("name:"+super.getName()+" age："+super.getAge()+" id:"+id+" score:"+score);
   }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

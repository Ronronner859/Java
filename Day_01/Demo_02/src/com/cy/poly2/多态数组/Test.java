package com.cy.poly2.多态数组;

public class Test {
    public static void main(String[] args) {
        preson[] presons = new preson[5];//多个对象数组
        presons[0] = new preson("jack",22);
        presons[1] = new student("cy",22,100);
        presons[2] = new student("smith",21,90);
        presons[3] = new teacher("scott",44,2000);
        presons[4] = new teacher("pfpqwf",44,24242);

        for (int i = 0; i <presons.length ; i++) {
            //编译类型是presons 运行类型按照实际情况
            System.out.println(presons[i].say());//动态绑定机制
            if (presons[i] instanceof  student){
                ((student)presons[i]).stu();//向下转型 强制转型
            }else if (presons[i] instanceof teacher){
                ((teacher)presons[i]).tea();
            }else if (presons[i] instanceof preson){

            }
            else {
                System.out.println("类型有误，请检查..");
            }
        }
    }
}

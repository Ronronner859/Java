package com.cy.demo2;

import java.util.Arrays;

public class dog {
    // fori
    //建包： 用来管理类的文件夹 对应的文件夹下面
    public static void main(String[] args) {
        int[] arr = {1,3,543,2,-1,42};
        Arrays.sort(arr);//排序 包的使用

        System.out.println(Arrays.toString(arr));
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+"\t");

        }

    }
}

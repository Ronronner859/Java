package com.cy.BF;

public class Demo {
    public static void main(String[] args) {
        String[] str = {"helloworldred"};
        String[] str1 = {"red"};
        int index = Index_BF(str,str1,1);
        System.out.println("BF暴力求解STR1在主串STR中的位置是："+index);

    }
    public static int Index_BF(String[] S,String[] T,int pos){
        int i = pos;
        int j = 0;
        if (pos < 1 || pos>T.length){
            System.out.println("输入有误！");
            return 0;
        }
        while (i<=S.length && j<=T.length){
            if (S[i-1] == T[j]){
                ++i;
                ++j;
            }else {
                i = i - j +1;
                j =0;
            }
        }
        if (j==T.length)
            return i - T.length;
        else return 0;
    }
}

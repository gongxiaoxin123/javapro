package com.dongruan.lianxi2;

public class Shuzu {
    public static void main(String[] args) {
        int []arry=new int[20];
        int []arry1=new int[10];
        int []arry2=new int[10];
        int cout=0;
        for(int i=0;i<arry.length;i++){
            arry[i]=i;
        }
        for(int i=0;i<10;i++){
            arry1[i]=cout;
            cout++;
        }
        for(int i=0;i<10;i++){
            arry2[i]=cout;
            cout++;
            System.out.println(arry2[i]);
            System.out.println(arry1[i]);
        }

    }
}

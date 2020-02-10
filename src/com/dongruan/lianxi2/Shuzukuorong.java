package com.dongruan.lianxi2;

public class Shuzukuorong {
   private int[]arry;
   private int size;

    public Shuzukuorong(){
       size=0;
       arry=new int[10];
   }
    public int getSize() {
        return size;
    }
    public void add(int i){
       if(size>=arry.length){
           int newarry[]=new int[size/2+size];
           for(int m=0;m<size;m++){
               newarry[m]=arry[m];
           }
           System.out.println("kuorongle "+newarry.length);
           arry=newarry;
       }
       arry[size++]=i;
    }
    public void get(int n){
        if(n<0||n>=size){
            System.out.println("输入错误");
        }
        System.out.println(arry[n]);

    }
}
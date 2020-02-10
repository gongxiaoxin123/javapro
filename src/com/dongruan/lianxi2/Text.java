package com.dongruan.lianxi2;

public class Text {
    public static void main(String[] args) {
       Shuzukuorong shuzukuorong=new Shuzukuorong();
       for(int i=0;i<50;i++){
           shuzukuorong.add(i);
           System.out.println(i);
       }
       shuzukuorong.get(49);

    }
}

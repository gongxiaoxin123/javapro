package com.dongruan.zuoye;

import java.util.ArrayList;
import java.util.List;

public class Feiboshu {
    //输出斐波那契数以1，1开头后面每一位都是前2位之和
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>(  );
        list.add( 1 );
        list.add( 1 );
        while (list.size()<20){
            int m=list.get(list.size()-1)+list.get( list.size()-2 );
            list.add( m );
        }

       for(Integer integer:list){

           System.out.println(integer);
       }

    }
}

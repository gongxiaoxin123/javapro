package com.dongruan.zuoye;

import java.util.ArrayList;
import java.util.List;

public class Xiaoqiuluodi {
    //一个小球从100米高度下落每次落地后反弹到原来高度的一半求10次后反弹高度
    public static void main(String[] args) {
        List<Double>list=new ArrayList<>(  );
        list.add( 100.00 );
        list.add( 50.00 );
        while (list.size()<11){
            Double m=list.get(list.size()-1)/2;
            list.add( m );
        }
        for(Double dou:list){
            System.out.println(dou);
        }

    }
}

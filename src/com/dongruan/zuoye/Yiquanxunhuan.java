package com.dongruan.zuoye;

import java.util.ArrayList;
import java.util.List;

public class Yiquanxunhuan {
    public static void main(String[] args) {
        //n个人围成一圈报数，报到3的人出列，然后重新开始报数,最后剩下的是第几个人
        List<Integer>list=new ArrayList<>(  );
        for(int i=0;i<1000;i++){
            list.add( i );
        }
        //报到3重新报数
        //将1和2分别添加到最后作为倒数第二个和第一个

        int n=1;
        while(list.size()>1){
            if(n!=3){
                int m=list.remove( 0 );
                list.add( m );
                n++;
            }else{
                list.remove( 0 );
                n=1;
            }

        }
        System.out.println(list.get( 0 ));
    }
}

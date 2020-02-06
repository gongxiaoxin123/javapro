package com.dongruan.zuoye;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Text {
    public static void main(String[] args) {
        //分别创建arrlist和linkelist
        List arrylist = new ArrayList();
        List linkelist = new LinkedList();
        //用开始添加的时间减去添加完成的时间计算arrylist的性能
        Date startarry = new Date();
        for(int i=0;i<1000000;i++){
            arrylist.add(i);
        }
        Date endarry = new Date();
        System.out.println("arrlist添加数据所用时间" +(endarry.getTime()-startarry.getTime()));

        //同样的方式计算linkelist的性能
        Date startlinke = new Date();
        for(int j=0;j<1000000;j++){
            linkelist.add(j);
        }
        Date endlinke = new Date();
        System.out.println("linkelist添加数据所用时间"+(endlinke.getTime()-startarry.getTime()));

        //通过向中间插入数据的时间差来判断性能
        Date startarr1 = new Date();
        for(int m=0;m<100000;m++){
              arrylist.add(0,m);
        }
        Date endarr1 = new Date();
        System.out.println("arrlist中间插入所用时间"+(endarr1.getTime()-startarr1.getTime()));
        Date startlinke1 = new Date();
        for(int n=0;n<100000;n++){
          linkelist.add(0,n);
       }
       Date endlinke1 = new Date();
        System.out.println("linkelist中间插入所用的时间"+(endlinke1.getTime()-startlinke1.getTime()));
        //通过读取时间差对读取性能进行对比
        Date startarry2 = new Date();
        for(int o=0;o<100000;o++){
            arrylist.get(o);
        }
        Date endarry2 = new Date();
        System.out.println("arrylist的读取时间为"+(endarry2.getTime()-startarry2.getTime()));
        Date startlinke2 = new Date();
        for (int p=0;p<100000;p++){
            linkelist.get(p);
        }
        Date endlinke2 = new Date();
        System.out.println("linkelist的读取时间为"+(endlinke2.getTime()-startlinke2.getTime()));
      }
}

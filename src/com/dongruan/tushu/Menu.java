package com.dongruan.tushu;

import java.io.File;
import java.util.Scanner;

public class Menu {
    Scanner scanner=new Scanner(System.in);
    Mybookmethod mybook = new Mybookmethod();
    File file=new File("d:/tushu");

    public void menu(){
        if(!file.exists()){
            mybook.inputData(1);
            mybook.save();
        }else{
            mybook.read();
        }

        System.out.println("输入你要做的事情1添加图书2删除图书3查找图书（用户名）4输出全部5退出当前用户");
        int sc8=scanner.nextInt();
            if(sc8==1){
                System.out.println("添加图书");
                mybook.inputData(1);
                mybook.save();

            }else if(sc8==2){
                System.out.println("删除图书");
                mybook.deleteName();
                mybook.save();

            }else if(sc8==3){
                System.out.println("查找图书");
                mybook.searchName();

            }
            else if(sc8==4){
                System.out.println("输出全部");
                mybook.print();

            }else if(sc8==5){
                System.out.println("退出");
                System.exit(0);}

        }




    }


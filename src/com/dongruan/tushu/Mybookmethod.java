package com.dongruan.tushu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mybookmethod extends Mybook {
    ArrayList books = new ArrayList(200);
    int m=0;
    Scanner scanner=new Scanner(System.in);
    public  void inputData(Integer n){

        ArrayList book = new ArrayList();
        for(int i=0;i<n;i++){
            System.out.println("输入书名");
            String sc1=scanner.next();
            System.out.println("输入价格");
            double sc2=scanner.nextDouble();
            System.out.println("输入出版社");
            String sc3=scanner.next();
            System.out.println("输入作者");
            String sc4=scanner.next();
            System.out.println("输入Isbn号");
            String sc5=scanner.next();
            books.add(i,book);
            book.add(sc1);//名字
            book.add(sc2);//价格
            book.add(sc3);//出版社
            book.add(sc4);//作者
            book.add(sc5);//ISBN号
            m++;
        }
    }
    public void print(){
        try{
            for(int i=0;i<m;i++){
                System.out.println(books.get(i));
                return;
            }
        }catch (Exception e){
            System.out.println("没有书籍");
        }
        System.out.println("没有书籍");
    }
    public void searchName(){
        String sc6=scanner.next();
        try{
            for(int i=0;i<m;i++){
                List<String> a=(List) books.get(i);
                if(sc6.equals(sc6)==a.get(0).equals(sc6)){
                    System.out.println(books.get(i));
                    return;
                }
            }
        }catch (Exception ex){
            System.out.println("没有此书籍");
        }
        System.out.println("没有此书籍");
    }
    public void deleteName(){
        String sc7=scanner.next();
        try{
            for(int i=0;i<m;i++){
                List<String> b=(List) books.get(i);
                if(sc7.equals(sc7)==b.get(0).equals(sc7)){
                    books.remove(i);
                    System.out.println("删除成功");
                    return;
                }
            }
        }catch (Exception ex){
            System.out.println("输入错误");
        }
        System.out.println("没有此书籍");
    }
}

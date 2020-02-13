package com.dongruan.tushu;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mybookmethod {

    int m=0;


    public List<Mybook> inputData(Integer n, List<Mybook> list, File file){

        Scanner scanner=new Scanner(System.in);
        Mybook book = new Mybook();
        for(int i=0;i<n;i++){
            System.out.println("输入书名");
            String name=scanner.next();
            System.out.println("输入价格");
            double price=scanner.nextDouble();
            System.out.println("输入出版社");
            String press=scanner.next();
            System.out.println("输入作者");
            String author =scanner.next();
            System.out.println("输入Isbn号");
            String bookISBN =scanner.next();
            list.add(i,book);
             book.setName( name );
             book.setPrice( price );
             book.setPress( press );
             book.setAutor( author );
             book.setBookISBN(bookISBN);
             save( list,file );
            m++;
        }
        return list;
    }
    public void print(List<Mybook> list){
        if(list.size()==0){
            System.out.println("没有书籍");
        }else {
            for(Mybook book:list){
                System.out.println("第"+(list.indexOf(book)+1)+"本书的全部信息");
                System.out.println(book);
            }
        }
    }
    public void searchName(List<Mybook> list,String name){
        if(list.size()==0){
            System.out.println("书籍数量为0");
        }else {
            for(Mybook book:list){
                if(book.getName().equals( name )){
                    System.out.println(book);
                    break;
                }else {
                    System.out.println("此书不存在");
                }
            }
        }
    }
    public void deleteName(List<Mybook> list,String name,File file){
        if(list.size()==0){
            System.out.println("没有书籍");
        }else {
            for(Mybook book:list){
                if(book.getName().equals( name )){
                    list.remove( book );
                    save( list,file );
                    System.out.println(book);
                }else {
                    System.out.println("没有此书籍");
                }
            }
        }

    }
    public void save(List<Mybook> list,File file){
        OutputStream os = null;
        ObjectOutputStream oos = null;
        try {
            os = new FileOutputStream(file);
            oos = new ObjectOutputStream(os);
            oos.writeObject(list);
            oos.flush();
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(oos!=null)
                    oos.close();
                if(os!=null)
                    os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public  void read(List<Mybook> list,File file){
        InputStream is  = null;
        ObjectInputStream ois = null;
        try {
            is = new FileInputStream(file);
            ois = new ObjectInputStream(is);
            list =(ArrayList<Mybook>) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if(ois!=null)
                    ois.close();
                if(is!=null)
                    is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

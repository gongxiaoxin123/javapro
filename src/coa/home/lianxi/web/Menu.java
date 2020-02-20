package coa.home.lianxi.web;

import coa.home.lianxi.pojo.Home;
import coa.home.lianxi.server.ServerIn;
import coa.home.lianxi.server.Servermethod;

import java.util.List;
import java.util.Scanner;

public class Menu {
    public  void menu(){
        ServerIn serverIn=new Servermethod();
        Home home=new Home(  );
        System.out.println("输入你想做的事1查询2添加3删除4修改5退出");
        Scanner scanner=new Scanner( System.in );
        Integer sc1=scanner.nextInt();
        switch (sc1){
            case 1:
               List<Home>list= serverIn.chakan();
               for(Home ho:list){
                   System.out.println(ho);
               }
                break;
            case 2:
                System.out.println("请输入姓名");
                String name=scanner.next();
                home.setName(name);
                System.out.println("请输入年龄");
                Integer age=scanner.nextInt();
                home.setAge(age);
                System.out.println("请输入生日");
                String birth=scanner.next();
                home.setBirth(birth);
                serverIn.add1( home );
                break;
            case 3:
                Integer sc2=scanner.nextInt();
                serverIn.del( 1 );
                break;
            case 4:
                Home home1=new Home(  );
                System.out.println("请输入身份证号");
                Integer id=scanner.nextInt();
                home.setId(id);
                System.out.println("请输入姓名");
                String name1=scanner.next();
                home.setName(name1);
                System.out.println("请输入年龄");
                Integer age1=scanner.nextInt();
                home.setAge(age1);
                System.out.println("请输入生日");
                String birth1=scanner.next();
                home.setBirth(birth1);
                serverIn.upda( home );
                break;
            case 5:
                System.out.println("退出");
                System.exit(0);
                break;
        }
    }

}

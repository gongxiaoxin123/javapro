package comm.nedu.student.Dao.web;

import comm.nedu.student.Dao.pojo.Student;
import comm.nedu.student.Dao.server.Studentse;
import comm.nedu.student.Dao.server.Studentserver;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class Menu {
    Studentserver studentserver=new Studentse();
    public  void menu(){
        System.out.println("-----------------");
        System.out.println("1-------------查看所有");
        System.out.println("2-------------添加");
        System.out.println("3-------------删除");
        System.out.println("4-------------修改");
        System.out.println("4-------------退出");
        System.out.println("-----------------");
    }
    public void panduan(){
        Scanner scanner=new Scanner( System.in );
        int sc=scanner.nextInt();
        switch (sc){
            case 1:
                query();
                break;
            case 2:
                add(scanner);
                break;
            case 3:
                del( scanner );
                break;
            case 4:
                upal( scanner );
                break;
            case 5:
                System.out.println("退出");
                break;
        }
    }
    private void query(){

        List<Student>list=studentserver.query();

        if(list.size()==0){
            System.out.println("没有学生");
        }else {
            for(Student stu:list){
                System.out.println(stu);
            }
        }

    }
    private void add(Scanner scanner){
        System.out.println("请输入姓名");
        String sc1=scanner.next();
        System.out.println("请输入年龄");
        Integer sc2=scanner.nextInt();
        System.out.println("请输入性别，1为男0为女");
        Integer sc3=scanner.nextInt();
        Student student=new Student( sc1,sc2,sc3 );
        studentserver.add( student );
    }
    private void del(Scanner scanner){
        System.out.println("请输入id");
        Integer sc=scanner.nextInt();
        studentserver.del( sc );
    }
    private void upal(Scanner scanner){
        System.out.println("请输入id");
        Integer sc=scanner.nextInt();
        System.out.println("请输入姓名");
        String sc1=scanner.next();
        System.out.println("请输入年龄");
        Integer sc2=scanner.nextInt();
        System.out.println("请输入性别，1为男0为女");
        Integer sc3=scanner.nextInt();
        Student student=new Student( sc,sc1,sc2,sc3 );
        studentserver.update( student );
    }
}

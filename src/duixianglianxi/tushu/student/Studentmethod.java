package duixianglianxi.tushu.student;

import java.io.*;
import java.util.*;

public class Studentmethod {
    //添加学生信息
    public void adds(List< Student> list,File file){
        Scanner scanner=new Scanner( System.in );
        System.out.println("请输入学生学号");
        Integer sc1=scanner.nextInt();
        System.out.println("请输入学生姓名");
        String sc3=scanner.next();
        System.out.println("请输入学生成绩");
        Double sc2=scanner.nextDouble();
        Student student=new Student(sc1,sc3,sc2 );
        list.add(student);
        save( list,file );
    }
    //输出全部学生成绩信息
    public void print(List<Student>list){
        if(list.size()==0){
            System.out.println("没有学生");
        }else {
            for(Student stu:list){
                System.out.println(stu);
            }
        }
    }
    //通过学号查找学生成绩信息
    public void serch(List<Student>list){
        if(list.size()==0){
            System.out.println("没有学生");
        }else {
            Scanner scanner=new Scanner( System.in );
            System.out.println("请输入学生学号");
            Integer sc1=scanner.nextInt();
            for(Student st:list){
                if(st.getNo()==sc1){
                    System.out.println(st);
                }
            }
        }
    }
    //通过学号删除学生信息
    public void delets(List< Student>list,File file){
        if(list.size()==0){
            System.out.println("没有学生");
        }else {
            Scanner scanner = new Scanner( System.in );
            System.out.println("请输入学生学号");
            Integer sc1 = scanner.nextInt();
            for(Student stu:list){
                if(stu.getNo().equals( sc1 )){
                    System.out.println("删除成功");
                    list.remove( stu );
                    save( list,file );
                    break;
                }else {
                    System.out.println("没有学生");
                }
            }
        }
    }
  public List<Student> read(File file,List<Student>list){
      InputStream inputStream=null;
      ObjectInputStream ob=null;

      try {
          inputStream=new FileInputStream( file );
          ob=new ObjectInputStream( inputStream );
          list=(List<Student>) ob.readObject();
      } catch (FileNotFoundException e) {
          e.printStackTrace();
      } catch (IOException e) {
          e.printStackTrace();
      } catch (ClassNotFoundException e) {
          e.printStackTrace();
      }finally {
          try {
              if(ob!=null)
                  ob.close();
              if(inputStream!=null)
                  inputStream.close();
              } catch (IOException e) {
                  e.printStackTrace();
              }
      }
      return list;
  }
  public void save(List<Student>aa,File file){
        OutputStream ou=null;
        ObjectOutputStream ob=null;
      try {
          ou=new FileOutputStream( file );
          ob=new ObjectOutputStream(ou  );
          ob.writeObject(aa);
          ob.flush();
          ou.flush();
          System.out.println("wanc");
      } catch (FileNotFoundException e) {
          e.printStackTrace();
      } catch (IOException e) {
          e.printStackTrace();
      }finally {
          try {
               if(ob!=null)
                  ob.close();
              if(ou!=null)
                  ou.close();
              } catch (IOException e) {
                  e.printStackTrace();
              }
          }
      }
   public void menu(File file,List<Student> list,Student stu){
        if(!file.exists()){
            save( list,file );
        }else{
            list.add( stu );
             list=read( file,list );
        }
       System.out.println("输入你想要做的事情1~5");
       System.out.println("1添加图书");
       System.out.println("2查找图书");
       System.out.println("3删除图书");
       System.out.println("4输出所有");
       System.out.println("5退出");
       Scanner scanner=new Scanner( System.in );
       Integer sc=scanner.nextInt();
       switch (sc){
           case 1:
               adds( list ,file);
               break;
           case 2:
               serch( list );
               break;
           case 3:
               delets( list,file );
               break;
           case 4:
               print( list );
               break;
           case 5:
               System.exit(0);
       }
   }
}

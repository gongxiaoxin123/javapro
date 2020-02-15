package duixianglianxi.tushu.student;

import java.io.*;
import java.util.*;

public class Studentmethod {
    //添加学生信息
    public void add(List< Student> list){
        Scanner scanner=new Scanner( System.in );
        System.out.println("请输入学生学号");
        Integer sc1=scanner.nextInt();
        System.out.println("请输入学生姓名");
        String sc3=scanner.next();
        System.out.println("请输入学生成绩");
        Double sc2=scanner.nextDouble();
        Student student=new Student(sc1,sc3,sc2 );
        list.add(student);
    }
    //输出全部学生成绩信息
    public void print(List<Student>list){
        if(list.size()==0){
            System.out.println("没有学生");
        }else {
            for(Student stu:list){
                System.out.println(stu.getChenji());
                System.out.println(stu);
            }
        }
    }
    //通过学号查找学生成绩信息
    public void serch(Map<Integer, Student>list){
        if(list.size()==0){
            System.out.println("没有学生");
        }else {
            Scanner scanner=new Scanner( System.in );
            System.out.println("请输入学生学号");
            Integer sc1=scanner.nextInt();
            Set<Integer>keys=list.keySet();
            for(Integer key:keys){
                if(key==sc1){
                    System.out.println(list.get( key ));
                }
            }
        }
    }
    //通过学号删除学生信息
    public void delet(List< Student>list){
        if(list.size()==0){
            System.out.println("没有学生");
        }else {
            Scanner scanner = new Scanner( System.in );
            System.out.println("请输入学生学号");
            Integer sc1 = scanner.nextInt();
            for(Student stu:list){
                if(stu.getNo()==sc1){
                    System.out.println(stu);
                    list.remove( stu );
                }
            }
        }
    }
  public List<Student> read(File file){
      InputStream inputStream=null;
      ObjectInputStream ob=null;
      List<Student>list=new ArrayList<>(  );
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

}

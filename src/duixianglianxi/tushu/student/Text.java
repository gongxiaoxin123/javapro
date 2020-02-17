package duixianglianxi.tushu.student;

import java.io.File;
import java.util.ArrayList;
import java.util.List;



public class Text {
  public  static   Student student=new Student(  );
  public static    List<Student> list=new ArrayList<>(  );
  public static   Studentmethod stu=new Studentmethod();
  public static   File file=new File( "d:/a/tushu" );
    public static void main(String[] args) {

        while (true){
            stu.menu(file, list,student );
        }
    }
}

package duixianglianxi.tushu.student;

import duixianglianxi.tushu.tushu.Mybook;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class jianche {
    public static void main(String[] args) {
        File file=new File( "d:/a/tushu" );
        List<Student>list=new ArrayList<>(  );
        Student student=new Student( );
        student=new Student( 10,"sdasdaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",10.0 );
        list.add( student );
        Studentmethod stu=new Studentmethod();
        stu.save( list,file );
         stu.read(file,list);
    }
}

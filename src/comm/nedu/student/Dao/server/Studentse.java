package comm.nedu.student.Dao.server;

import comm.nedu.student.Dao.dao.Studentd;
import comm.nedu.student.Dao.dao.Studentdao;
import comm.nedu.student.Dao.pojo.Student;

import java.util.List;

public class Studentse implements Studentserver {
    Studentdao studentdao=new Studentd();
    @Override
    public List<Student> query() {

        return  studentdao.query();
    }

    @Override
    public Integer add(Student student) {
        return studentdao.add( student );
    }

    @Override
    public Integer update(Student student) {
        return studentdao.update( student );
    }

    @Override
    public int del(int id) {
        return studentdao.del( id );
    }
}

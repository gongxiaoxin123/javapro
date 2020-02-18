package comm.nedu.student.Dao.server;

import comm.nedu.student.Dao.pojo.Student;

import java.util.List;

public interface Studentserver {
    List<Student> query();
    Integer add(Student student);
    Integer update(Student student);
    int del(int id);
}

package comm.nedu.student.Dao.dao;

import comm.nedu.student.Dao.pojo.Student;

import java.util.List;

public interface Studentdao {
    List<Student> query();
    int add(Student student);
    int update(Student student);
    int del(int id);
}

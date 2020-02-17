package duixianglianxi.tushu.student;

import java.io.Serializable;

public class Student implements Serializable {
    /*
    * 编写一个程序
    * 学生类包括学号，姓名，成绩
    * 将学生信息存入数组
    * 方法有输出成绩在80~90分数段的学生成绩
    * 输出全部成绩按照分数高低排序，对前面70%的学生添加合格后面30%添加不合格
    * 学生数据的增删改
    * 学生类持久化
    * */
    private static final long serialVersionUID = 1L;
    private Integer no;
    private String name;
    private Double chenji;

    public Student(){

    }
    public Student(Integer no, String name, Double chenji) {
        this.no = no;
        this.name = name;
        this.chenji = chenji;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getChenji() {
        return chenji;
    }

    public void setChenji(Double chenji) {
        this.chenji = chenji;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", chenji=" + chenji +
                '}';
    }
}

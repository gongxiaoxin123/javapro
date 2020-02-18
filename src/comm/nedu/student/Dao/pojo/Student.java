package comm.nedu.student.Dao.pojo;

public class Student {
    private Integer id;
    private String name;
    private Integer age;
    private Integer sex;
    public String getName() {
        return name;
    }

    public Student() {
    }

    public Integer getId() {
        return id;
    }

    public Student(String name, Integer age, Integer sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Student(Integer id, String name, Integer age, Integer sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}

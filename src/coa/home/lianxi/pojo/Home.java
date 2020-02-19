package coa.home.lianxi.pojo;

public class Home {
    private Integer id;
    private String name;
    private Integer age;
    private String birth;

    @Override
    public String toString() {
        return "Home{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birth='" + birth + '\'' +
                '}';
    }

    public Home() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
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

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public Home(Integer id, String name, Integer age, String birth) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birth = birth;
    }
}

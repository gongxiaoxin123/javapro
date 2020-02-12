package lianxi;

public class Dog {
    private int name;
    private int sex;
    private int age;
    private int number;

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getSex() {

        return sex;
    }

    public void setSex(int sex) {
        if(sex!='公'||sex!='母'){
            System.out.println("错误");
        }else{
            this.sex = sex;
        }
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<1||age>130){
            System.out.println("错误");
        }else{
            this.age = age;
        }

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public static  int add(int a,int b){
        int c=a+b;
        return c;
    }
    public int add(int a,int b,int c){
        int d=a+b+c;
        return d;
    }
}


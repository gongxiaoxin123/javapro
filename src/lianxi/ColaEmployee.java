package lianxi;

public abstract class ColaEmployee {
    private String name;
    private int month;
    public ColaEmployee(String name,int month){
        this.name=name;
        this.month=month;
    }

    protected ColaEmployee() {
    }

    public abstract double getSalary(int month, int tichen, int xiaoshou);

    public abstract double getSalary(int month);

    public abstract double getSalary(int month, int guding);
}

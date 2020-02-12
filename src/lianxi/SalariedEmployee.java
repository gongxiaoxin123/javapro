package lianxi;

public abstract class SalariedEmployee extends ColaEmployee {
    private String name;
    private int guding;
    public  SalariedEmployee(){}
    public  SalariedEmployee(String name, int guding){
        super();
        this.name=name;
        this.guding=guding;
    }
    @Override
    public double getSalary(int month,int guding) {
       return guding;
    }
}

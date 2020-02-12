package lianxi;

public abstract class SalesEmployee extends ColaEmployee {
    private String name;
    private double tichen;
    private int xiaoshou;
    public SalesEmployee(){}
    public SalesEmployee(String name,double tichen,int xiaoshou){
        super();
        this.name = name;
        this.tichen = tichen;
        this.xiaoshou=xiaoshou;
    }
    @Override
    public double getSalary(int month,int tichen,int xiaoshou) {

        return xiaoshou*tichen;
    }

    @Override
    public double getSalary(int month) {
        return 0;
    }
}

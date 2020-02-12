package lianxi;

public abstract class HourlyEmployee extends ColaEmployee {
    private String name;
    private int hour;
    public  HourlyEmployee(){
    }
    public HourlyEmployee(String name,int hour){
        this();
        this.name = name;
        this.hour = hour;
    }

    public double getSalary(int month,int hour,int time) {
         if(hour<160){
             return  hour*time;
         }else {
             return (time-160)*hour*1.5+160*hour;
         }
    }

    @Override
    public double getSalary(int month) {

        return 0;
    }
}

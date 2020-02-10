package Huiyi.Lianxi2;

public abstract class Shape {
    private double mianji;
    private double zouchang;
    protected String color;
    public Shape(){}
    public Shape(String color){
        this.color=color;
    }
    public abstract double getmianji();
    public abstract double getzouchang();
    public abstract void getshow();

}

package lianxi;

public abstract class Shape {
    protected double area;// 面积
    protected double per;// 周长
    protected String color;// 颜色

    public Shape() {

    }

    public Shape(String color) {
        this.color = color;
    }

    public abstract void s();

    public abstract void c();

    public abstract void showAll();
}

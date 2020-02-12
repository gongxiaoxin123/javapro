package lianxi;

public class Circle extends Shape {
    double radius;

    public Circle() {

    }

    public Circle(int radius, String color) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public void s() {

        area = radius * radius * 3.14;
    }

    @Override
    public void c() {

        per = 2 * radius * 3.14;
    }

    @Override
    public void showAll() {

        System.out.println("圆的面积为：" + area + "，周长为：" + per+",颜色："+color);
    }

}

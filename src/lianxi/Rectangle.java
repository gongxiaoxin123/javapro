package lianxi;

public class Rectangle extends Shape {
    int width;
    int height;

    public Rectangle() {

    }

    public Rectangle(int width, int height, String color) {
        super();
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public void s() {
        area = width * height;

    }

    @Override
    public void c() {
        // TODO 自动生成的方法存根
        per = (width + height) * 2;
    }

    @Override
    public void showAll() {
        // TODO 自动生成的方法存根
        System.out.println("矩形面积为：" + area + "，周长为：" + per+",颜色："+color);
    }

}


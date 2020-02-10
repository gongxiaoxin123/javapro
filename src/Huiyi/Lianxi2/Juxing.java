package Huiyi.Lianxi2;

public class Juxing extends Shape{
    private int chang;
    private int gao;
    public Juxing(String color,int chang,int gao){
        super(color);

        this.gao=gao;
    }
    @Override
    public double getmianji() {
        return chang*gao;
    }

    @Override
    public double getzouchang() {
        return 2*(chang+gao);
    }

    @Override
    public void getshow() {
            System.out.println("矩形的面积为"+getmianji()+"周长为"+getzouchang()+"颜色位"+color);
    }
}

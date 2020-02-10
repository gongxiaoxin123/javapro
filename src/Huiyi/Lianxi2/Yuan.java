package Huiyi.Lianxi2;

public class Yuan extends Shape {
    private int banjin;
    public Yuan(){}
    public Yuan(String color,int banjin){
        super(color);

        this.banjin=banjin;
    }

    @Override
    public double getmianji() {
        return 3.14*banjin*banjin;
    }

    @Override
    public double getzouchang() {
         return 2*3.14*banjin;
    }

    @Override
    public void getshow() {
        System.out.println("圆的面积为"+getmianji()+"周长为"+getzouchang()+"颜色位"+color);
    }

}

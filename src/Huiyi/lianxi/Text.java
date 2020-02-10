package Huiyi.lianxi;

public class Text {
    public static void main(String[] args) {
        Zhuban zhuban=new Zhuban();
        Cpu i3 = new I3();
        Cpu i5 = new I5();
        Cpu i7 = new I7();
        zhuban.setCpu(i3);
        zhuban.method();
    }
}

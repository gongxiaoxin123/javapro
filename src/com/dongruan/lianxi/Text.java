package com.dongruan.lianxi;

public class Text {
    public static void main(String[] args) {
        Cpu2 i3=new I3();
        Cpu i5=new I5();
        Cpu i7=new I7();




        Zhuban zhuban = new Zhuban();
        zhuban.setCpu(i7);
        zhuban.setCpu2(i3);
        zhuban.method1();
        zhuban.method();
    }
}

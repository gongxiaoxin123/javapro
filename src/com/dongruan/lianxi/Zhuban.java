package com.dongruan.lianxi;

public class Zhuban {
    private Cpu cpu;
    private Cpu2 cpu2;


    public Cpu2 getCpu2() {
        return cpu2;
    }
//这就对了呀
    public void setCpu2(Cpu2 cpu2) {
        this.cpu2 = cpu2;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }
    public void method(){
        this.cpu.method();

    }
    public void method1(){
        this.cpu2.method1();
    }
}

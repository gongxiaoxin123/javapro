package lianxi;

public class People extends Anmal {
    //重载需要有父子关系的2个类 重写是一个类
    //重载是相同的名字不同的参数列表
    //重写是名字和参数列表都相同

    @Override
    public void run() {
        System.out.println("人跑的慢");
    }
}

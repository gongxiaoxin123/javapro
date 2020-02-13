package duoxianchen;

public class Xianchen extends Thread {
        //实现多线程三种方法
        //继承Thread类
        //必须重写run方法
        //启动不是调用run而是调用start来启动线程
        //Thread下的sleep方法代表在这个时间下不进行cpu的抢占
       //.currentThread方法获取当前线程名这个方法下有getName返回线程名
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            try {
                Thread.sleep( 300 );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"输出"+i);
        }
    }
}

package duoxianchen;

public class Xianchen2 implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<30;i++){
            System.out.println(i);
        }
    }
}

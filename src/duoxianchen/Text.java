package duoxianchen;

public class Text {
    public static void main(String[] args) {
//        Xianchen xianchen=new Xianchen();
//        xianchen.start();
//        Xianchen xianchen1=new Xianchen();
//        xianchen1.start();
        Xianchen2 xianchen2=new Xianchen2();
        Thread t=new Thread( xianchen2 );
        t.start();

    }
}

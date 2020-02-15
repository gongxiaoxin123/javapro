package duixianglianxi.tushu.miaobiao;

public class Text {
    public static void main(String[] args) {
        StopWatchmethod stopWatch=new StopWatchmethod( );
      Long a=  stopWatch.start();
        System.out.println(a);
      Long b=  stopWatch.stop();
      Long c=  stopWatch.getElapsedTime( a,b );
        System.out.println(b);
        System.out.println(c);

    }
}

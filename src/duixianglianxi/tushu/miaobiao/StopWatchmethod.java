package duixianglianxi.tushu.miaobiao;

import java.util.Date;
import java.util.Scanner;

public class StopWatchmethod {

    public Long start(){
        Long startTime=System.currentTimeMillis();
        return startTime;
    }
    public Long end(){
       Long endTime=System.currentTimeMillis();
        return endTime;
    }
    public long getElapsedTime(Long startTime,Long endTime){
        return endTime-startTime;
    }
    public Long stop(){
        Scanner scanner=new Scanner(System.in);
        boolean sc=scanner.hasNext();
        if(sc!=false){
          end();
        }
        return end();
    }

}

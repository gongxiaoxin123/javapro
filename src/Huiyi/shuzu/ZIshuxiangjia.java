package Huiyi.shuzu;

public class ZIshuxiangjia {
    public static void main(String[] args) {
        int sum=2;
        for(int i=3;i<100;i++){
            for(int m=2;m<i;m++){
                if(i%m==0){
                   break;
                }else {
                    if(m==(i-1)){
                        sum=sum+i;
                        break;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}

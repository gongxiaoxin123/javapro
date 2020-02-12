package lianxi;

public class Shuxianhua {
    public static void main(String[]args){
          for(int i=100;i<1000;i++){
              int ge=i%10;
              int shi=i/10%10;
              int bai=i/100;
              if(ge*ge*ge+shi*shi*shi+bai*bai*bai==i){
                  System.out.println(i);
              }
          }
          int a=4;
          int b=6;
          int max=1;
          int min=daxiao(a,b);
          for(int m=1;m<=a||m<=b;m++){
              if(a%m==0&&b%m==0){
                  max=m;
              }
          }
          System.out.println(max);
          for(int n=min;n<a*b;n++){
              if(n%a==0&&n%b==0){
                  min=n;
                  break;
              }
          }
        System.out.println(min);
    }
    public static int daxiao(int x,int y){
        return (x>y)?x:y;
    }
}

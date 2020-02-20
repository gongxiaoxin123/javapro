package Huiyi.shuzu;

public class Maopao {
 public  static    int arry[]= new int[]{1,5,2,70,6};
    public static void main(String[] args) {
        maopao( arry );

    }
    public static void   maopao(int[]arry){
        for(int i=0;i<arry.length;i++){
            for(int m=0;m<arry.length-1;m++){
                boolean flag=true;
                if(arry[m]<arry[m+1]){
                    int temp=arry[m];
                    arry[m]=arry[m+1];
                    arry[m+1]=temp;
                    flag=false;
                }
                if(flag){
                    break;
                }
            }
            System.out.println(arry[i]);
        }
    }
}

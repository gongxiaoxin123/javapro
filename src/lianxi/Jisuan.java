package lianxi;

public class Jisuan {
    public static void main(String[]args){
        int m=5;
        int n=3;
        int end=1;
       for(int i=0;i<n;i++){
           end=end*m;
       }

        System.out.println(end);
        int [] arry ={10,15,12,30,1,6,8,5,18};
//        for(int i=0;i<arry.length-1;i++){
//            int flag=0;
//            for(int j=0;j<arry.length-1-i;j++){
//                if(arry[j]>arry[j+1]){
//                    int temp=arry[j];
//                    arry[j]=arry[j+1];
//                    arry[j+1]=temp;
//                    flag++;
//                    if(flag==0){
//                        break;
//                    }
//                }
//            }
//        }
//        for(int b:arry){
//            System.out.println(b);
//        }
        for(int o=0;o<arry.length-1;o++){
            for(int p=o+1;p<arry.length;p++){
                if(arry[o]>arry[p]){
                    int q=arry[p];
                    arry[p]=arry[o];
                    arry[o]=q;
                }
            }
        }
        for(int s:arry){
            System.out.println(s);
        }
    }

}

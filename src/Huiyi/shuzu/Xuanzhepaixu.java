package Huiyi.shuzu;

public class Xuanzhepaixu {
    public static void main(String[] args) {
        int[]arry={20,30,5,3,8,6,10,11};
        bubbleSort( arry );
    }
    //选择排序
    //一个数组让其从小到大或从大到小排序
    //将第一个和后面所有的比较如果小于不变，大于对换位置
    public static void xuanzhe(int[]arry){
        for(int i=0;i<arry.length;i++){
             for(int j=i;j<arry.length;j++){
                 if(arry[i]<arry[j]){
                     int temp=arry[i];
                     arry[i]=arry[j];
                     arry[j]=temp;
                 }
             }
            System.out.println(arry[i]);
        }
    }
   //冒泡排序
   // 一个数组相邻的2个如果前面的大那么调换顺序
    public static void maopao(int[]arry){
        for(int i=0;i<arry.length-1;i++){
            for(int m=i;i<arry.length-1-i;m++){
                if(arry[i]<arry[m+1]){
                    int temp=arry[m];
                    arry[m]=arry[m+1];
                    arry[m+1]=temp;
                }
            }
            System.out.println(arry[i]);
        }

    }
    public static void bubbleSort(int[] arr){
        for (int x=0;x<arr.length-1 ;x++ ){
            for (int y=0;y<arr.length-1-x ;y++ ){
                if (arr[y]<arr[y+1]){
                    swap(arr,y,y+1);
                }
            }
        }
        for(int a:arr){
            System.out.println(a);
        }
    }
    public static void swap(int []arr,int a,int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}

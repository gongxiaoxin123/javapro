package lianxi;

public class Shuzukuorong {
    //数值的实际长度
    private int[]arry;
    //实际放入的个数
    private int siez;
    public Shuzukuorong(){
        siez=0;
        arry=new int[10];
    }
    public int getSiez(){
        return siez;
    }
    public void add(int i){
        //长度大于数组长度
        if(siez>=arry.length){
            //定义一个新的数组
            int[] arry2=new int[siez+siez/2];
            for(int j=0;j<arry.length;j++){
                arry2[j]=arry[j];
            }
            System.out.println("扩容完成数组的长度为"+arry2.length+"");
            arry=arry2;
        }
        arry[siez++]=i;
    }
    public int get(int n){
        if(n<0||n>=siez){
            System.out.println("cuowu");
            return -1;
        }
        return arry[n];
    }
}


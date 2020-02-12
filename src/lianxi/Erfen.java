package lianxi;

public class Erfen {
    public static void main(String[]args){
        int arry[]=new int[1000];
        for(int i=0;i<arry.length;i++){
            arry[i]=i+1;
        }
        int value=66;
         int m=search(arry,value);
        System.out.println(m);

    }

    public static int search(int[] arry,int value){
        int min=0;
        int max=arry.length-1;
        int mind;
        int cont=0;
        while(min<=max){
            cont++;
             mind=(min+max)/2;
            if(value==arry[mind]){
                System.out.println(cont);
                return mind;
            }else if(value<arry[mind]){
                max = mind-1;
            }else {
                min = mind+1;
            }
        }
        return -1;

    }

}

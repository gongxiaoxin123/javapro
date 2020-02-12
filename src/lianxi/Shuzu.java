package lianxi;

public class Shuzu {
    public static void main(String[]args){
        int [] arry={1,2,3,4};
        for(int a:arry){
            int bai=100*a;
            for(int b:arry){
                if(a!=b){
                    int shi=10*b;
                    for(int c:arry){
                        if(c!=b&&c!=a){
                            int d=bai+shi+c;
                            System.out.println(d);
                        }

                    }
                }

            }
        }

    }
}

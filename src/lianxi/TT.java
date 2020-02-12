package lianxi;

public class TT {
    public static void main(String[]args){
        Shuzukuorong s1=new Shuzukuorong();
             for(int i=1;i<=100;i++){
                 s1.add(i);
             }
        System.out.println(s1.getSiez());
             for(int i=0;i<s1.getSiez();i++){
                 System.out.println(s1.get(i));
             }
    }
}

package lianxi;

import java.util.ArrayList;
import java.util.Collections;

public class Texts {
    public static void main(String[] args) {
//        Rectangle m=new Rectangle(3,5,"red");
//        m.s();
//        m.c();
//        m.showAll();
//        Circle n=new Circle(4,"black");
//        n.s();
//        n.c();
//        n.showAll();
        ArrayList list=new ArrayList();
        list.add(123);
        list.add("ffff");
        list.add("好人");
        list.addAll(0, Collections.singleton("ads"));
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println(list.indexOf(123));
        System.out.println();
    }
}

package lianxi;

public class Lianxi {
    public static void main(String[]args) {
        Dog l = new Dog();
        l.setAge(150);
        l.setSex(1);
        int age = l.getAge();
        int sex = l.getSex();
        int d= l.add(10,20,30);
        int a=1;
        a++;
//        int a=1900;
//        if((a%4==0&&a%100!=0)||(a%400==0)){
//            System.out.println("是闰年");
//        }else {
//            System.out.println("0");
//        }
//        int sum=0;
//        for(int i=1;i<=100;i++){
//           sum=sum+i;
//        }
//
//        System.out.println(sum);
        int i=1;
        int sum=0;
        for( i=1;i<=100;i++){
            for (int m = 2; m <= i; m++) {
                // 判断,如果能被不是自己本身之外的数整除，直接跳出循环
                if (i != m && i % m == 0) {
                    // 退出循环
                    break;
                }
                // 判断,此时该数肯定是质数
                if (i == m && i % m == 0) {
                    // 打印该值
                    System.out.println(i);
                    sum=sum+i;
                }
                }
        }
        System.out.println(sum);
        System.out.println(age);
        System.out.println(sex);
        int c=Dog.add(3,5);
        System.out.println(c);
        System.out.println(d);
        System.out.println(a);
    }

}




package Io;

import lianxi.People;

import java.io.*;

public class IoLianxi {
    public static void main(String[] args) {

       File file=new File("d:/mo.java");
       //输出
        // 存档
        OutputStream ot=null;
        try {
            ot=new FileOutputStream(file,true);
            String a="\n122asdas";
            ot.write(a.getBytes());
            ot.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(ot!=null)
                     ot.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //输入
        // 读取
        InputStream is=null;
        byte a[]=new byte[10];
        try {
            is=new FileInputStream(file);
            int c=is.read(a);
            while (c!=-1){
                System.out.println(new String(a,0,a.length));
                c= is.read(a);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(is!=null);
                     is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

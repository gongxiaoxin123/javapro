package Io.lianx;

import java.io.*;

public class Shipingfuzhi {
    public static void main(String[] args) {
        File file = new File("d:/7 多线程介绍.wmv");
        File file1=new File( "d:/a/a" );
        InputStream in=null;
        OutputStream out=null;
        byte[]a=new byte[1024];
        try {
            in=new FileInputStream( file );
            out=new FileOutputStream( file1 );
           int st= in.read(a);
           while(st!=-1){
               out.write(a,0,st);
               out.flush();
               st=in.read(a);
           }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(out!=null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(in!=null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

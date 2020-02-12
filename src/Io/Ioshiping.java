package Io;

import java.io.*;

public class Ioshiping {
    public static void main(String[] args) {
        File file=new File( "d:/7 多线程介绍.wmv" );
        File file1=new File( "d:/a" );
        if(!file1.exists()){
            file1.mkdirs();
        }
        File to=new File( "d:/a/"+file.getName() );
        InputStream in=null;
        OutputStream out=null;
        byte[]a=new byte[1024];
        try {
            in = new FileInputStream(file);
            out = new FileOutputStream(to);
            int st = in.read(a);
           while (st!=-1){
               out.write( a ,0,st);
               out.flush();
               st=in.read(a);
           }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }  catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(out!=null)
                    out.close();
                if(in!=null)
                     in.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }


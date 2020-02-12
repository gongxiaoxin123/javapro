package Io;

import java.io.*;

public class Iozhifu {
    public static void main(String[] args) {
        //字符输出流 写write操作
        File file=new File("d:/mo.java");
        Writer writer=null;
        try {
            writer=new FileWriter(file,true);
            writer.write( "\nwdawadjoajd" );
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(writer!=null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //字符reader的输入 读取操作
        Reader reader=null;
        BufferedReader br=null;
        //char[]a=new char[10];
        try {
            reader=new FileReader(file);
            br= new BufferedReader(reader);
            String str=br.readLine();
//            int b=reader.read(a);
//            while (b!=-1){
//                System.out.println(new String(a,0,b));
//                b=reader.read(a);
//            }
           while (str!=null){
               System.out.println(str);
               str=br.readLine();
           }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(br!=null)
                    br.close();
                if(reader!=null)
                    reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}





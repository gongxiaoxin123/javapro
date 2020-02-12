package Io;

import java.io.*;

public class Iozuoye {
    //视频文件不可以使用字符串复制
    public static void main(String[] args) {
        File file1=new File("d:/7 多线程介绍.wmv");
        File file2=new File("d:/a/7 多线程介绍.wmv" );
        file2.mkdirs();
        Reader reader= null;
        BufferedReader sb=null;
        Writer writer =null;
        try {
            writer=new FileWriter(file2);
            reader = new FileReader(file1);
            sb = new BufferedReader(reader);
            String str=sb.readLine();
            while (str!=null){
                str=sb.readLine();
                writer.write(str);
                writer.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(sb!=null)
                    sb.close();
                if(reader!=null)
                    reader.close();
                if(writer!=null)
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }


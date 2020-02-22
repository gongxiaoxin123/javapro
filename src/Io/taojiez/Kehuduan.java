package Io.taojiez;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Kehuduan {
    public static void main(String[] args) {
        try {
            Socket sc=new Socket( "localhost",999 );
            System.out.println("客户端连接");
            Scanner scanner=new Scanner(System.in  );
            OutputStream ot=sc.getOutputStream();
            PrintStream ps=new PrintStream( ot );
            while (true){
                String str=scanner.next();
                ps.println( str );
                ps.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

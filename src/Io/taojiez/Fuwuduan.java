package Io.taojiez;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Fuwuduan {
    public static void main(String[] args) {
        try {
            ServerSocket ser=new ServerSocket( 999 );
            Socket socket= ser.accept();
            System.out.println("服务器已连接");
            InputStream is=socket.getInputStream();
            InputStreamReader isr=new InputStreamReader( is );
            BufferedReader bf= new BufferedReader( isr );
            String w=bf.readLine();
            while (true){
                System.out.println("客户端说"+w);
                w=bf.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

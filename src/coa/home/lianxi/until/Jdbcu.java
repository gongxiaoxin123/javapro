package coa.home.lianxi.until;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Jdbcu {
    private static final String URL="jdbc:mysql://localhost:3306/db_cwgl?useUnicode=true&characterEncoding=utf8";
    private static final String USERNAME="root";
    private static final String PASSWORD="123123";
    static {
        try {
            //加载驱动
            Class.forName( "com.mysql.jdbc.Driver" );
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    static Connection getConnection(){
        Connection con=null;
        try {
            con= DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
       return con;
    }
    public static int Zsg(String sql,Object...pram){
        Connection con=getConnection();
        PreparedStatement ps=null;
        int rs=0;
        try {
            ps= con.prepareStatement( sql );
           if(pram!=null){
               for(int i=0;i<pram.length;i++){
                   ps.setObject( i+1,pram[i] );
               }
           }
           rs=ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close( con,ps );
        }
        return rs;
    }
    public static <T>List<T> chaxun(String sql,Class<T> clz){
        List<T>list=new ArrayList<>(  );
        Connection con=getConnection();
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
           ps  =  con.prepareStatement( sql );
           rs  =  ps.executeQuery();
           while (rs.next()){
               T t=clz.newInstance();//创建一个T类型的对象
               Field []field=clz.getDeclaredFields(  );//返回对象的属性集合
               for(Field f:field){//遍历属性数组，拿出每一个属性给每一个属性赋值
                   //f.getName()可以将对象的属性拿出，对象的属性对应表的字符段
                   Object value=rs.getObject(f.getName());
                   //为对象赋值
                   //第一个参数是赋值的对象，第二个是值
                   f.setAccessible( true );//私有属性在调用的时候需要给权限
                   f.set( t,value );
               }
               list.add( t );
           }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }finally {
            close( con,ps,rs );
        }
        return list;
    }
     static void  close(Connection con,PreparedStatement ps){
         try {
             if(ps!=null)
                 ps.close();
             if(con!=null)
                 con.close();
         } catch (SQLException e) {
             e.printStackTrace();
         }
     }
     static void close(Connection con,PreparedStatement ps,ResultSet rs){
         try {
             if(rs!=null)
                rs.close();
             close( con,ps );
         } catch (SQLException e) {
             e.printStackTrace();
         }
     }
}

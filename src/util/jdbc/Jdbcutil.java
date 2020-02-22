package util.jdbc;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Jdbcutil {
    private static final String URL="jdbc:mysql://localhost:3306//db_cwgl?useUnicode=true&characterEncoding=utf8";
    private static final String USERNAME="root";
    private static final String PASSWORD="123123";
    static {
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    static Connection getConnection(){
        Connection con=null;
        try {
            //创建连接
            con= DriverManager.getConnection( URL,USERNAME,PASSWORD );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
    //封装增删改
    public static int zsg(String sql,Object...pram){
        int i=0;
        Connection con=getConnection();
        PreparedStatement ps=null;
        try {
            ps=con.prepareStatement( sql );
            if(pram!=null){
                for(int m=0;m<pram.length;m++){
                    ps.setObject( i+1,pram[i] );
                }
            }
            i=ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
             cloes(con,ps );
        }
        return i;
    }
    //封装查询
    public static <T>List<T> chaxun(String sql,Class<T> clz){
           List<T> list=new ArrayList<>(  );
           Connection con=getConnection();
           PreparedStatement ps=null;
           ResultSet rs=null;
        try {
            ps=con.prepareStatement( sql );
            rs = ps.executeQuery();
             while (rs.next()){
                 T t=clz.newInstance();
                 Field[] field=clz.getDeclaredFields();
                 for(Field f:field){
                     Object value=rs.getObject( f.getName() );
                     f.setAccessible( true );
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
            cloes( con,ps,rs );
        }
        return list;
    }
    public static void  cloes(Connection con,PreparedStatement ps){
        try {
            if(ps!=null)
                ps.close();
            if(con!=null)
                con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void  cloes(Connection con,PreparedStatement ps,ResultSet rs){
        try {
            if(rs!=null)
                rs.close();
            cloes( con,ps );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

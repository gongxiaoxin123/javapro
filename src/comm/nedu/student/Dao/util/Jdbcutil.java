package comm.nedu.student.Dao.util;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Jdbcutil {
    private static final String URL="jdbc:mysql://localhost:3306/db_cwgl?useUnicode=true&characterEncoding=utf8";
    private static final String USERNAME="root";
    private static final String PASSWORD="123123";
    static {
        try {
            //每次连接都需要先加载驱动
            Class.forName( "com.mysql.jdbc.Driver" );
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    //创建连接
    static Connection getConnection(){
        Connection con=null;
        try {
            con= DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
    //封装增删改
    public static int executeUpdate(String sql,Object...params){
        int result=0;
        Connection con= getConnection();
        PreparedStatement pstm=null;
        try {
            pstm=con.prepareStatement( sql );
            if(params!=null){
                for(int i=0;i<params.length;i++){
                    pstm.setObject( i+1,params[i] );
                }
            }
            result=pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close( con,pstm );
        }
        return result;
    }
    //封装查询方法
    public static <T>List<T> executeQuery1(String sql,Class<T> clz){
        //List<Student>和List<Object>没有继承关系
        List<T> list=new ArrayList<>(  );
        Connection con=getConnection();
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
            ps=con.prepareStatement( sql );
            rs=ps.executeQuery();
            while (rs.next()){
                //创建一个T类型的对象
                //该方法是通过反射class对象调用无参构造来创建一个对象
                T t=clz.newInstance();
                //通过字段名从rs中拿值然后赋值给对象的属性
                //在不知道该类有多少个属性的情况下 有多少个属性就set多少个属性
                //有几个属性就必须获得几个属性
                Field[] fields=clz.getDeclaredFields();//调用getDeclaredFields()返回属性
                for(Field f:fields){
                    //得到的属性名和数据库里的字段名一样
                    //这样就可以将属性名当成数据库字段名 rs.getObject(属性名)
                    Object value =rs.getObject(f.getName() );
                    //拿出值之后就可以给对象赋值
                    //为属性赋值 属性对象是Field，必须指明为哪个对象的属性赋值
                    //f为具体对象用set方法进行赋值第一个参数代表为哪一个赋值
                    //第二个为赋什么样的值、
                    //如果属性是私有属性需要打开权限
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
        }
        return list;
    }
    //封装关闭方法
    static void close(Connection con,PreparedStatement pstm){
        try {
            if(pstm!=null)
                 pstm.close();
            if(con!=null)
                con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    static void close(Connection con, PreparedStatement pstm, ResultSet rs){
        try {
            if(rs!=null)
                rs.close();
            close( con,pstm );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

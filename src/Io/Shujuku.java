package Io;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Shujuku {
    public static void main(String[] args) {
        //  1 文件->新建->mysql  选择要连接数据库的种类
        // 加载驱动  连哪种数据库就要加载哪种驱动
        //String url="jdbc:mysql://192.168.80.131:3306/db1?useUnicode=true&characterEncoding=utf8";
          String url="jdbc:mysql://localhost:3306/db_cwgl?useUnicode=true&characterEncoding=utf8";
         String username="root";
         String password="123123";
        Connection con=null;
        PreparedStatement pstm=null;
        try {
            Class.forName( "com.mysql.jdbc.Driver" );//加载驱动
            // 2 新建连接  通过 主机ip或者主机名  端口号  用户名  密码
            // 创建连接 通过DriverManager类来实现
            con= DriverManager.getConnection( url,username,password );
            // 3 选择要操作哪一个数据库
            // jdbc中 要操作的库已经包含在url中了
            // 4 创建一个可以写sql语句的地方
           pstm= con.prepareStatement( "insert into student(name,age,gender) values('苏牧',7,1)" );
            //5 写sql语句
            // 在jdbc中 该操作 包含在 创建 PreparedStatement中了
            // 6 执行sql语句 看结果
            // 如果是增删改查 则用 PreparedStatement对象调用  executeUpdate方法 返回int (受影响的行数)
            // 如果是查询 则用 PreparedStatement对象调用  executeQuery 返回ResultSet对象 (结果集)
            int i =pstm.executeUpdate();
            System.out.println(i);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(pstm!=null)
                    pstm.close();
                if(con!=null)
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
}

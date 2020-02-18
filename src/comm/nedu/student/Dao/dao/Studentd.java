package comm.nedu.student.Dao.dao;

import comm.nedu.student.Dao.pojo.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Studentd implements Studentdao {
    String url="jdbc:mysql://localhost:3306/db_cwgl?useUnicode=true&characterEncoding=utf8";
    String username="root";
    String password="123123";
    @Override
    public List<Student> query() {
        List<Student> list=new ArrayList<>(  );
        Connection con=null;
        PreparedStatement pr=null;
        ResultSet rs=null;
        try {
            //加载驱动
            Class.forName( "com.mysql.jdbc.Driver" );
            //创建连接
           con= DriverManager.getConnection( url,username,password );
            //创建写sql语句的命令行
            pr=con.prepareStatement( "select id,name,age,sex from student" );
            //执行sql语句查询的时候需要调用executeQuery方法 返回一个 ResultSet 结果集
            rs= pr.executeQuery();
            //ResultSet会调用next方法
            //如果表里没有下一行返回fasle
            //如果有返回true
            while (rs.next()){
                Student student=new Student( );
                student.setId(rs.getInt( "id" )  );
                student.setName( rs.getString( "name" ) );
                student.setAge( rs.getInt( "age" ) );
                student.setSex( rs.getInt( "sex" ) );
                list.add( student );
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
              if(rs!=null)
                 rs.close();
              if(pr!=null)
                  pr.close();
              if(con!=null)
                  con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    @Override
    public int add(Student student) {
        int i=0;
        Connection con=null;
        PreparedStatement pr=null;
        try {
            //加载驱动
            Class.forName( "com.mysql.jdbc.Driver" );
            //创建连接
            con= DriverManager.getConnection( url,username,password );
            //创建写sql语句的命令行
            pr=con.prepareStatement( "insert into student(name,age,sex) values(?,?,?)" );
            //执行sql语句查询的时候需要调用executeQuery方法 返回一个 ResultSet 结果集
            pr.setString( 1,student.getName() );
            pr.setInt( 2,student.getAge() );
            pr.setInt( 3,student.getSex() );
            i=pr.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(pr!=null)
                    pr.close();
                if(con!=null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return i;
    }

    @Override
    public int update(Student student) {
        int i=0;
        Connection con=null;
        PreparedStatement pr=null;
        try {
            //加载驱动
            Class.forName( "com.mysql.jdbc.Driver" );
            //创建连接
            con= DriverManager.getConnection( url,username,password );
            //创建写sql语句的命令行
            pr=con.prepareStatement( "update student set name=?,age=?,sex=? where id=?" );
            //执行sql语句查询的时候需要调用executeQuery方法 返回一个 ResultSet 结果集
            pr.setString( 1,student.getName() );
            pr.setInt( 2,student.getAge() );
            pr.setInt( 3, student.getSex());
            pr.setInt( 4,student.getId() );
            i=pr.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(pr!=null)
                    pr.close();
                if(con!=null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return i;
    }

    @Override
    public int del(int id) {
        int i=0;
        Connection con=null;
        PreparedStatement pr=null;
        try {
            //加载驱动
            Class.forName( "com.mysql.jdbc.Driver" );
            //创建连接
            con= DriverManager.getConnection( url,username,password );
            //创建写sql语句的命令行
            pr=con.prepareStatement( "delete from student where id=?" );
            //执行sql语句查询的时候需要调用executeQuery方法 返回一个 ResultSet 结果集
            pr.setInt( 1,id );
            i=pr.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(pr!=null)
                    pr.close();
                if(con!=null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return i;
    }
}

package com.qhit.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.CommonDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDao {
    static ComboPooledDataSource dataSource=new ComboPooledDataSource("c3p0-config.xml");
    static Connection conn=null;

    static {
        try {
            conn=dataSource.getConnection();
            if(conn!=null){
                System.out.println("数据库连接成功");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param sql 传入所要执行的sql
     * @param params 传入执行sql所需要的参数列表
     * @return 返回一个结果集
     */

    public ResultSet query(String sql,Object...params){

        ResultSet resultSet=null;

        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            for (int i = 0; i <params.length ; i++) {
                pst.setObject(i+1,params[i]);

            }
             resultSet=pst.executeQuery();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultSet;
    }



    public int updat(String sql,Object...params){

        int rs=0;
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            for (int i = 0; i <params.length ; i++) {
                pst.setObject(i+1,params[i]);

            }
             rs = pst.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public static void main(String[] args) {

    }
}

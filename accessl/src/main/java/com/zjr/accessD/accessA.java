package com.zjr.accessD;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

public class accessA {
    public static void main(String[] args) throws Exception{

       // Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        String url = "jdbc:ucanaccess://C:\\Users\\zzzz\\Documents\\mytest.accdb";
        Connection con = DriverManager.getConnection(url);//没有用户名和密码的时候直接为空
        Statement sta = con.createStatement();
        //System.out.println("alll");


//        Properties prop = new Properties();
//        prop.load(new FileInputStream("src/main/java/com/zjr/accessD/druid.properties"));
//        //4. 获取连接池对象
//        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
//
//        //5. 获取数据库连接 Connection
//        Connection connection = dataSource.getConnection();
//        System.out.println(connection); //获取到了连接后就可以继续做其他操作了

        /**
         * UPDATE Websites
         * SET alexa='5000', country='USA'
         * WHERE name='菜鸟教程';
         *
         * DELETE FROM table_name
         * WHERE some_column=some_value;
         */
        // 查找数据
        ResultSet rs = sta.executeQuery("select * from test where id = 1");

        while (rs.next()) {
            System.out.println(rs.getString("username"));
        }
        String sql1 = "delete from 学生信息表 where ID= 4";

        System.out.printf( "" + sta.executeUpdate(sql1));



    }
}

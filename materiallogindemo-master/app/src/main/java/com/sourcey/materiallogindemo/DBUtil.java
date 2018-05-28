/*
package com.sourcey.materiallogindemo;

import android.app.Activity;
import android.content.Intent;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static android.content.Intent.*;

public class DBUtil {
    private static Connection getSQLConnection(String ip, String user, String pwd, String db)
    {
        Connection con = null;
        try
        {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:jtds:sqlserver://" + ip + ":1433/" + db + ";charset=utf8", user, pwd);
        } catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        return con;
    }

    public static String QuerySQL()
    {
        String result = "";
        try
        {
            Connection conn = getSQLConnection("10.5.91.37", "sa", "123", "parkdatabase");

            System.out.println(1111111);
            System.out.println(name);
            System.out.println(carno);
            System.out.println(mobile);
            System.out.println(password);


            String sql = "insert into table_signup (name,carno,mobile,password1) values ('"+name+"','"+carno+"','"+mobile+"','"+password+"')";
            //String sql = "insert into table_signup (name,carno,mobile,password1) values (477,855,988,522)";

            Statement stmt = conn.createStatement();//
            stmt.executeQuery(sql);

            */
/*while (rs.next())
            {
                String s1 = rs.getString("mobile");
                String s2 = rs.getString("password1");
                result += s1 + "  -  " + s2 + "\n";
                System.out.println(s1 + "  -  " + s2);
            }
            rs.close();*//*

            stmt.close();
            conn.close();
        } catch (SQLException e)
        {
            e.printStackTrace();
            result += "查询数据异常!" + e.getMessage();
        }
        return result;
    }

    public static void main(String[] args)
    {
        QuerySQL();
    }
}
*/

package com.sourcey.materiallogindemo;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import butterknife.BindView;
import butterknife.ButterKnife;
import   java.text.SimpleDateFormat;

public class ParksitActivity extends AppCompatActivity {

    @BindView(R.id.park_Apply) Button _park_apply;
    @BindView(R.id.parksit_back) ImageButton _parksit_back;
   /* @BindView(R.id.imageButtonA1) Button _parker_A1;
    @BindView(R.id.imageButtonA3) Button _parker_A2;
    @BindView(R.id.imageButtonA3) Button _parker_A3;
    @BindView(R.id.imageButtonB1) Button _parker_B1;
    @BindView(R.id.imageButtonB2) Button _parker_B2;
    @BindView(R.id.imageButtonB3) Button _parker_B3;
    @BindView(R.id.imageButtonC1) Button _parker_C1;
    @BindView(R.id.imageButtonC2) Button _parker_C2;
    @BindView(R.id.imageButtonC3) Button _parker_C3;*/



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parksit);

       /* if(      ){       _parker_A1.setBackgroundColor(getColor(R.color.primary));}
        if(      ){       _parker_A2.setBackgroundColor(getColor(R.color.primary));}
        if(      ){       _parker_A3.setBackgroundColor(getColor(R.color.primary));}
        if(      ){       _parker_B1.setBackgroundColor(getColor(R.color.primary));}
        if(      ){       _parker_B2.setBackgroundColor(getColor(R.color.primary));}
        if(      ){       _parker_B3.setBackgroundColor(getColor(R.color.primary));}
        if(      ){       _parker_C1.setBackgroundColor(getColor(R.color.primary));}
        if(      ){       _parker_C2.setBackgroundColor(getColor(R.color.primary));}
        if(      ){       _parker_C3.setBackgroundColor(getColor(R.color.primary));}*/

        ButterKnife.bind(this);

        _parksit_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        _park_apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Toast.makeText(getBaseContext(), "预约成功！", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();

    }

    //测试

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

    public static String QuerySQL(String start_time)
    {
        String result = "";
        try
        {
            Connection conn = getSQLConnection("10.5.91.37", "sa", "123", "parkdatabase");

            String sql = "insert ";

            Statement stmt = conn.createStatement();//
            stmt.executeUpdate(sql);

            stmt.close();
            conn.close();
        } catch (SQLException e)
        {
            e.printStackTrace();
            result += "查询数据异常!" + e.getMessage();
        }
        return result;
    }
/*
    public static String QuerySQL_Parker()
    {
        String result = "";
        try
        {
            Connection conn = getSQLConnection("10.5.91.37", "sa", "123", "parkdatabase");

            String sql = "insert ";

            Statement stmt = conn.createStatement();//
            stmt.executeUpdate(sql);

            stmt.close();
            conn.close();
        } catch (SQLException e)
        {
            e.printStackTrace();
            result += "查询数据异常!" + e.getMessage();
        }
        return result;
    }*/


}

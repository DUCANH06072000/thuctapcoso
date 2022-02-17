package com.example.myapplication.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.myapplication.databinding.ActivityMainBinding;
import com.example.myapplication.viewmodel.DangnhapVMD;

public class MainActivity extends AppCompatActivity {


    String url = "https://luongsondinh.000webhostapp.com/dangnhap.php";
    private  ActivityMainBinding biding;
    DangnhapVMD dn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        biding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(biding.getRoot());
        dn = new DangnhapVMD();
        dangnhap();
        dangki();
    }
    public  void dangnhap()
    {
        biding.dangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String taikhoan = biding.tk.getText().toString();
                String matkhau = biding.mk.getText().toString();
                if (taikhoan.equals("")&&matkhau.equals(""))
                {
             Toast.makeText(MainActivity.this,"Vui lòng nhập đủ thông tin",Toast.LENGTH_LONG).show();
                }
                else
                {
                   dn.dangnhap(taikhoan,matkhau,url,MainActivity.this);

                }

            }
        });


    }
    public void dangki()
    {
        biding.dangki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, dangky.class));
            }
        });
    }
}
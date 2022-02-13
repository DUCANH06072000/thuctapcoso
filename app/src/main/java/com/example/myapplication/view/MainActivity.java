package com.example.myapplication.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.myapplication.databinding.ActivityMainBinding;
import com.example.myapplication.viewmodel.DangnhapVMD;

public class MainActivity extends AppCompatActivity {
    private  ActivityMainBinding biding;
    DangnhapVMD dn  = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        biding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(biding.getRoot());
        dn = new DangnhapVMD();
        dangnhap();
    }
    public  void dangnhap()
    {
        biding.dangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dn.dangnhap(MainActivity.this);
            }
        });
    }
}
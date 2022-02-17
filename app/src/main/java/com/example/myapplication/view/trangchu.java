package com.example.myapplication.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.adapter.Mainviewpage;
import com.example.myapplication.databinding.ActivityTrangchuBinding;
import com.example.myapplication.model.Datban;
import com.example.myapplication.model.Khachhang;
import com.example.myapplication.model.Sanpham;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class trangchu extends AppCompatActivity {



    ActivityTrangchuBinding binding;
    public static String tenkhach = "";
    public static String Diachi = " ";
    public static ArrayList<Datban> dulieu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTrangchuBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
       nhandulieu();
        Mainviewpage mainviewpage = new Mainviewpage(this);
        binding.myPager.setAdapter(mainviewpage);
        new TabLayoutMediator(binding.tab, binding.myPager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                    switch (position)
                    {
                        case 0:
                            tab.setText("Trang chủ");
                            break;
                        case 1:
                            tab.setText("giỏ hàng");
                            break;
                    }
            }
        }).attach();
       dulieu = new ArrayList<>();

       binding.map.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               startActivity(new Intent(trangchu.this,dinhvi.class));
           }
       });



    }
    public void nhandulieu()
    {
        Khachhang khachhang = (Khachhang)getIntent().getSerializableExtra("thongtin");
        tenkhach = khachhang.getTenkhach();
        Diachi = khachhang.getDiaChi();


    }

}
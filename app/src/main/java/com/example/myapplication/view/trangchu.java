package com.example.myapplication.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.adapter.Mainviewpage;
import com.example.myapplication.databinding.ActivityTrangchuBinding;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class trangchu extends AppCompatActivity {


    ActivityTrangchuBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTrangchuBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
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

    }
}
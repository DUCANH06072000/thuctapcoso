package com.example.myapplication.viewmodel;

import android.content.Context;
import android.content.Intent;

import com.example.myapplication.view.trangchu;

public class DangnhapVMD {
    public void dangnhap(Context context)
    {
        context.startActivity(new Intent(context, trangchu.class));


    }
}

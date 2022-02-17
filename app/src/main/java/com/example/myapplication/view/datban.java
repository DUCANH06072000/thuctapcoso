package com.example.myapplication.view;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.R;
import com.example.myapplication.adapter.AdapterDatban;
import com.example.myapplication.databinding.ActivityDatbanBinding;
import com.example.myapplication.model.Datban;

import java.util.ArrayList;

public class datban extends AppCompatActivity {

    AdapterDatban da;
    private ActivityDatbanBinding biding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        biding = ActivityDatbanBinding.inflate(getLayoutInflater());
        setContentView(biding.getRoot());
        da = new AdapterDatban(getApplication(),R.layout.ctthucdon,trangchu.dulieu);
        biding.lvban.setAdapter(da);
        da.notifyDataSetChanged();
        if (trangchu.dulieu.size()>0)
        {
            biding.textban.setVisibility(View.INVISIBLE);

        }
        else
        {
            biding.textban.setVisibility(View.VISIBLE);

        }
    }



}
package com.example.myapplication.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.myapplication.databinding.ActivityChitietbanBinding;
import com.example.myapplication.model.Ban;
import com.example.myapplication.model.Datban;
import com.squareup.picasso.Picasso;

public class Chitietban extends AppCompatActivity {
    private ActivityChitietbanBinding biding;
    int id = 0;
    String hinhanh = "";
    String soban = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        biding = ActivityChitietbanBinding.inflate(getLayoutInflater());
        setContentView(biding.getRoot());
        nhan();
        datban();
    }
    public  void nhan()
    {
        Ban ban = (Ban)getIntent().getSerializableExtra("thongtin");
        id = ban.getId();
        hinhanh = ban.getHinhanh();
        Picasso.get().load(hinhanh).into(biding.imagechitietban);
        soban = ban.getSoban();
        biding.chitietsoban.setText(soban);


    }
    public void datban()
    {
       biding.buttondatban.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               if (trangchu.dulieu.size()<=0) {
                   trangchu.dulieu.add(new Datban(id, soban, hinhanh, trangchu.tenkhach));
               }
               else
               {
                   trangchu.dulieu.add(new Datban(id, soban, hinhanh, trangchu.tenkhach));

               }
               startActivity(new Intent(Chitietban.this,datban.class));
               Toast.makeText(Chitietban.this, trangchu.tenkhach + soban, Toast.LENGTH_LONG).show();


           }

       });
    }
}
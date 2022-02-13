package com.example.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.model.Tintuc;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AdapterTin  extends RecyclerView.Adapter<AdapterTin.viewhodel> {
    private ArrayList<Tintuc> list;

    public AdapterTin(ArrayList<Tintuc> list) {
        this.list = list;

    }

    @NonNull
    @Override
    public viewhodel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view =  layoutInflater.inflate(R.layout.cttintuc,parent,false);
        return new viewhodel(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewhodel holder, int position) {
        Tintuc listtin = list.get(position);
        holder.tintuc.setText(listtin.getNoidung());
        Picasso.get().load(listtin.getAnh()).placeholder(R.drawable.ic_launcher_background).into(holder.img);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class viewhodel extends RecyclerView.ViewHolder {
        TextView tintuc;
        ImageView img;
        public viewhodel(@NonNull View itemView) {
            super(itemView);
            tintuc = itemView.findViewById(R.id.noidung);
            img = itemView.findViewById(R.id.hinhanh);
        }
    }
}

package com.example.myapplication.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.model.Sanpham;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AdapterSanpham extends RecyclerView.Adapter<AdapterSanpham.viewhodel> {
    private ArrayList<Sanpham> dulieu;

    public AdapterSanpham(ArrayList<Sanpham> dulieu) {
        this.dulieu = dulieu;
    }

    @NonNull
    @Override
    public viewhodel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view =  layoutInflater.inflate(R.layout.customsanpham,parent,false);
        return new viewhodel(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewhodel holder, int position) {
        Sanpham list = dulieu.get(position);
        holder.ten.setText(list.getTensanpham());
        holder.gia.setText(String.valueOf(list.getGia()));
        Picasso.get().load(list.getHinhanh()).placeholder(R.drawable.ic_launcher_background).into(holder.anh);

    }

    @Override
    public int getItemCount() {
        return dulieu.size();
    }

    public  static class viewhodel extends RecyclerView.ViewHolder {
        TextView gia,ten;
        ImageView anh;
        Button chitiet;
        public viewhodel(@NonNull View itemView) {
            super(itemView);
            anh = itemView.findViewById(R.id.imageviewsanpham);
            ten = itemView.findViewById(R.id.texttensanpham);
            gia = itemView.findViewById(R.id.gia);
            chitiet = itemView.findViewById(R.id.btchitiet);

        }
    }
}

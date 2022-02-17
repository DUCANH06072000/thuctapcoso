package com.example.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.model.Datban;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AdapterDatban extends BaseAdapter {
    Context context;
    int Layout;
    ArrayList<Datban> dulieu;

    public AdapterDatban(Context context, int layout, ArrayList<Datban> dulieu) {
        this.context = context;
        Layout = layout;
        this.dulieu = dulieu;
    }

    @Override
    public int getCount() {
        return dulieu.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
    class viewhodel
    {
        ImageView img;
        TextView soban,ten;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        viewhodel hodel;
        if (view==null)
        {
            hodel = new viewhodel();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(Layout,null);
            hodel.img = (ImageView) view.findViewById(R.id.iconban);
            hodel.soban = (TextView) view.findViewById(R.id.soban);
            hodel.ten = (TextView) view.findViewById(R.id.ten);
            view.setTag(hodel);

        }
        else
        {
            hodel = (viewhodel)view.getTag();
        }
        Datban ban = dulieu.get(i);
        hodel.ten.setText(ban.getTenkhachhang());
        hodel.soban.setText(ban.getSoban());
        Picasso.get().load(ban.getHinhanh()).placeholder(R.drawable.ic_launcher_background).into(hodel.img);
        return view;
    }
}

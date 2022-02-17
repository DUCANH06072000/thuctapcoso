package com.example.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.model.Ban;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AdapterBan extends BaseAdapter {
    Context context;
    int Layout;
    ArrayList<Ban> listmenu;

    public AdapterBan(Context context, int layout, ArrayList<Ban> dulieumenu) {
        this.context = context;
        Layout = layout;
        this.listmenu = dulieumenu;
    }

    @Override
    public int getCount() {
        return listmenu.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    class Viewhodel
    {
        ImageView anhlb;
        TextView Tenlb;


    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {

        Viewhodel viewhodel;
        if (view ==null)
        {
            viewhodel = new Viewhodel();
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(Layout,null);
            viewhodel.anhlb = (ImageView)view.findViewById(R.id.imglb);
            viewhodel.Tenlb = (TextView) view.findViewById(R.id.tenlb);
            view.setTag(viewhodel);
        }
        else
        {
            viewhodel = (Viewhodel) view.getTag();
        }
        Ban list = listmenu.get(position);
        Picasso.get().load(list.getHinhanh()).placeholder(R.drawable.ic_launcher_background).error(R.drawable.ic_launcher_background).into(viewhodel.anhlb);
        viewhodel.Tenlb.setText(list.getSoban());
        return view;
    }
}

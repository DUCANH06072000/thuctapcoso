package com.example.myapplication.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.adapter.AdapterTin;
import com.example.myapplication.model.Tintuc;
import com.example.myapplication.viewmodel.gettintuc;

import java.util.ArrayList;

public class tintucfrag extends Fragment {
    View view;
    RecyclerView list;
    AdapterTin da;
    ArrayList<Tintuc> dulieutin = new ArrayList<>();
    String url = "https://luongsondinh.000webhostapp.com/gettintuc.php";
    gettintuc get = null;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      view = inflater.inflate(R.layout.tintucfrag,container,false);
      get = new gettintuc();
      list = view.findViewById(R.id.tintuc);
      da = new AdapterTin(dulieutin);
      list.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        list.setLayoutManager(layoutManager);
        list.setAdapter(da);
        get.getdata(url,da,dulieutin,getActivity());
        return  view;
    }
}

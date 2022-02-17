package com.example.myapplication.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.adapter.AdapterSanpham;
import com.example.myapplication.model.Sanpham;
import com.example.myapplication.viewmodel.getsanpham;

import java.util.ArrayList;

public class sanphamfrag extends Fragment {

    String url = "https://luongsondinh.000webhostapp.com/getsanpham.php";
    getsanpham getsanpham = new getsanpham();
    ArrayList<Sanpham> dulieu = new ArrayList<>();
    AdapterSanpham da;
    RecyclerView lv;
    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {



        view= inflater.inflate(R.layout.sanphamfrag,container,false);
        lv = view.findViewById(R.id.lvsanpham);
        da = new AdapterSanpham(dulieu);
        lv.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
        lv.setLayoutManager(layoutManager);
        lv.setAdapter(da);
        getsanpham.getData(url,dulieu,da,getActivity());
        return view;
    }
}

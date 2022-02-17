package com.example.myapplication.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.myapplication.R;
import com.example.myapplication.adapter.AdapterBan;
import com.example.myapplication.model.Ban;
import com.example.myapplication.view.Chitietban;
import com.example.myapplication.viewmodel.getban;

import java.util.ArrayList;

public class giohangfrag extends Fragment {
    View view;
    ListView lv;
    ArrayList<Ban> dulieuban = new ArrayList<>();
    AdapterBan da;
    getban ban = new getban();
    String url = "https://luongsondinh.000webhostapp.com/getban.php";
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        view = inflater.inflate(R.layout.giohangfrag,container,false);
        lv = view.findViewById(R.id.ban);
        da = new AdapterBan(getActivity(),R.layout.ctban,dulieuban);
        lv.setAdapter(da);
        ban.getdata(url,da,getActivity(),dulieuban);
        click();
        return view;
    }
    public void click()
    {
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getActivity(), Chitietban.class);
                intent.putExtra("thongtin",dulieuban.get(i));
                startActivity(intent);
            }
        });
    }

}

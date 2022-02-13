package com.example.myapplication.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewFlipper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.myapplication.R;

public class quangcaofrag extends Fragment {

    View view;
    ViewFlipper quangcao;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =   inflater.inflate(R.layout.quangcaofrag,container,false);
        quangcao = view.findViewById(R.id.quangcao);
        Quangcao();
        return  view;

    }
    public void Quangcao()
    {
        quangcao.setFlipInterval(3000);
        quangcao.setAutoStart(true);
    }

}

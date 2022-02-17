package com.example.myapplication.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.myapplication.Fragment.giohangfrag;
import com.example.myapplication.Fragment.homeflag;

public class Mainviewpage extends FragmentStateAdapter {


    public Mainviewpage(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position)
        {
            case 0:
                return new homeflag();
            case 1:
                return new giohangfrag();
            default:
                return  new homeflag();

        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}

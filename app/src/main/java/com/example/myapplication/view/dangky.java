package com.example.myapplication.view;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.myapplication.R;
import com.example.myapplication.databinding.ActivityDangkyBinding;
import com.example.myapplication.databinding.ActivityMainBinding;
import com.example.myapplication.viewmodel.DangnhapVMD;

public class dangky extends AppCompatActivity {

    ActivityDangkyBinding biding;
    DangnhapVMD dn;
    String url = "https://luongsondinh.000webhostapp.com/dangky.php";
int id = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        biding = ActivityDangkyBinding.inflate(getLayoutInflater());
        setContentView(biding.getRoot());
        dn = new DangnhapVMD();
        dangky();
    }
    public void dangky()
    {

       biding.Dangky.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if (biding.txttenkhach.getText().toString().equals("")||biding.txtusername.getText().toString().equals("")||biding.txtpass.getText().toString().equals("")||biding.txtpass.equals("")||biding.txtdiachi.equals("")||biding.txtsdt.equals(""))
               {
                   Toast.makeText(dangky.this,"Vui lòng nhập đủ thông tin",Toast.LENGTH_LONG).show();
               }
               else
               {
                   dn.dangky(id,biding.txttenkhach.getText().toString(),
                           biding.txtsdt.getText().toString(),biding.txtusername.getText().toString()
                   ,biding.txtdiachi.getText().toString(),biding.txtpass.getText().toString(),url,dangky.this);
            
                   }

           }
       });
    }
}
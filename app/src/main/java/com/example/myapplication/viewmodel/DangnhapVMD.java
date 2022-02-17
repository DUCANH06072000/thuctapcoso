package com.example.myapplication.viewmodel;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.myapplication.model.Khachhang;
import com.example.myapplication.view.MainActivity;
import com.example.myapplication.view.trangchu;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DangnhapVMD {
    ArrayList<Khachhang> Dulieu= new ArrayList<>();
    public int dangnhap(String taikhoan, String matkhau, String url, Context context)
    {

        RequestQueue requestQueue = Volley.newRequestQueue(context);
        StringRequest stringRequest = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                int id=0;
                String tenkhach = "";
                String diachi = " ",sdt = " ";
                if (response !=null)
                {
                    try
                    {
                        Dulieu.clear();
                        JSONArray jsonArray = new JSONArray(response);
                        for (int i=0;i<jsonArray.length();i++)
                        {
                            JSONObject object = jsonArray.getJSONObject(i);
                            id = object.getInt("id");
                            tenkhach = object.getString("tenkhach");
                            diachi = object.getString("diachi");
                            sdt = object.getString("sdt");
                            Dulieu.add(new Khachhang(id,tenkhach,taikhoan,matkhau,diachi,sdt));
                            Toast.makeText(context,tenkhach+"\t"+diachi,Toast.LENGTH_LONG).show();
                            Intent intent = new Intent(context,trangchu.class);
                            intent.putExtra("thongtin",Dulieu.get(i));
                            context.startActivity(intent);
                        }

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                if (response.equals("thatbai"))
                {
                    Toast.makeText(context,"Đăng nhập thất bại",Toast.LENGTH_LONG).show();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(context,error.toString(),Toast.LENGTH_LONG).show();

            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> param = new HashMap<>();
                param.put("taikhoan",taikhoan);
                param.put("matkhau",matkhau);
                return param;
            }
        };
        requestQueue.add(stringRequest);

        return 0;
    }
    public void dangky(int id,String ten,String sdt,String tk,String diachi,String matkhau,String url,Context context)
    {
        RequestQueue requestQueue = Volley.newRequestQueue(context);
        StringRequest stringRequest = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                if (response.equals("thanhcong"))
                {
                    Dulieu.add(new Khachhang(id,ten,tk,matkhau,diachi,sdt));
                    Toast.makeText(context,"Đăng kí thành công",Toast.LENGTH_LONG).show();
                    context.startActivity(new Intent(context, MainActivity.class));
                }
                else  if (response.equals("thatbai"))
                {
                    Toast.makeText(context,"đăng kí thất bại",Toast.LENGTH_LONG).show();

                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> param = new HashMap<>();
                param.put("taikhoan",tk);
                param.put("matkhau",matkhau);
                param.put("ten",ten);
                param.put("diachi",diachi);
                param.put("sdt",sdt);
                return param;
            }
        };
        requestQueue.add(stringRequest);
    }

}

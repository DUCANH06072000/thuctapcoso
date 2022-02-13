package com.example.myapplication.viewmodel;

import android.content.Context;

import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.example.myapplication.adapter.AdapterTin;
import com.example.myapplication.model.Tintuc;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class gettintuc {

    public void getdata(String url, AdapterTin da, ArrayList<Tintuc> dulieu, Context context)
    {
        RequestQueue requestQueue = Volley.newRequestQueue(context);
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.POST, url, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                dulieu.clear();
                for (int i=0;i<response.length();i++)
                {
                    try {
                        JSONObject object = response.getJSONObject(i);
                        dulieu.add(new Tintuc(
                                object.getInt(("id"))
                                ,object.getString("hinhanh")
                                ,object.getString("tintuc")
                        ));

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                da.notifyDataSetChanged();

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }

        });
        requestQueue.add(jsonArrayRequest);
    }

}

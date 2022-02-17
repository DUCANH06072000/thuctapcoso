package com.example.myapplication.viewmodel;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.example.myapplication.adapter.AdapterBan;
import com.example.myapplication.model.Ban;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class getban {

    public  void getdata(String url , AdapterBan da, Context context,ArrayList<Ban> dulieu)
    {
        RequestQueue requestQueue = Volley.newRequestQueue(context);
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, url, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                dulieu.clear();
                for (int i=0;i<response.length();i++)
                {
                    try {
                        JSONObject object = response.getJSONObject(i);
                        dulieu.add(new Ban(
                                object.getInt("id"),
                                object.getString("tenban"),
                                object.getString("hinhanh")

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

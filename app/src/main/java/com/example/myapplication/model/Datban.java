package com.example.myapplication.model;

import java.io.Serializable;

public class Datban implements Serializable {
    int id;
    String soban;
    String hinhanh;
    String Tenkhachhang;

    public Datban(int id, String soban, String hinhanh, String tenkhachhang) {


        this.id = id;
        this.soban = soban;
        this.hinhanh = hinhanh;
        Tenkhachhang = tenkhachhang;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSoban() {
        return soban;
    }

    public void setSoban(String soban) {
        this.soban = soban;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }

    public String getTenkhachhang() {
        return Tenkhachhang;
    }

    public void setTenkhachhang(String tenkhachhang) {
        Tenkhachhang = tenkhachhang;
    }


}

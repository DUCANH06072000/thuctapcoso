package com.example.myapplication.model;

import java.io.Serializable;

public class Sanpham implements Serializable {
    int id;
    String hinhanh,tensanpham;
    int gia;

    public Sanpham(int id, String hinhanh, String tensanpham, int gia) {
        this.id = id;
        this.hinhanh = hinhanh;
        this.tensanpham = tensanpham;
        this.gia = gia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }

    public String getTensanpham() {
        return tensanpham;
    }

    public void setTensanpham(String tensanpham) {
        this.tensanpham = tensanpham;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
}

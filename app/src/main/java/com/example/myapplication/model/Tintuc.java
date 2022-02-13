package com.example.myapplication.model;

public class Tintuc {
    int id;
    String anh;
    String noidung;

    public Tintuc(int id, String anh, String noidung) {
        this.id = id;
        this.anh = anh;
        this.noidung = noidung;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }
}

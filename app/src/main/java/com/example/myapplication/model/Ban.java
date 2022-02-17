package com.example.myapplication.model;

import java.io.Serializable;

public class Ban implements Serializable {
    int id;
    String soban,hinhanh;

    public Ban(int id, String soban, String hinhanh) {
        this.id = id;
        this.soban = soban;
        this.hinhanh = hinhanh;
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
}

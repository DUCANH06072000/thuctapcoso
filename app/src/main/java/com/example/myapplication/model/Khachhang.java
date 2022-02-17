package com.example.myapplication.model;

import java.io.Serializable;

public class Khachhang implements Serializable {
    int id;
    String Tenkhach,Taikhoan,Matkhau,DiaChi,sdt;

    public Khachhang(int id, String tenkhach, String taikhoan, String matkhau, String diaChi, String sdt) {
        this.id = id;
        Tenkhach = tenkhach;
        Taikhoan = taikhoan;
        Matkhau = matkhau;
        DiaChi = diaChi;
        this.sdt = sdt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenkhach() {
        return Tenkhach;
    }

    public void setTenkhach(String tenkhach) {
        Tenkhach = tenkhach;
    }

    public String getTaikhoan() {
        return Taikhoan;
    }

    public void setTaikhoan(String taikhoan) {
        Taikhoan = taikhoan;
    }

    public String getMatkhau() {
        return Matkhau;
    }

    public void setMatkhau(String matkhau) {
        Matkhau = matkhau;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
}

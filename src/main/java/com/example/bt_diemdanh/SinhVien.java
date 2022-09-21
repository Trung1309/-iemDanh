package com.example.bt_diemdanh;

public class SinhVien {
    private String ten,lop,msv;

    public SinhVien(String ten, String lop, String msv) {
        this.ten = ten;
        this.lop = lop;
        this.msv = msv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }
}

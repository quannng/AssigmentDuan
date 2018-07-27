package com.example.quanganh.assigmentduan;

public class Student {
//    public String Key;
    public String ten;
    public Integer tuoi;
    public String sdt;
    public Double diemToan;
    public Double diemVan;
    public Double diemTrungBinh;

    public Student(String ten, Integer tuoi, String sdt, Double diemToan, Double diemVan, Double diemTrungBinh) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.sdt = sdt;
        this.diemToan = diemToan;
        this.diemVan = diemVan;
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public Double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(Double diemToan) {
        this.diemToan = diemToan;
    }

    public Double getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(Double diemVan) {
        this.diemVan = diemVan;
    }

    public Double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(Double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }
}

package com.example.irfan.adt.jawaban;

import com.example.irfan.adt.ArrayList.Murid;

import java.util.ArrayList;

public class Siswa
{
 private String nama;
 private double nilai;

    public Siswa(String nama,double nilai) {
        this.setNama(nama);
        this.setNilai(nilai);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        nama = nama;
    }

    public double getNilai() {
        return nilai;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }
}

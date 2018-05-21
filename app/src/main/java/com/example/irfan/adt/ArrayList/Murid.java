package com.example.irfan.adt.ArrayList;

public class Murid{
    private String nama;
    private int kelas;
    private int umur;

    public Murid(String nama,int kelas,int umur){
        this.setNama(nama);
        this.setKelas(kelas);
        this.setUmur(umur);
    }


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getKelas() {
        return kelas;
    }

    public void setKelas(int kelas) {
        this.kelas = kelas;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}

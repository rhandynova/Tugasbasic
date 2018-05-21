package com.example.irfan.adt.Percabangan;

public class Predikatlulus {
    public static void main(String[] args) {
        String predikat = "";
        int nilai = 80;

        if (nilai >= 80 && nilai < 100) {
            predikat = "Sangat Baik";
        } else if (nilai >= 70 && nilai < 80) {
            predikat = "Baik";
        } else if (nilai >= 60 && nilai < 70) {
            predikat = "cukup";
        }
        else{
            predikat = "kurang";
        }
        System.out.println(predikat);
    }
}

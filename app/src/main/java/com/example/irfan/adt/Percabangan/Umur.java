package com.example.irfan.adt.Percabangan;

public class Umur {
    public static void main(String[] args) {
        String kategory = "";
        int Umur = 20;
        if (Umur >= 0 && Umur <= 1) {
            kategory = "Bayi";
        } else if (Umur > 1 && Umur <= 3) {
            kategory = "Batita";
        } else if (Umur > 3 && Umur <= 5) {
            kategory = "Balita";

        }else if (Umur>5 && Umur <=12){
            kategory ="anak-anak";

        }else if (Umur>12 && Umur<=17){
            kategory ="Remaja";

        }else if (Umur>17 && Umur<=30){
            kategory ="Pemuda";

        }else if (Umur>30 && Umur<=60){
            kategory ="Dewasa";

        }
        else {
            kategory="Lansia";

        }
        System.out.println(kategory);
    }
}






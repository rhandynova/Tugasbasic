package com.example.irfan.adt.Percabangan;

public class Switch {
    public static void main(String[] args) {
        int bulan = 12;
        switch (bulan)
        {
            case 1:
                System.out.println("Januari");
                break;
            case 2:
                System.out.println("Februari");
                break;
            case 3:
                System.out.println("Maret");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("Mei");
                break;
            case 6:
                System.out.println("Juni");
                break;
            case 7:
                System.out.println("Juli");
                break;
            case 8:
                System.out.println("Agustus");
                break;
            case 9:
                System.out.println("September");
                break;
            default:
                System.out.println("tidak ada bulan");
                break;
        }
    }
}

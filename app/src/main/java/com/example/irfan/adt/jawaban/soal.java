package com.example.irfan.adt.jawaban;


import java.util.ArrayList;
import java.util.Arrays;

public class soal {
    public static void main(String[] args) {
//        int vasbunga;
//        vasbunga = 100;
//        System.out.print(vasbunga);
        barang();
    }

    public static void barang(){
        double hargabarang=100000;
        double diskon=(5/100) * hargabarang;
        double duabarang=20000;
        double uang=200000;

        double totalbelanja=hargabarang+duabarang-diskon;
        double kembalian=uang-totalbelanja;

        System.out.print(kembalian);



    }
}

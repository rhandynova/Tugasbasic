package com.example.irfan.adt.jawaban;
import java.util.ArrayList;

public class Tampil {
    public static void main(String[] args) {
        ArrayList<Siswa> nama = new ArrayList<Siswa>();
        double jumlah_nilai = 0;

        nama.add(new Siswa("aldy", 94));
        nama.add(new Siswa("alif", 81));
        nama.add(new Siswa("budi", 80.6));
        nama.add(new Siswa("joko", 77.5));
        nama.add(new Siswa("alfi", 90));

        for(int i=0;i<nama.size();i++)
        {
            jumlah_nilai += nama.get(i).getNilai();
        }
        System.out.print(jumlah_nilai/nama.size());
    }
}
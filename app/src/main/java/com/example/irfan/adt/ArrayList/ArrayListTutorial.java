package com.example.irfan.adt.ArrayList;

import java.util.ArrayList;

public class ArrayListTutorial {
    static int i;
    public static void main(String[] args) {
        ArrayList nilai = new ArrayList();
        ArrayList<Murid> murid = new ArrayList<Murid>();

        nilai.add(1);
        nilai.add(2);
        nilai.add(5);
        nilai.add(4);

        System.out.print(nilai.toString());
        murid.add(new Murid("irfan",10,10));
        murid.add(new Murid("dsadsa",2,2));

//        for(Murid murid1: murid)
//        {
//            System.out.println("Murid ke");
//            System.out.println(murid1.getNama());
//            System.out.println(murid1.getKelas());
//            System.out.println(murid1.getUmur());
//        }

        for (i=0;i<murid.size();i++)
        {
            System.out.println("Murid ke");
            System.out.println(murid.get(i).getNama());
            System.out.println(murid.get(i).getKelas());
            System.out.println(murid.get(i).getUmur());
        }
    }
}

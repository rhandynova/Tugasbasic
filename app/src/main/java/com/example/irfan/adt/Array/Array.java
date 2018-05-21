package com.example.irfan.adt.Array;

import java.util.Arrays;

public class Array {
    static int[] nilai = new int[3];
    static int[] nilai2 = new int[10];
    static int i = 0;
    public static void main(String[] args) {
        nilai[0] = 1;
        nilai[1] = 2;
        nilai[2] = 3;
        //nilai[3] = 4;

        for(i=0;i<9;i++){
            nilai2[i] = i+1;
        }

        System.out.print(Arrays.toString(nilai));
        System.out.print(Arrays.toString(nilai2));
    }
}

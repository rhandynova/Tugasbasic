package com.example.irfan.adt.Array;

public class Conditional {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        boolean result;
        result = a < b; // true
        System.out.println(a < b);

        result = a > b; // false
        System.out.println(a > b);

        result = a <= 4; // a smaller or equal to 4 - true
        System.out.println(a <= 4);

        result = b >= 6; // b bigger or equal to 6 - false
        System.out.println(b >= 6);

        result = a == b; // a equal to b - false
        System.out.println(a == b);

        result = a != b; // a is not equal to b - true
        System.out.println(a != b);

        result = a > b || a < b; // Logical or - true
        System.out.println(a > b || a < b);


        result = 3 < a && a < 6; // Logical and - true
        System.out.println(3 < a && a < 6);


    }
}



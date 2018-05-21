package com.example.irfan.adt.Percabangan;

public class Ifelse {
    public static void main(String[] args) {
       double totalbelanjaan = 20000;
        Boolean laper = false;
        String makan = "";
       if(totalbelanjaan<10000)
       {
           System.out.println("hemat");
       }
       else if(totalbelanjaan>=10000 && totalbelanjaan<1000000)
       {
           System.out.println("biasa");
       }
       else{
           System.out.println("boros");
       }



       if(laper==true)
       {
          makan = "gw makan";
       }
       else{
           makan = "gw dah kenyang";
       }
    }
}

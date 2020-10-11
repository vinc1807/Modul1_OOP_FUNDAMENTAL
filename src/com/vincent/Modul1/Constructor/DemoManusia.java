package com.vincent.Modul1.Constructor;

public class DemoManusia {
    public static void main(String[] args) {
        Manusia arrayManusia[] = new Manusia[3];

        Manusia manusia1 = new Manusia();//Constructor pertama
        manusia1.setNama("Vincent");
        manusia1.setUmur(21);

        Manusia manusia2 = new Manusia("Nathaniel");//Constructor 2
        Manusia manusia3 = new Manusia("Cenn", 19);//Constructor 3
        arrayManusia[0] = manusia1;
        arrayManusia[1] = manusia2;
        arrayManusia[2] = manusia3;

        for(Manusia x : arrayManusia){
            System.out.println("Character " );
            System.out.println("Nama\t: " + x.getNama());
            System.out.println("Umur\t: " + x.getUmur());
        }
    }
}

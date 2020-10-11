package com.vincent.Modul1.Class;

public class Kelas {

    private static String nama = "paimon";

    private static int setMinute(){
        int minute = 10;
        return minute;
    }

    public static void main(String[] args) {
        System.out.println("Nama\t: " + nama);
        System.out.println("Menit\t: " +setMinute());
    }
}

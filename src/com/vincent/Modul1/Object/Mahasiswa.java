package com.vincent.Modul1.Object;


public class Mahasiswa {
    String nama;
    int nim;

    //constructor 1
     public Mahasiswa(){}



     //Constructor 2
    public Mahasiswa(String nama, int nim){
        this.nama = nama;
        this.nim = nim;
    }

    //getter & setter
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public int getNim(){
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }
}

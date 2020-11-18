package com.tugasPBO;
/*
Nama        : Argya Aulia Fauzandika
NIM         : 10119035
Kelas       : PBO1 / IF1
Deskripsi   : menampilkan isi dari child class yang mengextends
              parent class serta menerapkan overrding
* */

public class Main {
    public static void main(String[] args){
        Dosen dosen = new Dosen();
        Mahasiswa mahasiswa = new Mahasiswa();

        System.out.println("NIP Dosen : "+ dosen.getNip());
        dosen.siapaKamu();
        dosen.mengajarApa();
        System.out.println();

        System.out.println("NIM Mahasiswa : "+mahasiswa.getNim());
        mahasiswa.siapaKamu();
        mahasiswa.kelasApa();

    }
}

package com.tugasPBO;

public class Mahasiswa extends Manusia {
    private String nim;
    private String kelas;

    public String getNim() {
        return "10119035";
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void kelasApa(){
        System.out.println("Saya Argya umur 19 tahun sedang belajar di kelas PBO1");
    }

    @Override
    public void siapaKamu(){
        System.out.println("Saya Mahasiswa");
    }
}

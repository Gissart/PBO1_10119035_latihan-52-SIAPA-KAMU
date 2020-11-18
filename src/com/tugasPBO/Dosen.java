package com.tugasPBO;

public class Dosen extends Manusia {
    private String nip, matakuliah;

    public String getNip(){
        return "41227829930";
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMatakuliah() {
        return matakuliah;
    }

    public void setMatakuliah(String matakuliah) {
        this.matakuliah = matakuliah;
    }

    public void mengajarApa(){
        System.out.println("Saya Rizki Adam Kurniawan umur 27 tahun sedang mengajar matakuliah PBO");
    }

    @Override
    public void siapaKamu(){
        System.out.println("Saya Dosen");
    }
}

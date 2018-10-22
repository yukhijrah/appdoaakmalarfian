package com.example.techinasia888.kumpulanhadist.model;




/**
 * Created by techinasia888 on 10/22/18.
 */

public class Doa {

    private int ikon;
    private String judul;
    private String ayat;
    private String arti;

    public Doa(String judul, String Ayat, String Arti, int ikon) {
        this.judul = judul;
        this.ikon = ikon;
        this.ayat = ayat;
        this.arti = arti;

    }

    public String getJudul(){
        return judul;
    }
    public void setJudul(String judul){
        this.judul= judul;
    }

    public String getAyat(){
        return ayat;
    }
    public void setAyat(String ayat){
        this.ayat= ayat;
    }

    public String getArti(){
        return arti;
    }
    public void setArti(String Arti){
        this.arti= arti;
    }

    public int getIkon() {
        return ikon;
    }

    public void setIkon(int ikon) {
        this.ikon = ikon;
    }
}

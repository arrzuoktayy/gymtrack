package com.example.gymtrack.model;

import jakarta.persistence.*;

@Entity
public class Antrenman {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String egzersizAdi;
    private String kasGrubu;
    private int setSayisi;
    private int tekrarSayisi;

    public Antrenman() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEgzersizAdi() {
        return egzersizAdi;
    }

    public void setEgzersizAdi(String egzersizAdi) {
        this.egzersizAdi = egzersizAdi;
    }

    public String getKasGrubu() {
        return kasGrubu;
    }

    public void setKasGrubu(String kasGrubu) {
        this.kasGrubu = kasGrubu;
    }

    public int getSetSayisi() {
        return setSayisi;
    }

    public void setSetSayisi(int setSayisi) {
        this.setSayisi = setSayisi;
    }

    public int getTekrarSayisi() {
        return tekrarSayisi;
    }

    public void setTekrarSayisi(int tekrarSayisi) {
        this.tekrarSayisi = tekrarSayisi;
    }
}
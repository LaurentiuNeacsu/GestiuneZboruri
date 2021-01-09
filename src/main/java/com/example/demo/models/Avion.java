package com.example.demo.models;

public class Avion {
    private long avionID;
    private String nume;
    private int capacitate;
    private long companieAerianaID;
//    private int vechime;
//    private boolean isVerificatTehnic;

    public Avion(String nume, int capacitate, long companieAerianaID) {
        this.nume = nume;
        this.capacitate = capacitate;
        this.companieAerianaID = companieAerianaID;
    }

    public long getAvionID() {
        return avionID;
    }
}

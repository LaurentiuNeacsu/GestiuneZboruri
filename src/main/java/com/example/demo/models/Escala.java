package com.example.demo.models;

public class Escala {
    private long escalaID;
    private long zborID;
    private Locatie locatie;

    public Escala() {
    }

    public Escala(long escalaID, long zborID, Locatie locatie) {
        this.escalaID = escalaID;
        this.zborID = zborID;
        this.locatie = locatie;
    }

    public Escala(long zborID, Locatie locatie) {
        this.zborID = zborID;
        this.locatie = locatie;
    }

    public long getEscalaID() {
        return escalaID;
    }

    public long getZborID() {
        return zborID;
    }

    public Locatie getLocatie() {
        return locatie;
    }

    @Override
    public String toString() {
        return "Escala{" +
                "escalaID=" + escalaID +
                ", zborID=" + zborID +
                ", locatieID=" + locatie +
                '}';
    }
}
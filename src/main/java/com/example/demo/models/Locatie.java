package com.example.demo.models;

public class Locatie {
    private long locatieID;
    private String numeAeroport;
    private String oras;
    private String tara;

    public Locatie() {

    }

    public Locatie(String numeAeroport, String oras, String tara) {
        this.numeAeroport = numeAeroport;
        this.oras = oras;
        this.tara = tara;
    }

    public Locatie(long locatieID, String numeAeroport, String oras, String tara) {
        this.locatieID = locatieID;
        this.numeAeroport = numeAeroport;
        this.oras = oras;
        this.tara = tara;
    }

    public long getLocatieID() {
        return locatieID;
    }

    public String getNumeAeroport() {
        return numeAeroport;
    }

    public String getOras() {
        return oras;
    }
    public String getTara() {
        return tara;
    }

    @Override
    public String toString() {
        return "Locatie{" +
                "locatieID=" + locatieID +
                ", numeAeroport='" + numeAeroport + '\'' +
                ", oras='" + oras + '\'' +
                ", tara='" + tara + '\'' +
                '}';
    }
}
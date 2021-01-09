package com.example.demo.models;

public class Locatie {
    private long locatieID;
    private String numeAeroport;
    private String oras;
    private String tara;

    public Locatie(String numeAeroport, String oras, String tara) {
        this.numeAeroport = numeAeroport;
        this.oras = oras;
        this.tara = tara;
    }

    public long getLocatieID() {
        return locatieID;
    }

    public void setLocatieID(int locatieID) {
        this.locatieID = locatieID;
    }

    public String getNumeAeroport() {
        return numeAeroport;
    }

    public void setNumeAeroport(String numeAeroport) {
        this.numeAeroport = numeAeroport;
    }

    public String getOras() {
        return oras;
    }

    public void setOras(String oras) {
        this.oras = oras;
    }

    public String getTara() {
        return tara;
    }

    public void setTara(String tara) {
        this.tara = tara;
    }
}
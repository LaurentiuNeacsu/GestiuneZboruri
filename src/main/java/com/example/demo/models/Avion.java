package com.example.demo.models;

public class Avion {
    private int avionID;
    private String nume;
    private int capacitate;
    private CompanieAeriana companieAeriana;
    private int vechime;
    private boolean isVerificatTehnic;

    public Avion(String nume, int capacitate, CompanieAeriana companieAeriana) {
        this.nume = nume;
        this.capacitate = capacitate;
        this.companieAeriana = companieAeriana;
    }

    public int getAvionID() {
        return avionID;
    }

    public void setAvionID(int avionID) {
        this.avionID = avionID;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getCapacitate() {
        return capacitate;
    }

    public void setCapacitate(int capacitate) {
        this.capacitate = capacitate;
    }

    public CompanieAeriana getCompanieAeriana() {
        return companieAeriana;
    }

    public void setCompanieAeriana(CompanieAeriana companieAeriana) {
        this.companieAeriana = companieAeriana;
    }

    public int getVechime() {
        return vechime;
    }

    public void setVechime(int vechime) {
        this.vechime = vechime;
    }

    public boolean isVerificatTehnic() {
        return isVerificatTehnic;
    }

    public void setVerificatTehnic(boolean verificatTehnic) {
        isVerificatTehnic = verificatTehnic;
    }
}

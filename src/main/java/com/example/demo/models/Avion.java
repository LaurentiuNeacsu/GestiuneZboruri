package com.example.demo.models;

public class Avion {
    private long avionID;
    private String nume;
    private int capacitate;
    private long companieID;
    private boolean areCursa;

    public Avion() {
    }

    public Avion(String nume, int capacitate, boolean areCursa) {
        this.nume = nume;
        this.capacitate = capacitate;
        this.areCursa = areCursa;
    }

    public Avion(String nume, int capacitate, long companieID, boolean areCursa) {
        this.nume = nume;
        this.capacitate = capacitate;
        this.companieID = companieID;
        this.areCursa = areCursa;
    }

    public Avion(long avionID, String nume, int capacitate, boolean areCursa) {
        this.avionID = avionID;
        this.nume = nume;
        this.capacitate = capacitate;
        this.areCursa = areCursa;
    }

    public Avion(long avionID, String nume, int capacitate, long companieID, boolean areCursa) {
        this.avionID = avionID;
        this.nume = nume;
        this.capacitate = capacitate;
        this.companieID = companieID;
        this.areCursa = areCursa;
    }

    public long getAvionID() {
        return avionID;
    }

    public String getNume() {
        return nume;
    }

    public int getCapacitate() {
        return capacitate;
    }

    public long getCompanieID() {
        return companieID;
    }

    public boolean getAreCursa() {
        return areCursa;
    }

    @Override
    public String toString() {
        return "Avion{" +
                " nume='" + nume + '\'' +
                ", capacitate=" + capacitate +
                ", companieAerianaID=" + companieID +
                '}';
    }
}

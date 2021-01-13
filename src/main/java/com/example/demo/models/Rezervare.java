package com.example.demo.models;

public class Rezervare {
    private long rezervareID;
    private long zborID;
    private long clientID;
    private double pret;

    public Rezervare() {
    }

    public Rezervare(long zborID, long clientID, double pret) {
        this.zborID = zborID;
        this.clientID = clientID;
        this.pret = pret;
    }

    public Rezervare(long rezervareID, long zborID, long clientID, double pret) {
        this.rezervareID = rezervareID;
        this.zborID = zborID;
        this.clientID = clientID;
        this.pret = pret;
    }

    public long getRezervareID() {
        return rezervareID;
    }

    public long getZborID() {
        return zborID;
    }

    public long getClientID() {
        return clientID;
    }

    public double getPret() {
        return pret;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "rezervareID=" + rezervareID +
                ", zborID=" + zborID +
                ", clientID=" + clientID +
                ", pret=" + pret +
                '}';
    }
}
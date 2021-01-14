package com.example.demo.models;

import javax.validation.constraints.Min;

public class Rezervare {
    private long rezervareID;
    @Min(1)
    private long zborID;
    @Min(1)
    private long clientID;
    @Min(1)
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
                " zborID=" + zborID +
                ", clientID=" + clientID +
                ", pret=" + pret +
                '}';
    }
}
package com.example.demo.models;

public class Rezervare {
    private long rezervareID;
    private Zbor zbor;
    private Client client;
    private double pret;
    private double discount;

    public Rezervare(Zbor zbor, Client client, double pret, double discount) {
        this.zbor = zbor;
        this.client = client;
        this.pret = pret;
        this.discount = discount;
    }

    public long getRezervareID() {
        return rezervareID;
    }

    public void setRezervareID(int rezervareID) {
        this.rezervareID = rezervareID;
    }

    public Zbor getZbor() {
        return zbor;
    }

    public void setZbor(Zbor zbor) {
        this.zbor = zbor;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
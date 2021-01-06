package com.example.demo.models;

import com.example.demo.utils.TipRezervare;

public class Rezervare {
    private int rezervareID;
    private Zbor zbor;
    private Client client;
    private TipRezervare tipRezervare;
    private double pret;
    private double discount;

    public Rezervare(Zbor zbor, Client client, TipRezervare tipRezervare, double pret, double discount) {
        this.zbor = zbor;
        this.client = client;
        this.tipRezervare = tipRezervare;
        this.pret = pret;
        this.discount = discount;
    }

    public int getRezervareID() {
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

    public TipRezervare getTipRezervare() {
        return tipRezervare;
    }

    public void setTipRezervare(TipRezervare tipRezervare) {
        this.tipRezervare = tipRezervare;
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
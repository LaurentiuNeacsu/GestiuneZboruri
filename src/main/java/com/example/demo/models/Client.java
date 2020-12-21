package com.example.demo.models;

import com.example.demo.utils.TipPersoana;

public class Client {
    private int clientID;
    private String nume;
    private String prenume;
    private String CNP;
    private String email;
    private String nrTelefon;
    private String adresa;
    private TipPersoana tipPersoana;

    public Client(int clientID, String nume, String prenume, String CNP, String email, String nrTelefon, String adresa, TipPersoana tipPersoana) {
        this.clientID = clientID;
        this.nume = nume;
        this.prenume = prenume;
        this.CNP = CNP;
        this.email = email;
        this.nrTelefon = nrTelefon;
        this.adresa = adresa;
        this.tipPersoana = tipPersoana;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getCNP() {
        return CNP;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public void setNrTelefon(String nrTelefon) {
        this.nrTelefon = nrTelefon;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public TipPersoana getTipPersoana() {
        return tipPersoana;
    }

    public void setTipPersoana(TipPersoana tipPersoana) {
        this.tipPersoana = tipPersoana;
    }
}

package com.example.demo.models;

public class CompanieAeriana {
    private int companieID;
    private String numeCompanie;

    public CompanieAeriana(String numeCompanie) {
        this.numeCompanie = numeCompanie;
    }

    public int getCompanieID() {
        return companieID;
    }

    public void setCompanieID(int companieID) {
        this.companieID = companieID;
    }

    public String getNumeCompanie() {
        return numeCompanie;
    }

    public void setNumeCompanie(String numeCompanie) {
        this.numeCompanie = numeCompanie;
    }
}

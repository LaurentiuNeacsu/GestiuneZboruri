package com.example.demo.models;

public class CompanieAeriana {
    private long companieID;
    private String numeCompanie;

    public CompanieAeriana() {

    }

    public CompanieAeriana(String numeCompanie) {
        this.numeCompanie = numeCompanie;
    }

    public long getCompanieID() {
        return companieID;
    }

    public String getNumeCompanie() {
        return numeCompanie;
    }

    @Override
    public String toString() {
        return "CompanieAeriana{" +
                "companieID=" + companieID +
                ", numeCompanie='" + numeCompanie + '\'' +
                '}';
    }
}

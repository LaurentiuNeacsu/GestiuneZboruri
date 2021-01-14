package com.example.demo.models;

import javax.validation.constraints.NotEmpty;

public class CompanieAeriana {
    private long companieID;
    @NotEmpty
    private String numeCompanie;

    public CompanieAeriana() {

    }

    public CompanieAeriana(String numeCompanie) {
        this.numeCompanie = numeCompanie;
    }

    public CompanieAeriana(long companieID, String numeCompanie) {
        this.companieID = companieID;
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
                " numeCompanie='" + numeCompanie + '\'' +
                '}';
    }
}

package com.example.demo.models;

import java.util.Date;

public class Zbor {
    private long zborID;
    private long companieAerianaID;
    private long avionID;
    private long locatiePlecareID;
    private long locatieSosireID;
    private int tipZborID;
    private Date dataPlecare;
    private Date dataSosire;

    public Zbor() {
    }

    public Zbor(long companieAerianaID,
                long avionID,
                long locatiePlecareID,
                long locatieSosireID,
                int tipZborID,
                Date dataPlecare,
                Date dataSosire) {
        this.companieAerianaID = companieAerianaID;
        this.avionID = avionID;
        this.locatiePlecareID = locatiePlecareID;
        this.locatieSosireID = locatieSosireID;
        this.tipZborID = tipZborID;
        this.dataPlecare = dataPlecare;
        this.dataSosire = dataSosire;
    }

    public long getZborID() {
        return zborID;
    }

    public long getCompanieAerianaID() {
        return companieAerianaID;
    }

    public long getAvionID() {
        return avionID;
    }

    public long getLocatiePlecareID() {
        return locatiePlecareID;
    }

    public long getLocatieSosireID() {
        return locatieSosireID;
    }

    public int getTipZborID() {
        return tipZborID;
    }

    public Date getDataPlecare() {
        return dataPlecare;
    }

    public Date getDataSosire() {
        return dataSosire;
    }
}
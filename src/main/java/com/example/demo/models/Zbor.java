package com.example.demo.models;

import java.time.LocalDateTime;

public class Zbor {
    private long zborID;
    private long companieAerianaID;
    private long avionID;
    private long locatiePlecareID;
    private long locatieSosireID;
    private LocalDateTime dataPlecare;
    private LocalDateTime dataSosire;

    public Zbor() {
    }

    public Zbor(long zborID,
                long companieAerianaID,
                long avionID,
                long locatiePlecareID,
                long locatieSosireID,
                LocalDateTime dataPlecare,
                LocalDateTime dataSosire) {
        this.zborID = zborID;
        this.companieAerianaID = companieAerianaID;
        this.avionID = avionID;
        this.locatiePlecareID = locatiePlecareID;
        this.locatieSosireID = locatieSosireID;
        this.dataPlecare = dataPlecare;
        this.dataSosire = dataSosire;
    }

    public Zbor(long companieAerianaID,
                long avionID,
                long locatiePlecareID,
                long locatieSosireID,
                LocalDateTime dataPlecare,
                LocalDateTime dataSosire) {
        this.companieAerianaID = companieAerianaID;
        this.avionID = avionID;
        this.locatiePlecareID = locatiePlecareID;
        this.locatieSosireID = locatieSosireID;
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

    public LocalDateTime getDataPlecare() {
        return dataPlecare;
    }

    public LocalDateTime getDataSosire() {
        return dataSosire;
    }

    @Override
    public String toString() {
        return "Zbor{" +
                " companieAerianaID=" + companieAerianaID +
                ", avionID=" + avionID +
                ", locatiePlecareID=" + locatiePlecareID +
                ", locatieSosireID=" + locatieSosireID +
                ", dataPlecare=" + dataPlecare +
                ", dataSosire=" + dataSosire +
                '}';
    }
}
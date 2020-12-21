package com.example.demo.models;

import com.example.demo.utils.TipZbor;
import java.util.Date;
import java.util.List;

public class Zbor {
    private int zborID;
    private int companieID;
    private Avion avion;
    private Locatie locatiePlecare;
    private Locatie locatieSosire;
    private TipZbor tipZbor;
    private Date dataPlecare;
    private Date dataSosire;

    public Zbor() {
    }

    public Zbor(int zborID, int companieID, Avion avion, Locatie locatiePlecare, Locatie locatieSosire, List<Locatie> listaEscale, TipZbor tipZbor, Date dataPlecare, Date dataSosire) {
        this.zborID = zborID;
        this.companieID = companieID;
        this.avion = avion;
        this.locatiePlecare = locatiePlecare;
        this.locatieSosire = locatieSosire;
        this.tipZbor = tipZbor;
        this.dataPlecare = dataPlecare;
        this.dataSosire = dataSosire;
    }

    public int getZborID() {
        return zborID;
    }

    public void setZborID(int zborID) {
        this.zborID = zborID;
    }

    public int getCompanieID() {
        return companieID;
    }

    public void setCompanieID(int companieID) {
        this.companieID = companieID;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Locatie getLocatiePlecare() {
        return locatiePlecare;
    }

    public void setLocatiePlecare(Locatie locatiePlecare) {
        this.locatiePlecare = locatiePlecare;
    }

    public Locatie getLocatieSosire() {
        return locatieSosire;
    }

    public void setLocatieSosire(Locatie locatieSosire) {
        this.locatieSosire = locatieSosire;
    }

    public TipZbor getTipRezervare() {
        return tipZbor;
    }

    public void setTipRezervare(TipZbor tipRezervare) {
        this.tipZbor = tipRezervare;
    }

    public Date getDataPlecare() {
        return dataPlecare;
    }

    public void setDataPlecare(Date dataPlecare) {
        this.dataPlecare = dataPlecare;
    }

    public Date getDataSosire() {
        return dataSosire;
    }

    public void setDataSosire(Date dataSosire) {
        this.dataSosire = dataSosire;
    }
}
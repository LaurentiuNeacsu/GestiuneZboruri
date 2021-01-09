package com.example.demo.request_templates;

import com.example.demo.models.Avion;
import com.example.demo.models.CompanieAeriana;
import com.example.demo.models.Locatie;
import com.example.demo.utils.TipZbor;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class ZborRequest {
    @NotNull
    private CompanieAeriana companieAeriana;
    @NotNull
    private Avion avion;
    @NotNull
    private Locatie locatiePlecare;
    @NotNull
    private Locatie locatieSosire;
    @NotNull
    private TipZbor tipZbor;
    @Future
    private Date dataPlecare;
    @Future
    private Date dataSosire;

    public ZborRequest(@NotNull CompanieAeriana companieAeriana,
                       @NotNull Avion avion,
                       @NotNull Locatie locatiePlecare,
                       @NotNull Locatie locatieSosire,
                       @NotNull TipZbor tipZbor,
                       @Future Date dataPlecare,
                       @Future Date dataSosire) {
        this.companieAeriana = companieAeriana;
        this.avion = avion;
        this.locatiePlecare = locatiePlecare;
        this.locatieSosire = locatieSosire;
        this.tipZbor = tipZbor;
        this.dataPlecare = dataPlecare;
        this.dataSosire = dataSosire;
    }

    public CompanieAeriana getCompanieAeriana() {
        return companieAeriana;
    }

    public Avion getAvion() {
        return avion;
    }

    public Locatie getLocatiePlecare() {
        return locatiePlecare;
    }

    public Locatie getLocatieSosire() {
        return locatieSosire;
    }

    public TipZbor getTipZbor() {
        return tipZbor;
    }

    public Date getDataPlecare() {
        return dataPlecare;
    }

    public Date getDataSosire() {
        return dataSosire;
    }
}
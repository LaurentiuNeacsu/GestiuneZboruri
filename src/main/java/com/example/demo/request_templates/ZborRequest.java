package com.example.demo.request_templates;

import com.example.demo.models.Avion;
import com.example.demo.models.CompanieAeriana;
import com.example.demo.models.Locatie;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

public class ZborRequest {
    @NotNull
    private CompanieAeriana companieAeriana;
    @NotNull
    private Avion avion;
    @NotNull
    private Locatie locatiePlecare;
    @NotNull
    private Locatie locatieSosire;
    @Future
    @JsonFormat(pattern = "YYYY-MM-dd HH:mm")
    private LocalDateTime dataPlecare;
    @Future
    @JsonFormat(pattern = "YYYY-MM-dd HH:mm")
    private LocalDateTime dataSosire;

    public ZborRequest(@NotNull CompanieAeriana companieAeriana,
                       @NotNull Avion avion,
                       @NotNull Locatie locatiePlecare,
                       @NotNull Locatie locatieSosire,
                       @Future LocalDateTime dataPlecare,
                       @Future LocalDateTime dataSosire) {
        this.companieAeriana = companieAeriana;
        this.avion = avion;
        this.locatiePlecare = locatiePlecare;
        this.locatieSosire = locatieSosire;;
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

    public LocalDateTime getDataPlecare() {
        return dataPlecare;
    }

    public LocalDateTime getDataSosire() {
        return dataSosire;
    }
}
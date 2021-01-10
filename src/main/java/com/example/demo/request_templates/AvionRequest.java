package com.example.demo.request_templates;

import com.example.demo.models.CompanieAeriana;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class AvionRequest {
    @NotEmpty
    private String nume;
    @Min(1)
    private int capacitate;
    @NotNull
    private CompanieAeriana companieAeriana;
    public AvionRequest(@NotEmpty String nume, @Min(1) int capacitate, @NotNull CompanieAeriana companieAeriana) {
        this.nume = nume;
        this.capacitate = capacitate;
        this.companieAeriana = companieAeriana;
    }

    public String getNume() {
        return nume;
    }

    public int getCapacitate() {
        return capacitate;
    }

    public CompanieAeriana getCompanieAeriana() {
        return companieAeriana;
    }
}

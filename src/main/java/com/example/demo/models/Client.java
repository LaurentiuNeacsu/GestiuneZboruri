package com.example.demo.models;

import javax.validation.constraints.NotEmpty;

public class Client {
    private long clientID;
    @NotEmpty
    private String nume;
    @NotEmpty
    private String prenume;
    @NotEmpty
    private String cnp;

    public Client() {
    }

    public Client(String nume, String prenume, String cnp) {
        this.nume = nume;
        this.prenume = prenume;
        this.cnp = cnp;
    }

    public Client(long clientID, String nume, String prenume, String cnp) {
        this.clientID = clientID;
        this.nume = nume;
        this.prenume = prenume;
        this.cnp = cnp;
    }

    public long getClientID() {
        return clientID;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getCnp() {
        return cnp;
    }

    @Override
    public String toString() {
        return "Client{" +
                " nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", CNP='" + cnp + '\'' +
                '}';
    }
}

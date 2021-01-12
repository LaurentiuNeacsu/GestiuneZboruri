package com.example.demo.models;

public class Client {
    private long clientID;
    private String nume;
    private String prenume;
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
                "clientID=" + clientID +
                ", nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", CNP='" + cnp + '\'' +
                '}';
    }
}

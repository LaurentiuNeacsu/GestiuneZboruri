package com.example.demo.queries;

public class ClientQueries {
    public static final String INSERT_CLIENT = "INSERT INTO tblclient(nume, prenume, CNP) VALUES (?, ?, ?)";
    public static final String SELECT_ALL_CLIENTI = "SELECT clientID, nume, prenume, cnp FROM tblclient";
    public static final String SELECT_CLIENT_BY_ID = "SELECT clientID, nume, prenume, cnp FROM tblclient WHERE clientID = ?";
    public static final String SELECT_CLIENT_BY_NUME = "SELECT clientID, nume, prenume, cnp FROM tblclient WHERE nume = ?";
    public static final String DELETE_CLIENT_BY_ID = "DELETE FROM tblclient WHERE clientID = ?";
}

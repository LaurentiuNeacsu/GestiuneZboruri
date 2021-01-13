package com.example.demo.queries;

public class RezervareQueries {
    public static final String INSERT_REZERVARE = "INSERT INTO tblrezervare(zborID, clientID, pret) VALUES(?, ?, ?)";
    public static final String SELECT_REZERVARE_BY_CLIENT_NUME =
            "SELECT rezervareID, zborID, tblrezervare.clientID, pret " +
            "FROM tblrezervare INNER JOIN " +
            "     tblclient ON tblclient.clientID = tblrezervare.clientID " +
            "WHERE nume = ?";
}

package com.example.demo.queries;

public class EscalaQueries {
    public static final String INSERT_ESCALA = "INSERT INTO tblescala(zborID, locatieID) VALUES(?, ?)";
    public static final String SELECT_ESCALA_BY_ZBOR =
            "SELECT escalaID, zborID, tblescala.locatieID, numeAeroport, oras, tara " +
            "FROM tblescala INNER JOIN " +
                    "tbllocatie ON tbllocatie.locatieID = tblescala.locatieID " +
            "WHERE zborID = ?";
    public static final String DELETE_ESCALA_BY_ID = "DELETE FROM tblescala WHERE escalaID = ?";
}
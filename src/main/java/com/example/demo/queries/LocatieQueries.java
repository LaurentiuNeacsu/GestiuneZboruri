package com.example.demo.queries;

public class LocatieQueries {
    public static final String INSERT_LOCATIE = "INSERT INTO tbllocatie(numeAeroport, oras, tara) VALUES(?, ?, ?)";
    public static final String SELECT_ALL_LOCATII = "SELECT * FROM tbllocatie";
    public static final String SELECT_LOCATIE_BY_AIRPORTNAME = "SELECT locatieID FROM tbllocatie WHERE numeAeroport LIKE '%?%'";
}

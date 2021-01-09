package com.example.demo.queries;

public class LocatieQueries {
    public static final String SELECT_LOCATIE_BY_AIRPORTNAME = "SELECT locatieID, numeAeroport, oras, tara FROM tbllocatie WHERE numeAeroport LIKE '%?%'";
}

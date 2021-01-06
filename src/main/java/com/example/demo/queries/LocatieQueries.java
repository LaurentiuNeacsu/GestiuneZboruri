package com.example.demo.queries;

public class LocatieQueries {
    public static final String SELECT_COMPANIE_BY_AIRPORTNAME = "SELECT locatieID, numeAeroport, oras FROM tbllocatie WHERE numeAeroport LIKE '%?%'";
}

package com.example.demo.queries;

public class LocatieQueries {
    public static final String SELECT_ALL_COMPANII = "SELECT * FROM tbllocatie";
    public static final String SELECT_COMPANIE_BY_NAME = "SELECT locatieID FROM tbllocatie WHERE oras LIKE '%?%'";
}

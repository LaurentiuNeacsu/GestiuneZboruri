package com.example.demo.queries;

public class CompanieAerianaQueries {
    public static final String SELECT_ALL_COMPANII = "SELECT * FROM tblCompanie";
    public static final String SELECT_COMPANIE_BY_NAME = "SELECT companieID FROM tblcompanie WHERE numeCompanie LIKE '%?%'";
}

package com.example.demo.queries;

public class AvionQueries {
    public static final String INSERT_AVION = "INSERT INTO tblavion(nume, capacitate, companieID, areCursa) VALUES (?, ?, ?, ?)";
    public static final String SELECT_AVIOANE_BY_COMPANY_AND_AVAILABILITY =
                    "SELECT avionID, nume, capacitate, areCursa " +
                    "FROM tblavion INNER JOIN tblcompanie ON tblcompanie.companieID = tblavion.companieID " +
                    "WHERE numeCompanie = ? AND areCursa = 0";
}

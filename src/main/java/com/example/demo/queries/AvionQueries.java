package com.example.demo.queries;

public class AvionQueries {
    public static final String INSERT_AVION = "INSERT INTO tblavion(nume, capacitate, companieID, areCursa) VALUES (?, ?, ?, ?)";
    public static final String SELECT_AVIOANE_BY_COMPANY_AND_AVAILABILITY =
                    "SELECT avionID, tblavion.companieID, nume, capacitate, areCursa " +
                    "FROM tblavion INNER JOIN tblcompanie ON tblcompanie.companieID = tblavion.companieID " +
                    "WHERE numeCompanie = ? AND areCursa = 0";
    public static final String UPDATE_AVION_AVAILABILITY = "UPDATE tblavion SET areCursa = 1 WHERE avionID = ?";
    public static final String DELETE_AVION_BY_ID = "DELETE FROM tblavion WHERE avionID = ?";
}

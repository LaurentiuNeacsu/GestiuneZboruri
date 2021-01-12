package com.example.demo.queries;

public class ZborQueries {
    public static final String INSERT_ZBOR =
            "INSERT INTO tblzbor(companieID, avionID, locatiePlecareID, locatieSosireID, dataPlecare, dataSosire) " +
            "VALUES(?, ?, ?, ?, ?, ?)";
    public static final String SELECT_ALL_ZBORURI =
            "SELECT tblzbor.zborID, " +
                    "tblcompanie.companieID, " +
                    "tblcompanie.numeCompanie, " +
                    "tblavion.avionID, " +
                    "tblavion.nume, " +
                    "tblavion.capacitate, " +
                    "tblavion.companieID, " +
                    "tblavion.areCursa, " +
                    "tbllocatiePlecare.numeAeroport AS 'numeAeroportPlecare', " +
                    "tbllocatiePlecare.oras AS 'orasPlecare', " +
                    "tbllocatiePlecare.tara AS 'taraPlecare', " +
                    "tbllocatieSosire.numeAeroport AS 'numeAeroportSosire', " +
                    "tbllocatieSosire.oras AS 'orasSosire', " +
                    "tbllocatieSosire.tara AS 'taraSosire', " +
                    "tblzbor.dataPlecare, " +
                    "tblzbor.dataSosire " +
                    "FROM tblzbor INNER JOIN tblcompanie ON tblcompanie.companieID = tblzbor.companieID " +
                    "INNER JOIN tblavion ON tblavion.avionID = tblzbor.avionID " +
                    "INNER JOIN tbllocatie AS tbllocatiePlecare ON tbllocatiePlecare.locatieID = tblzbor.locatiePlecareID " +
                    "INNER JOIN tbllocatie AS tbllocatieSosire ON tbllocatieSosire.locatieID = tblzbor.locatieSosireID";
    public static final String EDIT_ZBOR =
            "UPDATE tblzbor " +
            "SET companieID = ?, " +
            "SET avionID = ?, " +
            "SET zborTipID = ?, " +
            "SET locatiePlecareID = ?, " +
            "SET locatieSosireID = ?, " +
            "SET dataPlecarte = ?, " +
            "SET dataSosire = ?, " +
            "WHERE zborID = ?";
    public static final String DELETE_ZBOR = "DELETE FROM tblzbor WHERE zborID = ?";
}

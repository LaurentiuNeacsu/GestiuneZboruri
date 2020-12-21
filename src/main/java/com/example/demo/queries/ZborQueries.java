package com.example.demo.queries;

public class ZborQueries {
    public static final String SELECT_ALL_ZBORURI =
            "SELECT tblzbor.zborID, " +
                    "tblcompanie.numeCompanie, " +
                    "tblavion.nume, " +
                    "tblavion.capacitate, " +
                    "tblavion.vechime, " +
                    "tblavion.isVerificatTehnic, " +
                    "tblzborTip.zborTip, " +
                    "tbllocatiePlecare.numeAeroport, " +
                    "tbllocatiePlecare.oras, " +
                    "tbllocatiePlecare.tara, " +
                    "tbllocatieSosire.numeAeroport, " +
                    "tbllocatieSosire.oras, " +
                    "tbllocatieSosire.tara, " +
                    "tblzbor.dataPlecare, " +
                    "tblzbor.dataSosire " +
                    "FROM tblzbor INNER JOIN tblcompanie ON tblcompanie.companieID = tblzbor.companieID " +
                    "INNER JOIN tblavion ON tblavion.avionID = tblzbor.avionID " +
                    "INNER JOIN tbllocatie AS tbllocatiePlecare ON tbllocatiePlecare.locatieID = tblzbor.locatiePlecareID " +
                    "INNER JOIN tbllocatie AS tbllocatieSosire ON tbllocatieSosire.locatieID = tblzbor.locatieSosireID";
    public static final String ADD_ZBOR = "INSERT INTO tblzbor(companieID, avionID, zborTipID, locatiePlecareID, locatieSosireID, dataPlecare, dataSosire)" +
                                          "VALUES(?, ?, ?, ?, ?, ?, ?)";
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

package com.example.demo.queries;

public class AvionQueries {
    public static final String SELECT_AVIOANE_BY_COMPANY =
                    "SELECT  avionID, " +
                            "nume, " +
                            "capacitate, " +
                            "vechime, " +
                            "isVerificatTehnic " +
                    "FROM tblavion" +
                    "WHERE companieID = (SELECT companieID FROM tblcompanie WHERE numeCompanie LIKE '%?%')";
}

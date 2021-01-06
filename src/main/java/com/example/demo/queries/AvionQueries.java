package com.example.demo.queries;

public class AvionQueries {
    public static final String SELECT_AVION_BY_NAME_AND_COMPANY=
                    "SELECT  avionID, " +
                    "FROM tblavion" +
                    "WHERE companieID = (SELECT companieID FROM tblcompanie WHERE numeCompanie LIKE '%?%') AND nume LIKE '%?%'";
}

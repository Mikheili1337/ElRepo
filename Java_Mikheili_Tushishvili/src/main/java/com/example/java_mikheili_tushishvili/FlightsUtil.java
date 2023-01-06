package com.example.java_mikheili_tushishvili;

import java.sql.SQLException;

public class FlightsUtil {

    public static void createTable(){
        String crateSql = "CREATE TABLE FLIGHTS("+
                "ID INTEGER NOT NULL AUTO_INCREMENT,"+
                "DESTINATION VARCHAR(255),"+
                "FLIGHT_DATE VARCHAR(255),"+
                "NUMBER_OF_SEATS INTEGER NOT NULL,"+
                "PRICE INTEGER NOT NULL,"+
                "PRIMARY KEY(ID))";
        try {
            JDBCUtil.getStatement().executeUpdate(crateSql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Table crated successfully");
    }

    public static void insert(Flights flights){

        String insertSql = "INSERT INTO FLIGHTS(DESTINATION,FLIGHT_DATE,NUMBER_OF_SEATS,PRICE) VALUES("+
                "'"+ flights.getDestination()+"',"+
                "'"+ flights.getFlightDate()+"',"+
                "'"+ flights.getNumbOfSeats()+"',"+
                ""+flights.getPrice()+")";
        try {
            JDBCUtil.getStatement().executeUpdate(insertSql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Flight added");
    }

    public static void deleteFlight(Integer ID){
        String deleteSql = "DELETE FROM FLIGHTS WHERE ID='"+ID+"'";
        try {
            JDBCUtil.getStatement().executeUpdate(deleteSql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Flight Deleted");
    }

}

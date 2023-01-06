package com.example.java_mikheili_tushishvili;

public class Flights {

    private Long id;

    private String destination;

    private String flightDate;

    private Integer numbOfSeats;

    private Integer price;

    public Flights(Long id, String destination, String flightDate, Integer numbOfSeats, Integer price) {
        this.id = id;
        this.destination = destination;
        this.flightDate = flightDate;
        this.numbOfSeats = numbOfSeats;
        this.price = price;
    }

    public Flights(String destination, String flightDate, Integer numbOfSeats, Integer price) {
        this.destination = destination;
        this.flightDate = flightDate;
        this.numbOfSeats = numbOfSeats;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }

    public Integer getNumbOfSeats() {
        return numbOfSeats;
    }

    public void setNumbOfSeats(Integer numbOfSeats) {
        this.numbOfSeats = numbOfSeats;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "com.example.java_mikheili_tushishvili.Flights{" +
                "id=" + id +
                ", destination='" + destination + '\'' +
                ", flightDate='" + flightDate + '\'' +
                ", numbOfSeats=" + numbOfSeats +
                ", price=" + price +
                '}';
    }
}

package org.enactor.commonlibrary.model;

import java.util.Map;

public class Bus implements Vehicle{
    private int noOfSeats;
    private int vehicleNum;
    private int seatsPerRow;
    private String origin;
    private String destination;
    private Map<String,Double> priceList;
    private Map<Integer,DayTurn> dayTurnMap;

    private String type;

    public Bus()
    {

    }

    public Bus(int noOfSeats, int vehicleNum, int seatsPerRow, String origin, String destination, Map<String,Double> priceList, Map<Integer,DayTurn> dayTurnMap )
    {
        this.noOfSeats = noOfSeats;
        this.vehicleNum = vehicleNum;
        this.seatsPerRow = seatsPerRow;
        this.origin = origin;
        this.destination = destination;
        this.priceList = priceList;
        this.dayTurnMap = dayTurnMap;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public int getVehicleNum() {
        return vehicleNum;
    }

    public void setVehicleNum(int vehicleNum) {
        this.vehicleNum = vehicleNum;
    }

    public int getSeatsPerRow() {
        return seatsPerRow;
    }

    public void setSeatsPerRow(int seatsPerRow) {
        this.seatsPerRow = seatsPerRow;
    }
    public Map<Integer, DayTurn> getDayTurnMap() {
        return dayTurnMap;
    }

    public void setDayTurnMap(Map<Integer, DayTurn> dayTurnMap) {
        this.dayTurnMap = dayTurnMap;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Map<String, Double> getPriceList() {
        return priceList;
    }

    public void setPriceList(Map<String, Double> priceList) {
        this.priceList = priceList;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

package org.enactor.commonlibrary.model;

import java.time.LocalDate;

public class ReservationCriteria
{
    private String origin;
    private String destination;
    private Integer paxCount;
    private VehicleType vehicleType;
    private String vehicleNum;
    private LocalDate date;
    private  Integer turn;

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

    public Integer getPaxCount() {
        return paxCount;
    }

    public void setPaxCount(Integer paxCount) {
        this.paxCount = paxCount;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleNum() {
        return vehicleNum;
    }

    public void setVehicleNum(String vehicleNum) {
        this.vehicleNum = vehicleNum;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getTurn() {
        return turn;
    }

    public void setTurn(Integer turn) {
        this.turn = turn;
    }
}

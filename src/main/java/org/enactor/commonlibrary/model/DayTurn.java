package org.enactor.commonlibrary.model;

import java.time.LocalTime;

public class DayTurn
{
    private int turnNo;
    private LocalTime arrivalTime;
    private LocalTime departTime;

    public DayTurn()
    {

    }

    public DayTurn(int turnNo, LocalTime arrivalTime, LocalTime departTime)
    {
        this.turnNo = turnNo;
        this.arrivalTime = arrivalTime;
        this.departTime = departTime;
    }

    public int getTurnNo() {
        return turnNo;
    }

    public void setTurnNo(int turnNo) {
        this.turnNo = turnNo;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public LocalTime getDepartTime() {
        return departTime;
    }

    public void setDepartTime(LocalTime departTime) {
        this.departTime = departTime;
    }
}


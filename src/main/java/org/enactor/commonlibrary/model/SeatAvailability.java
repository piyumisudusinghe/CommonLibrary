package org.enactor.commonlibrary.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.enactor.commonlibrary.util.CustomObjectMapper;

public class SeatAvailability
{
    private Integer totalSeats;
    private Integer availableSeats;

    private Vehicle vehicle;

    public SeatAvailability()
    {
    }

    public SeatAvailability(Integer totalSeats, Integer availableSeats, Vehicle vehicle)
    {
        this.setTotalSeats(totalSeats);
        this.setAvailableSeats(availableSeats);
        this.setVehicle(vehicle);
    }

    public Integer getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(Integer totalSeats) {
        this.totalSeats = totalSeats;
    }

    public Integer getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(Integer availableSeats) {
        this.availableSeats = availableSeats;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public static SeatAvailability fromJson(String json) throws Exception {
        ObjectMapper objectMapper = CustomObjectMapper.getObjectMapper();
        return objectMapper.readValue(json, SeatAvailability.class);
    }
}

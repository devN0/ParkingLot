package com.example.parkinglot.models;

import com.example.parkinglot.models.enums.ParkingSpotStatus;
import com.example.parkinglot.models.enums.SpotType;

public class ParkingSpot extends BaseModel {
    private int spotNumber;
    private SpotType spotType;
    private ParkingSpotStatus parkingSpotStatus;

    public int getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    public SpotType getSpotType() {
        return spotType;
    }

    public void setSpotType(SpotType spotType) {
        this.spotType = spotType;
    }

    public ParkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }
}

package com.example.parkinglot.models;

import com.example.parkinglot.models.enums.ParkingSpotStatus;
import com.example.parkinglot.models.enums.SpotType;

public class ParkingSpot extends BaseModel {
    private int spotNumber;
    private SpotType spotType;
    private ParkingSpotStatus parkingSpotStatus;
}

package com.example.parkinglot.strategies.parkingSpotFindingStrategies;

import com.example.parkinglot.models.ParkingLot;
import com.example.parkinglot.models.ParkingSpot;
import com.example.parkinglot.models.enums.VehicleType;

public interface ParkingSpotFindingStrategy {
    ParkingSpot getAvailableParkingSpot(VehicleType vehicleType, ParkingLot parkingLot);
}

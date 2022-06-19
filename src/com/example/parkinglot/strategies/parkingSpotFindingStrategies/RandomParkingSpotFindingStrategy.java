package com.example.parkinglot.strategies.parkingSpotFindingStrategies;

import com.example.parkinglot.models.ParkingFloor;
import com.example.parkinglot.models.ParkingLot;
import com.example.parkinglot.models.ParkingSpot;
import com.example.parkinglot.models.enums.ParkingSpotStatus;
import com.example.parkinglot.models.enums.SpotType;
import com.example.parkinglot.models.enums.VehicleType;
import com.example.parkinglot.services.SpotVehicleMatchingService;

public class RandomParkingSpotFindingStrategy implements ParkingSpotFindingStrategy{
    SpotVehicleMatchingService spotVehicleMatchingService;
    public RandomParkingSpotFindingStrategy(SpotVehicleMatchingService spotVehicleMatchingService){
        this.spotVehicleMatchingService = spotVehicleMatchingService;
    }

    @Override
    public ParkingSpot getAvailableParkingSpot(VehicleType vehicleType, ParkingLot parkingLot) {
        for(ParkingFloor parkingFloor : parkingLot.getParkingFloors()){
            for(ParkingSpot parkingSpot : parkingFloor.getParkingSpots()){
                if(parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.AVAILABLE) && spotVehicleMatchingService.matches(parkingSpot.getSpotType(), vehicleType)){
                    return parkingSpot;
                }
            }
        }
        return null;
    }
}

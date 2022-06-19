package com.example.parkinglot.services;

import com.example.parkinglot.models.enums.SpotType;
import com.example.parkinglot.models.enums.VehicleType;

public class SpotVehicleMatchingService {
    public boolean matches(SpotType spotType, VehicleType vehicleType){
        if(spotType.equals(SpotType.SMALL)){
            return vehicleType.equals(VehicleType.SMALL);
        }
        else if(spotType.equals(SpotType.MEDIUM)){
            return vehicleType.equals(VehicleType.MEDIUM);
        }
        else if(spotType.equals(SpotType.LARGE)){
            return vehicleType.equals(VehicleType.LARGE);
        }
        else if(spotType.equals(SpotType.ELECTRIC)){
            return vehicleType.equals(VehicleType.ELECTRIC);
        }
        return false;
    }
}

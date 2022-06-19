package com.example.parkinglot.repositories;

import com.example.parkinglot.models.EntryGate;
import com.example.parkinglot.models.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository {
    Map<Long, ParkingLot> idParkingLotMap = new HashMap(); // indexing for id
    Map<EntryGate, ParkingLot> entryGateParkingLotMap = new HashMap(); // indexing for entryGate

    public void save(ParkingLot parkingLot){
        idParkingLotMap.put(parkingLot.getId(), parkingLot);
//        this is why creating multiple indexes slows down your DB writes.
        for(EntryGate entryGate : parkingLot.getEntryGates()){
            entryGateParkingLotMap.put(entryGate, parkingLot);
        }
    }

    public ParkingLot getParkingLotForId(Long id){
        if(idParkingLotMap.containsKey(id)){
            return idParkingLotMap.get(id);
        }
        return null;
    }

    public ParkingLot getParkingLotForEntryGate(EntryGate gate){
        if(entryGateParkingLotMap.containsKey(gate)){
            return entryGateParkingLotMap.get(gate);
        }
        return null;
    }
}

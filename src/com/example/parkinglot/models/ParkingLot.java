package com.example.parkinglot.models;

import java.util.List;

public class ParkingLot extends BaseModel{
    private List<ParkingFloor> parkingFloors;
    private String address;
    private List<EntryGate> entryGates;
    private List<ExitGate> exitGates;

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<EntryGate> getEntryGates() {
        return entryGates;
    }

    public void setEntryGates(List<EntryGate> entryGates) {
        this.entryGates = entryGates;
    }

    public List<ExitGate> getExitGates() {
        return exitGates;
    }

    public void setExitGates(List<ExitGate> exitGates) {
        this.exitGates = exitGates;
    }
}

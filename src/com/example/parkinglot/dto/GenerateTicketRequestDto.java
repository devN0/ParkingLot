package com.example.parkinglot.dto;

import com.example.parkinglot.models.EntryGate;
import com.example.parkinglot.models.Vehicle;

public class GenerateTicketRequestDto {
    private Vehicle vehicle;
    private EntryGate entryGate;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public EntryGate getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(EntryGate entryGate) {
        this.entryGate = entryGate;
    }
}

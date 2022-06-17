package com.example.parkinglot.models;

public class Ticket extends BaseModel {
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private String EntryTime;
    private EntryGate entryGate;
    private Operator generatedBy;
}

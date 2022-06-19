package com.example.parkinglot.services;

import com.example.parkinglot.models.EntryGate;
import com.example.parkinglot.models.ParkingSpot;
import com.example.parkinglot.models.Ticket;
import com.example.parkinglot.models.Vehicle;
import com.example.parkinglot.repositories.ParkingLotRepository;
import com.example.parkinglot.strategies.parkingSpotFindingStrategies.ParkingSpotFindingStrategy;

import java.util.Date;

public class TicketService {
    private ParkingSpotFindingStrategy parkingSpotFindingStrategy;
    private ParkingLotRepository parkingLotRepository;
    public TicketService(ParkingSpotFindingStrategy parkingSpotFindingStrategy, ParkingLotRepository parkingLotRepository){
        this.parkingSpotFindingStrategy = parkingSpotFindingStrategy;
        this.parkingLotRepository = parkingLotRepository;
    }

    public Ticket generateTicket(Vehicle vehicle, EntryGate entryGate) {
        ParkingSpot parkingSpot = parkingSpotFindingStrategy.getAvailableParkingSpot(vehicle.getVehicleType(), parkingLotRepository.getParkingLotForEntryGate(entryGate));
//        we can get the instance of parkingLot from the entryGate via DB

        Ticket ticket = new Ticket();
        ticket.setEntryGate(entryGate);
        ticket.setVehicle(vehicle);
        ticket.setParkingSpot(parkingSpot);
        ticket.setEntryTime(new Date().toString());
        ticket.setGeneratedBy(entryGate.getOperator()); // we should use builder for ticket
//        once spot is assigned, we also need to update that spot as unavailable and also update in DB

        return ticket;
    }
}

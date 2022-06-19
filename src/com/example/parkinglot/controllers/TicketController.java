package com.example.parkinglot.controllers;

import com.example.parkinglot.dto.GenerateTicketRequestDto;
import com.example.parkinglot.dto.GenerateTicketResponseDto;
import com.example.parkinglot.models.Ticket;
import com.example.parkinglot.services.TicketService;

public class TicketController {
    private TicketService ticketService;
    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }
    public GenerateTicketResponseDto generateTicket(GenerateTicketRequestDto generateTicketRequestDto) {
        Ticket ticket = ticketService.generateTicket(generateTicketRequestDto.getVehicle(), generateTicketRequestDto.getEntryGate());
        GenerateTicketResponseDto generateTicketResponseDto = new GenerateTicketResponseDto();
        generateTicketResponseDto.setTicket(ticket);
        return generateTicketResponseDto;
    }
}

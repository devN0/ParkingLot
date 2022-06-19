package com.example.parkinglot.dto;

import com.example.parkinglot.models.Ticket;

public class GenerateTicketResponseDto {
    private Ticket ticket;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}

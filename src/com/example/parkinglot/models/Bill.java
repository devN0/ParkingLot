package com.example.parkinglot.models;

import com.example.parkinglot.models.enums.PaymentStatus;

public class Bill extends BaseModel {
    private Ticket ticket;
    private int amount;
    private ExitGate exitGate;
    private String ExitTime;
    private Operator generatedBy;
    private Payment payment;
    private PaymentStatus paymentStatus;
}

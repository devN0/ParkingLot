package com.example.parkinglot.models;

import com.example.parkinglot.models.enums.GateType;

public abstract class Gate extends BaseModel {
    private int gateNumber;
    private GateType gateType;
    private Operator operator;
}

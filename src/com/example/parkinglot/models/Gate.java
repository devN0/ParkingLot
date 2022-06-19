package com.example.parkinglot.models;

import com.example.parkinglot.models.enums.GateType;

public abstract class Gate extends BaseModel {
    private int gateNumber;
    private GateType gateType;
    private Operator operator;

    public int getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}

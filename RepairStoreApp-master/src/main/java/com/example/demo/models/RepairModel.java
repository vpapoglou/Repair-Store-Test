package com.example.demo.models;

import com.example.demo.domain.Owner;

import java.time.LocalDateTime;

public class RepairModel {
    private Long repairID;
    private String description;
    private LocalDateTime registrationDayOfRepair;
    private LocalDateTime finishDayOfRepair;
    private String repairStatus;
    private String repairType;
    private Double serviceCost;
    private String plateNumber;
    private Owner owner;

    public Long getRepairID() {
        return repairID;
    }

    public void setRepairID(Long repairID) {
        this.repairID = repairID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getRegistrationDayOfRepair() {
        return registrationDayOfRepair;
    }

    public void setRegistrationDayOfRepair(LocalDateTime registrationDayOfRepair) {
        this.registrationDayOfRepair = registrationDayOfRepair;
    }

    public LocalDateTime getFinishDayOfRepair() {
        return finishDayOfRepair;
    }

    public void setFinishDayOfRepair(LocalDateTime finishDayOfRepair) {
        this.finishDayOfRepair = finishDayOfRepair;
    }

    public String getRepairStatus() {
        return repairStatus;
    }

    public void setRepairStatus(String repairStatus) {
        this.repairStatus = repairStatus;
    }

    public String getRepairType() {
        return repairType;
    }

    public void setRepairType(String repairType) {
        this.repairType = repairType;
    }

    public Double getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(Double serviceCost) {
        this.serviceCost = serviceCost;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public Owner getOwner() {
        return owner;
    }

    public RepairModel(Long repairID, String description, LocalDateTime registrationDayOfRepair, LocalDateTime finishDayOfRepair, String repairStatus, String repairType, Double serviceCost, String plateNumber, Owner owner) {
        this.repairID = repairID;
        this.description = description;
        this.registrationDayOfRepair = registrationDayOfRepair;
        this.finishDayOfRepair = finishDayOfRepair;
        this.repairStatus = repairStatus;
        this.repairType = repairType;
        this.serviceCost = serviceCost;
        this.plateNumber = plateNumber;
        this.owner = owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }


}

package com.example.demo.domain;

import java.time.LocalDateTime;
import javax.persistence.*;


@Entity
@Table(name = "Repairs")
public class Repair {


    @Id
    @Column(name = "repairId", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long repairID;


    @Column(name = "description", length = 255)
    private String description;


    @Column(name = "registrationDayOfRepair")
    private LocalDateTime registrationDayOfRepair;

    @Column(name = "finishDayOfRepair")
    private LocalDateTime finishDayOfRepair;

    @Column(name = "repairStatus")
    private String repairStatus;


    @Column(name = "repairType", length = 30)
    private String repairType;

    @Column(name="serviceCost",precision=10, scale=2)
    private Double serviceCost;

    @Column(name = "plateNumber",length = 8, unique = true)
    private String plateNumber;

    @ManyToOne(optional=false, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name="ownerId",referencedColumnName="ownerId")
    private Owner owner;

    @Override
    public String toString() {
        return "Repair{" +
                "repairID=" + repairID +
                ", description='" + description + '\'' +
                ", registrationDayOfRepair=" + registrationDayOfRepair +
                ", finishDayOfRepair=" + finishDayOfRepair +
                ", repairStatus='" + repairStatus + '\'' +
                ", repairType='" + repairType + '\'' +
                ", serviceCost=" + serviceCost +
                ", plateNumber='" + plateNumber + '\'' +
                ", owner=" + owner +
                '}';
    }

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

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}





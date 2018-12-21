package com.example.demo.mappers;

import com.example.demo.domain.Repair;
import com.example.demo.forms.RepairForm;
import org.springframework.stereotype.Component;

@Component
public class RepairToRepairFormMapper {

    public RepairForm convertRepair(Repair repair) {
        return new RepairForm(
                repair.getRepairID(),
                repair.getDescription(),
                repair.getRegistrationDayOfRepair(),
                repair.getFinishDayOfRepair(),
                repair.getRepairStatus(),
                repair.getRepairType(),
                repair.getServiceCost(),
                repair.getPlateNumber(),
                repair.getOwner().getId());
    }
}


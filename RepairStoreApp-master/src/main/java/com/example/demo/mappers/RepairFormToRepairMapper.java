package com.example.demo.mappers;

import com.example.demo.forms.RepairForm;
import com.example.demo.models.CreateRepair;
import org.springframework.stereotype.Component;

@Component
public class RepairFormToRepairMapper {

    public CreateRepair convertRepair(RepairForm repairForm) {
        return  new CreateRepair(
                repairForm.getRepairID(),
                repairForm.getDescription(),
                repairForm.getRegistrationDayOfRepair(),
                repairForm.getFinishDayOfRepair(),
                repairForm.getRepairStatus(),
                repairForm.getRepairType(),
                repairForm.getServiceCost(),
                repairForm.getPlateNumber(),
                repairForm.getId()
        );
    }
}


package com.example.demo.service;

import com.example.demo.domain.Owner;
import com.example.demo.domain.Repair;
import com.example.demo.forms.RepairForm;
import com.example.demo.models.CreateRepair;
import com.example.demo.models.MixedSearchModel;
import com.example.demo.models.RepairModel;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface RepairService {


    Repair findRepairByRepairId(Long id);
    List<Repair> findRepairByOwnerId(Long id);
    List<RepairModel> findAll();
    List<RepairModel> findTop10ByFinishDayOfRepairAfter(LocalDateTime date);
    List<RepairModel> findByTaxRegistrationNumberOrCarPlateOrDayOfRepair(MixedSearchModel mixedSearchModel);
    void deleteRepairById(Long id);
    void updateRepair(RepairForm repairForm);
    void createRepair(CreateRepair createRepair);
}

package com.example.demo.service;
import com.example.demo.domain.Repair;
import com.example.demo.forms.RepairForm;
import com.example.demo.mappers.RepairToRepairModelMapper;
import com.example.demo.models.CreateRepair;
import com.example.demo.models.MixedSearchModel;
import com.example.demo.models.RepairModel;
import com.example.demo.repository.RepairRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class RepairServiceImpl implements RepairService {

    @Autowired
    private RepairRepository repairRepository;

    @Autowired
    private RepairToRepairModelMapper mapper;

    @Autowired
    private OwnerService ownerService;

    @Override
    public Repair findRepairByRepairId(Long id) {
        return repairRepository.findByRepairID(id);
    }

    @Override
    public List<Repair> findRepairByOwnerId(Long id) {
        return repairRepository.findRepairByOwnerId(id);
    }

    @Override
    public List<RepairModel> findAll() {
        return repairRepository
                .findAll()
                .stream()
                .map(repair -> mapper.mapToRepairModel(repair))
                .collect(Collectors.toList());
    }

    @Override
    public List<RepairModel> findTop10ByFinishDayOfRepairAfter(LocalDateTime date) {
        return repairRepository
                .findTop10ByFinishDayOfRepairAfter(date)
                .stream()
                .map(repair -> mapper.mapToRepairModel(repair))
                .collect(Collectors.toList());

    }

    @Override
    public List<RepairModel> findByTaxRegistrationNumberOrCarPlateOrDayOfRepair(MixedSearchModel mixedSearchModel) {
        return repairRepository
                .findByTaxRegistrationNumberOrCarPlateOrDayOfRepair(mixedSearchModel.getDayOfRepair(), mixedSearchModel.getTaxRegistrationNumber(), mixedSearchModel.getCarPlate())
                .stream()
                .map(repair -> mapper.mapToRepairModel(repair))
                .collect(Collectors.toList());
    }

    @Override
    public void deleteRepairById(Long id) {
        repairRepository.deleteById(id);
    }

    @Override
    public void updateRepair(RepairForm repairForm) {
        Repair repair = repairRepository.findByRepairID(repairForm.getRepairID());
        repair.setRepairID(repairForm.getRepairID());
        repair.setDescription(repairForm.getDescription());
        /*repair.setFinishDayOfRepair(repairForm.getFinishDayOfRepair());
        repair.setRegistrationDayOfRepair(repairForm.getRegistrationDayOfRepair());*/
        repair.setRepairStatus(repairForm.getRepairStatus());
        repair.setRepairType(repairForm.getRepairType());
        repair.setServiceCost(repairForm.getServiceCost());
        repair.setPlateNumber(repairForm.getPlateNumber());
        repair.setOwner(ownerService.findOwnerById(repairForm.getId()));
        repairRepository.save(repair);
    }

    @Override
    public void createRepair(CreateRepair createRepair) {
        Repair repair = new Repair();
        if (ownerService.findOwnerById(createRepair.getId()) != null) {
            repair.setOwner(ownerService.findOwnerById(createRepair.getId()));
            repair.setDescription(createRepair.getDescription());
            repair.setFinishDayOfRepair(createRepair.getFinishDayOfRepair());
            repair.setPlateNumber(createRepair.getPlateNumber());
            repair.setRegistrationDayOfRepair(createRepair.getRegistrationDayOfRepair());
            repair.setRepairType(createRepair.getRepairType());
            repair.setServiceCost(createRepair.getServiceCost());
            repair.setRepairID(createRepair.getRepairID());
            repair.setRepairStatus(createRepair.getRepairStatus());


            repairRepository.save(repair);
        }
    }
}

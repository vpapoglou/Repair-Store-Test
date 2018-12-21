package com.example.demo.mappers;

import com.example.demo.forms.OwnerForm;
import com.example.demo.models.OwnerModel;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class OwnerModelToOwnerFormMapper {
    public OwnerForm mapToOwnerModel(OwnerModel ownerModel) {
        OwnerForm ownerForm = new OwnerForm(ownerModel.getTaxRegistrationNumber(),
                ownerModel.getFirstName(),
                ownerModel.getFirstName(),
                ownerModel.getLastName(),
                ownerModel.getAddress(),
                ownerModel.getEmail(),
                ownerModel.getPassword(),
                ownerModel.getCarBrand(),
                ownerModel.getCarPlate(),
                ownerModel.getUserType());
        return ownerForm;
    }

    public List<OwnerForm> convertOwners(List<OwnerModel> ownerList) {
        return ownerList
                .stream()
                .map(this::mapToOwnerModel)
                .collect(Collectors.toList());
    }
}

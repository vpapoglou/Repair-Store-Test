package com.example.demo.mappers;


import com.example.demo.domain.Owner;
import com.example.demo.forms.CreateFormOwner;
import com.example.demo.models.OwnerModel;
import org.springframework.stereotype.Component;

@Component
public class CreateFormOwnertoOwnerMapper {
    public OwnerModel mapToOwnerModel(CreateFormOwner createFormOwner) {
        OwnerModel ownerModel = new OwnerModel(createFormOwner.getTaxRegNum(),
                createFormOwner.getUserFirstName(),
                createFormOwner.getUserLastName(),
                createFormOwner.getAddress(),
                createFormOwner.getEmail(),
                createFormOwner.getPassword(),
                createFormOwner.getCarBrand(),
                createFormOwner.getCarPlate(),
                createFormOwner.getPassword());
        return ownerModel;
    }

}

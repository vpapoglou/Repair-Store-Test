package com.example.demo.mappers;

import com.example.demo.domain.Owner;
import com.example.demo.forms.OwnerForm;
import org.springframework.stereotype.Component;

@Component
public class OwnerFormToOwnerMapper {
    public Owner  convertOwner (OwnerForm ownerForm) {
        return new Owner(ownerForm.getTaxRegistrationNumber(),
                ownerForm.getFirstName(),
                ownerForm.getLastName(),
                ownerForm.getUserName(),
                ownerForm.getAddress(),
                ownerForm.getEmail(),
                ownerForm.getPassword(),
                ownerForm.getCarBrand(),
                ownerForm.getCarPlate(),
                ownerForm.getUserType());
    }
}

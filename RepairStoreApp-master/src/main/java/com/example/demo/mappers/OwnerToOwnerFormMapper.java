package com.example.demo.mappers;

import com.example.demo.domain.Owner;
import com.example.demo.forms.OwnerForm;
import org.springframework.stereotype.Component;

@Component
public class OwnerToOwnerFormMapper {
    public OwnerForm convertOwnerToOwnerForm (Owner owner) {
        return new OwnerForm(owner.getId(),
                owner.getTaxRegistrationNumber(),
                owner.getFirstName(),
                owner.getLastName(),
                owner.getUserName(),
                owner.getAddress(),
                owner.getCarBrand(),
                owner.getCarPlate(),
                owner.getEmail(),
                owner.getPassword(),
                owner.getUserType());
    }
}
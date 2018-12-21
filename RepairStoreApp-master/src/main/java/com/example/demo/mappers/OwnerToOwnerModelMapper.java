package com.example.demo.mappers;

import com.example.demo.domain.Owner;
import com.example.demo.models.OwnerModel;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class OwnerToOwnerModelMapper {
    public OwnerModel mapToOwnerModel(Owner owner) {
       OwnerModel ownerModel = new OwnerModel(owner.getId(),
               owner.getTaxRegistrationNumber(),
               owner.getFirstName(),
               owner.getLastName(),
               owner.getAddress(),
               owner.getEmail(),
               owner.getPassword(),
               owner.getCarBrand(),
               owner.getCarPlate(),
               owner.getUserType());
        return ownerModel;
    }

    public List<OwnerModel> convertOwners(List<Owner> ownerList) {
        return ownerList
                .stream()
                .map(this::mapToOwnerModel)
                .collect(Collectors.toList());
    }
}

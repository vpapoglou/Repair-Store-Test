package com.example.demo.mappers;

import com.example.demo.forms.SearchFormRepair;
import com.example.demo.models.MixedSearchModel;
import org.springframework.stereotype.Component;

@Component
public class SearchFormRepairToMixedModel {
    public MixedSearchModel mapToMixedSearchModel(SearchFormRepair searchFormRepair) {
        MixedSearchModel mixedSearchModel= new MixedSearchModel();
        mixedSearchModel.setCarPlate(searchFormRepair.getCarPlate());
        mixedSearchModel.setDayOfRepair(searchFormRepair.getDayOfRepair());
        mixedSearchModel.setTaxRegistrationNumber(searchFormRepair.getTaxRegistrationNumber());
        return mixedSearchModel;
    }
}

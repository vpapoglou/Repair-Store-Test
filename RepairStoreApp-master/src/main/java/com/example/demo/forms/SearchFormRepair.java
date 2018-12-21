package com.example.demo.forms;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class SearchFormRepair {
    private String taxRegistrationNumber;

    private String carPlate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dayOfRepair;

    public String getTaxRegistrationNumber() {
        return taxRegistrationNumber;
    }

    public void setTaxRegistrationNumber(String taxRegistrationNumber) {
        this.taxRegistrationNumber = taxRegistrationNumber;
    }

    public String getCarPlate() {
        return carPlate;
    }

    public void setCarPlate(String carPlate) {
        this.carPlate = carPlate;
    }

    public LocalDate getDayOfRepair() {
        return dayOfRepair;
    }

    public void setDayOfRepair(LocalDate dayOfRepair) {
        this.dayOfRepair = dayOfRepair;
    }
}

package com.example.demo.models;

public class OwnerModel {
    private Long id;
    private String taxRegistrationNumber;
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String password;
    private String carBrand;
    private String carPlate;
    private String userType;

    public OwnerModel() {
    }

    public OwnerModel(String taxRegistrationNumber, String firstName, String lastName, String address, String email, String password, String carBrand, String carPlate, String userType) {
        this.taxRegistrationNumber = taxRegistrationNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.password = password;
        this.carBrand = carBrand;
        this.carPlate = carPlate;
        this.userType = userType;
    }

    public OwnerModel(Long id, String taxRegistrationNumber, String firstName, String lastName, String address, String email, String password, String carBrand, String carPlate, String userType) {
        this.id = id;
        this.taxRegistrationNumber = taxRegistrationNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.password = password;
        this.carBrand = carBrand;
        this.carPlate = carPlate;
        this.userType = userType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaxRegistrationNumber() {
        return taxRegistrationNumber;
    }

    public void setTaxRegistrationNumber(String taxRegistrationNumber) {
        this.taxRegistrationNumber = taxRegistrationNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarPlate() {
        return carPlate;
    }

    public void setCarPlate(String carPlate) {
        this.carPlate = carPlate;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}

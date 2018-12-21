package com.example.demo.forms;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class OwnerForm {

    private static final String TAX_REGISTRATION_NUMBER_PATTERN = "[0-9]{9}";

    private static final String NAME_PATTERN = "^[a-zA-Z0-9]*$";

    private static final String MAIL_PATTERN = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{1,63}$";

    private static final String PASSWORD_PATTERN = "^[a-zA-Z0-9@#$%^&]*$";

    private static final String CAR_BRAND_PATTERN = "^[a-zA-Z]{0,25}$";

    private static final String CAR_PLATE_PATTERN = "^[A-Z]{3}-[0-9]{4}$";

    private static final String USER_TYPE_PATTERN = "^[a-zA-Z]*$";

    private static final int PASSWORD_MINSIZE = 8;

    private Long id;

    @Pattern(regexp = TAX_REGISTRATION_NUMBER_PATTERN, message = "taxRegNum.empty")
    private String taxRegistrationNumber;

    @Pattern(regexp = NAME_PATTERN, message = "firstName.empty")
    private String firstName;

    @Pattern(regexp = NAME_PATTERN, message = "lastName.empty")
    private String lastName;

    @Pattern(regexp = NAME_PATTERN, message = "userName.empty")
    private String userName;

    private String address;

    @Pattern(regexp = CAR_BRAND_PATTERN, message = "Invalid Plate Number")
    private  String carBrand;

    @Pattern(regexp = CAR_PLATE_PATTERN, message = "Invalid Plate Number")
    private String carPlate;

    @Pattern(regexp = MAIL_PATTERN, message = "Invalid Mail")
    private String email;

    @Pattern(regexp = PASSWORD_PATTERN, message = "Invalid Password")
    @Size(min = PASSWORD_MINSIZE, message = "Invalid Password Size")
    private String password;

    @Pattern(regexp = USER_TYPE_PATTERN, message = "Invalid User Type")
    private String userType;

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public OwnerForm(Long id, @Pattern(regexp = TAX_REGISTRATION_NUMBER_PATTERN, message = "taxRegNum.empty") String taxRegistrationNumber, @Pattern(regexp = NAME_PATTERN, message = "firstName.empty") String firstName, @Pattern(regexp = NAME_PATTERN, message = "lastName.empty") String lastName, @Pattern(regexp = NAME_PATTERN, message = "userName.empty") String userName, String address, @Pattern(regexp = CAR_BRAND_PATTERN, message = "Invalid Plate Number") String carBrand, @Pattern(regexp = CAR_PLATE_PATTERN, message = "Invalid Plate Number") String carPlate, @Pattern(regexp = MAIL_PATTERN, message = "Invalid Mail") String email, @Pattern(regexp = PASSWORD_PATTERN, message = "Invalid Password") @Size(min = PASSWORD_MINSIZE, message = "Invalid Password Size") String password, @Pattern(regexp = USER_TYPE_PATTERN, message = "Invalid User Type") String userType) {
        this.id = id;
        this.taxRegistrationNumber = taxRegistrationNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.address = address;
        this.carBrand = carBrand;
        this.carPlate = carPlate;
        this.email = email;
        this.password = password;
        this.userType = userType;
    }

    public OwnerForm() {
    }

    public OwnerForm(@Pattern(regexp = TAX_REGISTRATION_NUMBER_PATTERN, message = "taxRegNum.empty") String taxRegistrationNumber, @Pattern(regexp = NAME_PATTERN, message = "firstName.empty") String firstName, @Pattern(regexp = NAME_PATTERN, message = "lastName.empty") String lastName, @Pattern(regexp = NAME_PATTERN, message = "userName.empty") String userName, String address, @Pattern(regexp = CAR_BRAND_PATTERN, message = "Invalid Plate Number") String carBrand, @Pattern(regexp = CAR_PLATE_PATTERN, message = "Invalid Plate Number") String carPlate, @Pattern(regexp = MAIL_PATTERN, message = "Invalid Mail") String email, @Pattern(regexp = PASSWORD_PATTERN, message = "Invalid Password") @Size(min = PASSWORD_MINSIZE, message = "Invalid Password Size") String password, @Pattern(regexp = USER_TYPE_PATTERN, message = "Invalid User Type") String userType) {
        this.taxRegistrationNumber = taxRegistrationNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.address = address;
        this.carBrand = carBrand;
        this.carPlate = carPlate;
        this.email = email;
        this.password = password;
        this.userType = userType;
    }
}

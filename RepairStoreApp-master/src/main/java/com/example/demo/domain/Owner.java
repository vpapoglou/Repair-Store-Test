package com.example.demo.domain;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "OWNER")
public class Owner {
    private static final int MAX_NAME_LENGTH  = 50;
    private static final int MIN_PASSWORD_LENGTH = 6;

    public Owner() {
    }

    @Id
    @Column(name = "ownerId", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "taxRegNum", unique = true)
    private String taxRegistrationNumber;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "userName")
    private String userName;

    @Column(name = "address")
    private String address;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "carBrand")
    private String carBrand;

    @Column(name = "carPlate", unique = true)
    private String carPlate;

    @Column(name = "userType")
    private String userType;

    @OneToMany(mappedBy = "owner", cascade = {CascadeType.REMOVE}, targetEntity = Repair.class)
    private List<Repair> repairs;

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

    public String getUserName() { return userName; }

    public void setUserName(String userName) { this.userName = userName; }

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

    public List<Repair> getRepairs() {
        return repairs;
    }

    public void setRepairs(List<Repair> repairs) {
        this.repairs = repairs;
    }

    public Owner(String taxRegistrationNumber, String firstName, String lastName, String userName, String address, String email, String password, String carBrand, String carPlate, String userType) {
        this.taxRegistrationNumber = taxRegistrationNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.address = address;
        this.email = email;
        this.password = password;
        this.carBrand = carBrand;
        this.carPlate = carPlate;
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "id=" + id +
                ", taxRegistrationNumber='" + taxRegistrationNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", carBrand='" + carBrand + '\'' +
                ", carPlate='" + carPlate + '\'' +
                ", userType='" + userType + '\'' +
                '}';
    }
}



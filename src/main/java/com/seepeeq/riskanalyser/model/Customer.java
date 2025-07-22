package com.seepeeq.riskanalyser.model;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDate;
@Entity
public class Customer {

    //Personal info
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cust_ID;
    private String name,surname;
    private String idnum;
    private int age;
    private String maritalStatus; 	//May affect financial reliability

    //Financial Info
    private double salary,interest;
    private double balance; //outstanding loan balance
    private boolean insurance, defaulted;
    private int term_left;

    // Vehicle Info
    private String vehicleModel;
    private double vehicleValue;
    private int vehicleYear;

    //Trend analysis
    private LocalDate loanStartDate; //To compute actual loan age or default window
    private String province;    //Geographic trends in default
    private int numDependents;  //Can impact affordability


    //getters
    public boolean isDefaulted() {return defaulted;}
    public boolean isInsurance() {return insurance;}
    public int getAge() {return age;}
    public int getCust_ID() {return cust_ID;}
    public double getSalary(){return salary;}
    public int getTerm_left() {return term_left;}
    public double getBalance() {return balance;}
    public double getInterest() {return interest;}
    public String getIdnum() {return idnum;}
    public String getName() {return name;}
    public String getSurname() {return surname;}
    public double getVehicleValue() {return vehicleValue; }
    public String getMaritalStatus() {return maritalStatus;}
    public int getNumDependents() {return numDependents;}
    public int getVehicleYear() {return vehicleYear;}
    public String getProvince() {return province;}
    public String getVehicleModel() {return vehicleModel;}
    public LocalDate getLoanStartDate() {return loanStartDate;}

    //setters
    public void setAge(int age){
        this.age = age;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void setCust_ID(int cust_ID) {
        this.cust_ID = cust_ID;
    }

    public void setDefaulted(boolean defaulted) {
        this.defaulted = defaulted;
    }

    public void setIdnum(String idnum) {
        this.idnum = idnum;
    }

    public void setInsurance(boolean insurance) {
        this.insurance = insurance;
    }

    public void setInterest(long interest) {
        this.interest = interest;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setTerm_left(int termleft){
        this.term_left = termleft;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setLoanStartDate(LocalDate loanStartDate) {
        this.loanStartDate = loanStartDate;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public void setNumDependents(int numDependents) {
        this.numDependents = numDependents;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public void setVehicleValue(double vehicleValue) {
        this.vehicleValue = vehicleValue;
    }

    public void setVehicleYear(int vehicleYear) {
        this.vehicleYear = vehicleYear;
    }

    @Override
    public String toString() {
        return super.toString();
    }


}

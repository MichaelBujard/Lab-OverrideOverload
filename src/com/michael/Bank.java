package com.michael;

public class Bank {
    //overridden method
    float rateOfInterest;

    public Bank() {
        this.rateOfInterest = 0.12F;
    }


    public float getRateOfInterest() {
        System.out.println("Bank rate of interest : " + this.rateOfInterest);
        return this.rateOfInterest;
    }

    public void setRateOfInterest(float roi) {
        this.rateOfInterest = roi;
    }
}

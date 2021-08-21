package com.michael;

public class AXIS extends Bank {
    //overridden method
    float rateOfInterest;

    public AXIS() {
        this.rateOfInterest = 0.09F;
    }

    @Override
    public float getRateOfInterest() {
        System.out.println("AXIS rate of interest : " + this.rateOfInterest);
        return this.rateOfInterest;
    }

    //Inherit setRateOfInterest(float f)
}

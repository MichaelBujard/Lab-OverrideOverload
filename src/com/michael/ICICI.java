package com.michael;

public class ICICI extends Bank{
    //overridden method
    float rateOfInterest;

    public ICICI() {
        this.rateOfInterest = 0.07F;
    }

    @Override
    public float getRateOfInterest() {
        System.out.println("ICICI rate of interest : " + this.rateOfInterest);
        return this.rateOfInterest;
    }

    //Inherit setRateOfInterest(float f)
}

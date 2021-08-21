package com.michael;

public class SBI extends Bank{
    //overridden method
    float rateOfInterest;

    public SBI() {
        this.rateOfInterest = 0.08F;
    }

    @Override
    public float getRateOfInterest() {
        System.out.println("SBI rate of interest : " + this.rateOfInterest);
        return this.rateOfInterest;
    }

    //setRateOfInterest(float f) inherited
}

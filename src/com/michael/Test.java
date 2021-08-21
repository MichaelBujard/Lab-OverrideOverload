package com.michael;

public class Test {

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.getRateOfInterest();

        AXIS axis = new AXIS();
        axis.getRateOfInterest();

        ICICI icici = new ICICI();
        icici.getRateOfInterest();

        SBI sbi = new SBI();
        sbi.getRateOfInterest();
    }
}

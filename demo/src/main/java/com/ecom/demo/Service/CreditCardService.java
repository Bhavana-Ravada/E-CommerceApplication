package com.ecom.demo.Service;

public class CreditCardService implements Payment{
    @Override
    public void paymentProcessing(double amount) {
        System.out.println("processing via creditcard");
    }
}

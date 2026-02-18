package com.ecom.demo.Service;

public class GPayService implements Payment{
    @Override
    public void paymentProcessing(double amount) {
        System.out.println("processing via gpay");
    }
}

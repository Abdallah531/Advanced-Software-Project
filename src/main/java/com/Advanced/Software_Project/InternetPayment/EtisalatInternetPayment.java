package com.Advanced.Software_Project.InternetPayment;

import org.springframework.stereotype.Component;

@Component
public class EtisalatInternetPayment extends InternetPayment{
    @Override
    public String toString() {
        return "EtisalatInternetPayment{}";
    }

    @Override
    public void addToStore() {
        StoreServices.add(toString());
    }
}
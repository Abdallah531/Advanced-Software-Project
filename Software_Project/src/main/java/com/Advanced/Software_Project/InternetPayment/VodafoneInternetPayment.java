package com.Advanced.Software_Project.InternetPayment;

import org.springframework.stereotype.Component;

@Component
public class VodafoneInternetPayment extends InternetPayment{

    @Override
    public String toString() {
        return "VodafoneInternetPayment{}";
    }

    @Override
    public void addToStore() {
        StoreServices.add(toString());
    }
}
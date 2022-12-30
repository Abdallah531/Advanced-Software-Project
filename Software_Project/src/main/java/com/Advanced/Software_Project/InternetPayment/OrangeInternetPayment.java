package com.Advanced.Software_Project.InternetPayment;

import org.springframework.stereotype.Component;

@Component
public class OrangeInternetPayment extends InternetPayment{
    @Override
    public String
    toString() {
        return "OrangeInternetPayment{}";
    }

    @Override
    public void addToStore() {
        StoreServices.add(toString());
    }
}
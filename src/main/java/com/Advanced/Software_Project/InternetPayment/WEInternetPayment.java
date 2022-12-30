package com.Advanced.Software_Project.InternetPayment;

import org.springframework.stereotype.Component;

@Component
public class WEInternetPayment extends InternetPayment{
    @Override
    public String toString() {
        return "WEInternetPayment{}";
    }

    @Override
    public void addToStore() {
        StoreServices.add(toString());
    }
}
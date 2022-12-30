package com.Advanced.Software_Project.MobileServices;

import org.springframework.stereotype.Component;

@Component
public class VodafoneRacharge extends MobileRacharge {
    @Override
    public String toString() {
        return "VodafoneRacharge{}";
    }

    @Override
    public void addToStore() {
        StoreServices.add(toString());
    }
}

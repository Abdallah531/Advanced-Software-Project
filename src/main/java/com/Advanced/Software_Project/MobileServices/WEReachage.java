package com.Advanced.Software_Project.MobileServices;

import org.springframework.stereotype.Component;

@Component
public class WEReachage extends MobileRacharge {
    @Override
    public String toString() {
        return "WEReachage{}";
    }

    @Override
    public void addToStore() {
        StoreServices.add(toString());
    }
}

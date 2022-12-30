package com.Advanced.Software_Project.MobileServices;

import org.springframework.stereotype.Component;

@Component
public class EitsalatMobileRacharge extends MobileRacharge {
    @Override
    public String toString() {
        return "EitsalatMobileRacharge{}";
    }

    @Override
    public void addToStore() {
        StoreServices.add(toString());
    }


}

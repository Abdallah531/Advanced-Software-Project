package com.Advanced.Software_Project.MobileServices;

import org.springframework.stereotype.Component;

@Component
public class OrangeMobileRacharge extends MobileRacharge {
    @Override
    public String toString() {
        return "OrangeMobileRacharge{}";
    }

    public void addToStore() {
        StoreServices.add(toString());
    }
}

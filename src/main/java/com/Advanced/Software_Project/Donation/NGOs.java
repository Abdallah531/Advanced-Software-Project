package com.Advanced.Software_Project.Donation;

import org.springframework.stereotype.Component;

@Component
public class NGOs extends Donations {
    @Override
    public String toString() {
        return "NGOs{}";
    }

    @Override
    public void addToStore() {
        StoreServices.add(toString());
    }
}
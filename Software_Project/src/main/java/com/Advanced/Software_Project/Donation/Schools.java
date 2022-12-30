package com.Advanced.Software_Project.Donation;

import org.springframework.stereotype.Component;

@Component
public class Schools extends Donations {
    @Override
    public String toString() {
        return "Schools{}";
    }

    @Override
    public void addToStore() {
        StoreServices.add(toString());
    }
}
package com.Advanced.Software_Project.Landlines;

import org.springframework.stereotype.Component;

@Component
public class QuarterReceipt extends Landline {
    @Override
    public String toString() {
        return "QuarterReceipt{}";
    }

    @Override
    public void addToStore() {
        StoreServices.add(toString());
    }
}

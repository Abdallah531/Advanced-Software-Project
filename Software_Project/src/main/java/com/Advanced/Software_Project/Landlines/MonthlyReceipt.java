package com.Advanced.Software_Project.Landlines;

import org.springframework.stereotype.Component;

@Component
public class MonthlyReceipt extends Landline {
    @Override
    public String toString() {
        return "MonthlyReceipt{}";
    }

    @Override
    public void addToStore() {
        StoreServices.add(toString());
    }
}

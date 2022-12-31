package com.Phase2.Payment_Discount.BSL;

import com.Phase2.Payment_Discount.Entity.Discount;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
@Service
public class SpecificDiscountBsl extends Discount {
    double amount;
    ServicesBsl servicesBsl;
    protected static LinkedList<Discount> discounts = new LinkedList<>();

    SpecificDiscountBsl(double Value, ServicesBsl servicesBsl){
        amount = Value;
        this.servicesBsl = servicesBsl;
        discounts.add(this);
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


    @Override
    public ServicesBsl getServicesBsl() {
        return servicesBsl;
    }

    public void setServicesBsl(ServicesBsl servicesBsl) {
        this.servicesBsl = servicesBsl;
    }

    public static LinkedList<Discount> getDiscounts() {
        return discounts;
    }

    public static void setDiscounts(LinkedList<Discount> discounts) {
        SpecificDiscountBsl.discounts = discounts;
    }


    @Override
    public double cost() {
        return this.getPaymentBsl().cost() - amount;
    }
}

package com.Phase2.Payment_Discount.BSL;

import org.springframework.stereotype.Service;

@Service
public class CreditCardBsl extends PaymentBsl{
    public String toString(){
        return "CreditCard";
    }
    @Override
    public double cost() {
        return payment.getCost();
    }
}

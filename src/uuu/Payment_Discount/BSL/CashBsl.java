package com.Phase2.Payment_Discount.BSL;

import org.springframework.stereotype.Service;

@Service
public class CashBsl extends PaymentBsl{
    public String toString(){
        return "Cash";
    }
    @Override
    public double cost() {
        return payment.getCost();
    }
}

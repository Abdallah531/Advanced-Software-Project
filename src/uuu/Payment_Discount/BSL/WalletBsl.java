package com.Phase2.Payment_Discount.BSL;

import org.springframework.stereotype.Service;

@Service
public class WalletBsl extends PaymentBsl{
    public String toString(){
        return "Wallet";
    }
    @Override
    public double cost() {
        return payment.getCost();
    }
}

package com.Phase2.Payment_Discount.BSL;

import com.Phase2.Payment_Discount.Entity.Payment;
import org.springframework.stereotype.Service;

@Service
public abstract class PaymentBsl {
    Payment payment;
    public abstract double cost();
}

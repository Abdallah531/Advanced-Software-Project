package com.Phase2.Payment_Discount.BSL;

import com.Phase2.Payment_Discount.Entity.Discount;
import org.springframework.stereotype.Service;

@Service
public class OverallDiscountBsl extends Discount {
    private static OverallDiscountBsl obj;
    double DiscountAmount=0.0;

    public double getDiscountAmount() {
        return DiscountAmount;
    }

    public void setDiscountAmount(double discountAmount) {
        DiscountAmount = discountAmount;
    }

    private OverallDiscountBsl(double value){
        DiscountAmount = value;
    }
    OverallDiscountBsl(PaymentBsl paymentBsl){
        this.setPaymentBsl(paymentBsl);
    }
    public static OverallDiscountBsl getOverallDiscount(double v){
        if(OverallDiscountBsl.obj == null){
            obj = new OverallDiscountBsl(v);
        }
        return OverallDiscountBsl.obj;
    }

    @Override
    public double cost() {
        return this.getPaymentBsl().cost() - DiscountAmount;
    }
}

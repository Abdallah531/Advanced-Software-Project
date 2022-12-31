package com.Phase2.Payment_Discount.Entity;

import com.Phase2.Payment_Discount.BSL.PaymentBsl;
import com.Phase2.Payment_Discount.BSL.ServicesBsl;

public abstract class Discount extends PaymentBsl {
    PaymentBsl paymentBsl;
    double cost = 0.0;
    ServicesBsl servicesBsl;

    public PaymentBsl getPaymentBsl() {
        return paymentBsl;
    }

    public void setPaymentBsl(PaymentBsl paymentBsl) {
        this.paymentBsl = paymentBsl;
    }

    public ServicesBsl getServicesBsl() {
        return servicesBsl;
    }

    public void setServicesBsl(ServicesBsl servicesBsl) {
        this.servicesBsl = servicesBsl;
    }
}

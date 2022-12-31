package com.Phase2.Payment_Discount.Controllers;

import com.Phase2.Payment_Discount.BSL.PaymentBsl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    PaymentBsl paymentBsl;

    @GetMapping(value = "/payment")
    public double cost(){
        return paymentBsl.cost();
    }
}

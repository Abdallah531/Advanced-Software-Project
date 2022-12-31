package com.Phase2.Payment_Discount.Controllers;

import com.Phase2.Payment_Discount.BSL.CreditCardBsl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreditCardController {
    CreditCardBsl creditCardBsl;

    @GetMapping(value = "/payment/credit")
    public String toString(){
        return creditCardBsl.toString();
    }
}

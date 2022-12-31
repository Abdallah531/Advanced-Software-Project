package com.Phase2.Payment_Discount.Controllers;

import com.Phase2.Payment_Discount.BSL.CashBsl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CashController {
    CashBsl cashBsl;

    @GetMapping(value = "/payment/cash")
    public String toString(){
        return cashBsl.toString();
    }
}

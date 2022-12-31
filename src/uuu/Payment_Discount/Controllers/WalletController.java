package com.Phase2.Payment_Discount.Controllers;

import com.Phase2.Payment_Discount.BSL.WalletBsl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WalletController {
    WalletBsl walletBsl;

    @GetMapping(value = "/payment/wallet")
    public String toString(){
        return walletBsl.toString();
    }
}

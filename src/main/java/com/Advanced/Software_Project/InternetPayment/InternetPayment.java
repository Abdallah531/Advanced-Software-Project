package com.Advanced.Software_Project.InternetPayment;

import com.Advanced.Software_Project.Services.Services;
import org.springframework.stereotype.Component;

@Component
public abstract class InternetPayment extends Services {
    InternetPayment(){
        Cost=60;
    }
}
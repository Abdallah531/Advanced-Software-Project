package com.Advanced.Software_Project.Landlines;

import com.Advanced.Software_Project.Services.Services;
import org.springframework.stereotype.Component;

@Component
public abstract class Landline extends Services {
    Landline(){
        Cost=70;
    }
}

package com.Advanced.Software_Project.MobileServices;

import com.Advanced.Software_Project.Services.Services;
import org.springframework.stereotype.Component;

@Component
public abstract class MobileRacharge extends Services {
     MobileRacharge(){
          setCost(50);
     }

}

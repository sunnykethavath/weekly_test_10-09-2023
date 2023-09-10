package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarCofig {

    @Autowired
    Car carObj;

    @Bean
    public void setColor(){
        carObj.setColor("blue");
    }

    @Bean
    public void setBrand(){
        carObj.setBrand("BMW");
    }
}

package org.example;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private String color;
    private String brand;

    //Getters

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    //Setters

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

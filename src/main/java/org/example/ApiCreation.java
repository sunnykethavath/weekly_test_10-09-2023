package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiCreation {

    @Autowired
    Car carObj;
    @GetMapping("/carobj")
    public String getCarObj() {
        return carObj.toString();
    }

    @GetMapping("/carcolor")
    public String getCarColor() {
        return carObj.getColor();
    }

    @GetMapping("/carbrand")
    public String getCarBrand() {
        return carObj.getBrand();
    }
}

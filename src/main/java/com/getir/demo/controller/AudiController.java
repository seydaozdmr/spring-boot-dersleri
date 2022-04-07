package com.getir.demo.controller;

import com.getir.demo.service.CarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AudiController {
    private CarService carService;

    public AudiController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/car")
    public String getCarModel(){
        return carService.getModel();
    }

}

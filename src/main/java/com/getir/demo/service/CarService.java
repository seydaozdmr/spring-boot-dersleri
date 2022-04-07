package com.getir.demo.service;

import com.getir.demo.model.Audi;
import org.springframework.stereotype.Service;

@Service
public class CarService {
    private Audi audi;

    public CarService(Audi audi) {
        this.audi = audi;
    }

    public String getModel(){
        return audi.getModel();
    }
}

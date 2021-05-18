package com.example.springdocker.service;

import com.example.springdocker.model.Car;
import com.example.springdocker.repository.CarRepository;
import com.example.springdocker.repository.FoodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Salah Abdinoor
 * 5/18/2021
 * 4:10 AM
 * spring-docker-demo
 * Copyright: MIT
 */

@RequiredArgsConstructor
@Service
public class CarService {
    private final CarRepository repository;

    public List<Car> getCars() {
        return repository.findAll();
    }

    public void saveNewCar(Car car) {
        repository.save(car);
    }

    public List<String> getEuropeanCars() {
        // hämtar alla Cars som vi kan laga
        List<Car> europeanCars = repository.FindCarByEuropean(true);

        // returnerar endast Cars branden i en lista
        return europeanCars.stream()
                .map(food -> food.getBrand())
                .collect(Collectors.toList());
    }
}

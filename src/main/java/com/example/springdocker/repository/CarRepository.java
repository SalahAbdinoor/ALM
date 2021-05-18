package com.example.springdocker.repository;
import com.example.springdocker.model.Car;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Salah Abdinoor
 * 5/18/2021
 * 4:06 AM
 * spring-docker-demo
 * Copyright: MIT
 */
@Repository
public interface CarRepository extends MongoRepository<Car, String> {

    List<Car> findCarByEuropean(boolean isEuropean);
    
}

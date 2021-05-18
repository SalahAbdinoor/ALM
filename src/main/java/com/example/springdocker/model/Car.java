package com.example.springdocker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Salah Abdinoor
 * 5/18/2021
 * 4:01 AM
 * spring-docker-demo
 * Copyright: MIT
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    String id;
    String brand;
    String model;
    boolean european;

}

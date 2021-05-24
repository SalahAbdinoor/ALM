package com.example.springdocker;

import java.math.*;

/**
 * Created by Salah Abdinoor
 * 5/19/2021
 * 10:49 AM
 * CarController.java
 * Copyright: MIT
 */
public class MyMathCalc {

    public int add(int a, int b){return a + b;}

    public int multiply(int a, int b){return a * b;}


    public double divide(double a, double b){

        if (b == 0){
            throw new ArithmeticException();
        }

        return  a / b;
    }



}

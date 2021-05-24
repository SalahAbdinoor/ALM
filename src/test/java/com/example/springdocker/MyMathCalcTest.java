package com.example.springdocker;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Salah Abdinoor
 * 5/24/2021
 * 2:30 PM
 * CarController.java
 * Copyright: MIT
 */
class MyMathCalcTest {

    MyMathCalc mathCalc;

    @BeforeEach
    void beforeMethod(){
        mathCalc = new MyMathCalc();
    }

    @Test
    void add() {

        int a = 1;
        int b = 4;
        //------------------------
        int expected = 5;
        int actual = mathCalc.add(a,b);
        //------------------------
        assertEquals(expected,actual);


    }

    @Test
    void multiply() {

        int a = -2;
        int b = 4;
        //------------------------
        int expected = -8;
        int actual = mathCalc.multiply(a,b);
        //------------------------
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Divide: Working")
    void divide_Working() {
        double a = -2;
        double b = -4;
        //------------------------

        double actual = mathCalc.divide(a,b);
        double expected = 0.5;
        //------------------------
        assertEquals(expected,actual);
    }
    @Test
    @DisplayName("Divide: By Zero")
    void divide_Throw() {

        double a = -2;
        double b = 0;
        //------------------------

        Class<ArithmeticException> expectedType = ArithmeticException.class;
        //------------------------

        assertThrows(expectedType,() -> mathCalc.divide(a, b));

    }
}
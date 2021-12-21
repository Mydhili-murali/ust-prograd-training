package com.springbootcalculator.Calculator;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    @Value("${value1}")
    public double value1;
    @Value("${value2}")
    public double value2;
    public double addition() {
        System.out.println("Addition of " + value1 + " and " + value2 + "= " );
        return (value1 + value2);
    }
    public double subtraction() {
        System.out.println("Subtraction of " + value1 + " and " + value2 + "= ");
        return (value1 - value2);
    }
    public double multiplication() {
       System.out.println("Multiplication of " + value1 + " and " + value2 + "= " );
        return  (value1 * value2);
    }
    public double division() {
       System.out.println("Division of " + value1 + " and " + value2 + "= " );
        return (value1 / value2);
    }
}

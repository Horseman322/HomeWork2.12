package com.example.homework212.service;

public class CalculatorServiceImpI implements CalculatorService {

    @Override
    public int add(int a, int b){
        return a + b;
    }

    @Override
    public int subtract(int a, int b){
        return a - b;
    }

    @Override
    public int multiply(int a, int b){
        return a * b;
    }

    @Override
    public int divide(int a, int b){
        return a / b;
    }

}

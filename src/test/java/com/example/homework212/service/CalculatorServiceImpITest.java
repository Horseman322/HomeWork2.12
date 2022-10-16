package com.example.homework212.service;

import org.junit.jupiter.api.Test;

import static com.example.homework212.service.Constants.ONE;
import static com.example.homework212.service.Constants.TWO;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImpITest {

    public final CalculatorService calculatorService = new CalculatorServiceImpI();

    @Test
    public void shouldReturnTwoWhenSumOneAndOne(){
        int result = calculatorService.add(ONE, ONE);
        assertEquals(ONE + ONE, result);
    }

    @Test
    public void shouldReturnThreeWhenSumOneAndOne(){
        int result = calculatorService.add(TWO, ONE);
        assertEquals(TWO + ONE, result);
    }
}
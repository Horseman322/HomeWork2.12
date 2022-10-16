package com.example.homework212.controller;

import com.example.homework212.exception.DivisionByZeroException;
import com.example.homework212.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/plus")
    public String addNumbers(@RequestParam int a, @RequestParam int b) {
        return generateMessage(a, b, "+", calculatorService.add(a, b));
    }

    @GetMapping("/minus")
    public String subtractNumbers(@RequestParam int a, @RequestParam int b) {
        return generateMessage(a, b, "-", calculatorService.subtract(a, b));
    }

    @GetMapping("/multiply")
    public String multiplyNumbers(@RequestParam int a, @RequestParam int b) {
        return generateMessage(a, b, "*", calculatorService.multiply(a, b));
    }

    @GetMapping("/divide")
    public String divideNumbers(@RequestParam int a, @RequestParam int b) {
        if (b == 0) {
            throw new DivisionByZeroException();
        }
        return generateMessage(a, b, "/", calculatorService.divide(a, b));
    }

    private String generateMessage(int a, int b, String operation, int result){
        return String.format("%d %s %d = %d", a, operation, b, result);
    }

}

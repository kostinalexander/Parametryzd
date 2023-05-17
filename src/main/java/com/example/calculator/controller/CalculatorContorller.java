package com.example.calculator.controller;

import com.example.calculator.service.Calculate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorContorller {
    private final Calculate calculate;


    public CalculatorContorller(Calculate calculate) {
        this.calculate = calculate;
    }

    @GetMapping("/plus")
    public String plus(@RequestParam int num, @RequestParam int num1){
        return calculate.addition(num,num1);
    }
    @GetMapping("/minus")
    public String minus(@RequestParam int num, @RequestParam int num1){
        return calculate.subtraction(num,num1);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam int num, @RequestParam int num1){
        return calculate.multiplication(num,num1);
    }
    @GetMapping("/division")
    public String division(@RequestParam int num, @RequestParam int num1){
        return calculate.division(num,num1);
    }
    @GetMapping
    public String helloCalculator(){
        return calculate.helloCalculator();
    }

}

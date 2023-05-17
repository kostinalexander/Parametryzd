package com.example.calculator.service;

import com.example.calculator.exeption.DivisionNullExeption;
import org.springframework.stereotype.Service;

@Service

public class CalculateImpl implements Calculate{
    @Override
    public String helloCalculator() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String addition(int num, int num1) {
        int result = num + num1;
        return num + " + " + num1 + " = " + result;
    }

    @Override
    public String subtraction(int num, int num1) {
        int result = num - num1;
        return num + " - " + num1 + " = " + result;
    }

    @Override
    public String multiplication(int num, int num1) {
        int result = num * num1;
        return num + " * " + num1 + " = " + result;
    }

    @Override
    public String division(int num, int num1) {
        if (num1==0){
            throw new IllegalArgumentException("Деление на 0");
        }
       int result = num / num1;
        return num + " / " + num1 + " = " + result;
        }
    }



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
    public int addition(int num, int num1) {
        int result = num + num1;
        return  result;
    }

    @Override
    public int subtraction(int num, int num1) {
        int result = num - num1;
        return  result;
    }

    @Override
    public int multiplication(int num, int num1) {
        int result = num * num1;
        return  result;
    }

    @Override
    public int division(int num, int num1) {
        if (num1==0){
            throw new IllegalArgumentException("Деление на 0");
        }
       int result = num / num1;
        return  result;
        }
    }



package com.example.calculator;

import com.example.calculator.service.CalculateImpl;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorApplicationTest {
    CalculateImpl calculate = new CalculateImpl();
  public static Stream<Arguments> params(){
      return Stream.of(
              Arguments.of(1,2),
              Arguments.of(-1,-2),
              Arguments.of(1,0)
      );
  }
    @ParameterizedTest
    @MethodSource("params")
    public void calculatorPlusTest1(int num, int num1){
      Integer s = calculate.addition(num,num1);
      assertTrue(s.equals(calculate.addition(num,num1)));
      assertEquals((num+num1), s);
    }

    @ParameterizedTest
    @MethodSource("params")
    public void calculatorMinusTest1(int num, int num1){
        Integer s = calculate.subtraction(num,num1);
        assertTrue(s.equals(calculate.subtraction(num,num1)));
        assertEquals( (num-num1), s);
    }

    @ParameterizedTest
    @MethodSource("params")
    public void calculatorYmnozhenieTest1(int num, int num1){
        Integer s = calculate.multiplication(num,num1);
        assertTrue(s.equals(calculate.multiplication(num,num1)));
        assertEquals((num*num1), s);
    }
    @ParameterizedTest
    @MethodSource("params")
    public void calculatorDelenieTest1(int num, int num1){
      if(num1==0){
        assertThrows(IllegalArgumentException.class,()->calculate.division(num,0));
        return;
      }
      Integer s = calculate.division(num,num1);
        assertTrue(s.equals(calculate.division(num,num1)));
        assertEquals( (num/num1), s);
    }




}
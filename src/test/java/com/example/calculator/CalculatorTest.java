package com.example.calculator;

import com.example.calculator.service.Calculate;
import com.example.calculator.service.CalculateImpl;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;


public class CalculatorTest {
    CalculateImpl calculate = new CalculateImpl();




    @Test
    public void calculatePlusTest(){
    int s = calculate.addition(2,5);
    assertEquals(7,s);
    }
    @Test
    public void calculatePlusTest1(){
        int s = calculate.addition(-2,5);
        assertEquals(3,s);
    }
    @Test
    public void calculateMinusTest(){
        int s = calculate.subtraction(4,2);
        assertEquals(2,s);
    }
    @Test
    public void calculateMinusTes1(){
        int s = calculate.subtraction(-4,-2);
        assertEquals(-2,s);
    }
    @Test
    public void calculateYmnozhenieTest(){
        int s = calculate.multiplication(2,5);
        assertEquals(10,s);
    }
    @Test
    public void calculateYmnozhenieTest1(){
        int s = calculate.multiplication(-2,5);
        assertEquals(-10,s);
    }
    @Test
    public void calculateDeleniyeTest(){
        int s = calculate.division(4,2);
        assertEquals(2, s);
    }
    @Test
    public void calculateDeleniyeTest1(){
        assertThrows(IllegalArgumentException.class,()->calculate.division(3,0));
    }




//    @Test
//    public void calculateDeleniyeTest(){
//        when(calculate.division(3,0).thenThrow(IllegalArgumentException.class)
//        assertThrows(IllegalArgumentException.class,()->{
//            calculate.division(3, 0);
//        },"деление на 0");
//    }

    //@Test
    //void whenConfigNonVoidRetunMethodToThrowEx_thenExIsThrown() {
    //    MyDictionary dictMock = mock(MyDictionary.class);
    //    when(dictMock.getMeaning(anyString())).thenThrow(NullPointerException.class);
    //    assertThrows(NullPointerException.class, () -> {
    //        dictMock.getMeaning("word");
    //    });
    //}


}

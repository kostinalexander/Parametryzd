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
    String s = calculate.addition(2,5);
    assertEquals("2 + 5 = 7",s);
    }
    @Test
    public void calculatePlusTest1(){
        String s = calculate.addition(-2,5);
        assertEquals("-2 + 5 = 3",s);
    }
    @Test
    public void calculateMinusTest(){
        String s = calculate.subtraction(4,2);
        assertEquals("4 - 2 = 2",s);
    }
    @Test
    public void calculateMinusTes1(){
        String s = calculate.subtraction(-4,-2);
        assertEquals("-4 - -2 = -2",s);
    }
    @Test
    public void calculateYmnozhenieTest(){
        String s = calculate.multiplication(2,5);
        assertEquals("2 * 5 = 10",s);
    }
    @Test
    public void calculateYmnozhenieTest1(){
        String s = calculate.multiplication(-2,5);
        assertEquals("-2 * 5 = -10",s);
    }
    @Test
    public void calculateDeleniyeTest(){
        String s = calculate.division(4,2);
        assertEquals("4 / 2 = 2", s);
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

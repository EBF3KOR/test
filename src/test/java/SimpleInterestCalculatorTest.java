package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SimpleInterestCalculatorTest {

    @Test
    public void testCalculateSimpleInterest() {
        SimpleInterestCalculator calculator = new SimpleInterestCalculator();
        
        // Test case 1
        double result1 = calculator.calculateSimpleInterest(1000, 5, 2);
        assertEquals(100.0, result1, 0.01);

        // Test case 2
        double result2 = calculator.calculateSimpleInterest(1500, 4, 3);
        assertEquals(180.0, result2, 0.01);

        // Test case 3
        double result3 = calculator.calculateSimpleInterest(2000, 3, 5);
        assertEquals(300.0, result3, 0.01);
    }
}

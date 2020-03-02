package model;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private static Calculator calculator;

    @BeforeClass
    // This annotation will ensure that the setup method is run once, before running all tests
    public static void setup() {
        calculator = new Calculator();
    }

    @Test
    public void additionWithZero_success() {
        int num = 5;
        int result = calculator.add(num, 0);
        assertEquals(result, num);
    }

    @Test
    public void multiplication_succes() {
        int result = calculator.multiply(10, 5);
        assertEquals(50, result);
    }
}

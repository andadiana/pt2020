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
        // First, do the test setup
        int num = 5;

        // Run the method under test
        int result = calculator.add(num, 0);

        // Verify result against expected value
        assertEquals(result, num);
    }

    @Test
    public void multiplication_succes() {
        int x = 10;
        int y = 5;
        int expectedResult = 50;

        int result = calculator.multiply(x, y);

        assertEquals(expectedResult, result);
    }
}

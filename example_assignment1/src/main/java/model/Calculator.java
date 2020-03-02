package model;

public class Calculator {

    public int add(int x, int y) {
        return x + y;
    }

    public int multiply(int x, int y) {
        // This is obviously wrong, the test for this method should fail
        return x + y;
    }
}

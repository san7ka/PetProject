package org.example;


public class Calculator {
    public static double makeCalculation(double a, double b, String action) {
        double result = switch (action) {
            case "+" -> addNumbers(a, b);
            case "-" -> subtractNumbers(a, b);
            case "*" -> multiplyNumbers(a, b);
            case "/" -> divideNumbers(a, b);
            default -> throw new IllegalArgumentException("Unknown operation");
        };
        return result;
    }
    
    private static double addNumbers(double a, double b) {
        return a + b;
    }

    private static double subtractNumbers(double a, double b) {
        return a - b;
    }

    private static double multiplyNumbers(double a, double b) {
        return a * b;
    }

    private static double divideNumbers(double a, double b) {
        return a / b;
    }
}

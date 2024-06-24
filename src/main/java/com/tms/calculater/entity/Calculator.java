package com.tms.calculater.entity;

public interface Calculator {
    static double calculate(double num1, double num2, char operator) throws IllegalArgumentException {
        return
            switch (operator) {
                case '+' -> num1 + num2;
                case '-' -> num1 - num2;
                case '*' -> num1 * num2;
                case '/' -> num1 / num2;
                default -> throw new IllegalStateException("Unexpected value: " + operator);
            };
    }
}

package com.tms.service;

public interface CalculatorService {

    static char getOperandOfOperation(String operation) {
        return
            switch (operation.toLowerCase()) {
                case "add" -> '+';
                case "sub" -> '-';
                case "mul" -> '*';
                case "div" -> '/';
                default -> '0';
            };
    }

}

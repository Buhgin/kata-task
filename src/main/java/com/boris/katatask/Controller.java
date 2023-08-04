package com.boris.katatask;

public class Controller {
    private final Calculator calculator = new Calculator();
    private final Parser parser = new Parser();

    public String start(String expression) {
        Given given = parser.parse(expression);
        int result;
        switch (given.getOperation()) {
            case SUM ->
                result = calculator.sum(given.getA(), given.getB());

            case DIVISION ->
                result = calculator.division(given.getA(), given.getB());

            case MULTIPLICATION ->
                result = calculator.multiplication(given.getA(), given.getB());

            case SUBTRACTION ->
                result = calculator.subtraction(given.getA(), given.getB());

            default -> throw new ScannerException("не верный знак математической операции");
        }
        if (given.isRomanNumber()) {
            return RomeNumber.romeNumber(result);
        }
        return String.valueOf(result);
    }

}

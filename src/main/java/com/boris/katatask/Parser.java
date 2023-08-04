package com.boris.katatask;



class Parser {

    public Given parse(String expression) {
        String[] split = expression.split(" ");
        Given given = new Given();
        if (split.length < 3) {
            throw new ScannerException("строка не является математической операцией");
        }
        if (!Operation.isOperation(split[1])) {
                throw new ScannerException("не верный знак математической операции");
        }

        given.setOperation(Operation.getOperation(split[1]));

        if (isRome(split[0]) && isRome(split[2])) {
            given.setA(romeNum(split[0]));
            given.setB(romeNum(split[2]));
            given.setRomanNumber(true);
            if (given.getB() > given.getA() && given.getOperation().equals(Operation.SUBTRACTION)) {
                throw new ScannerException(" в римской системе нет отрицательных чисел");
            }
        } else if (isMatches(split[0]) && isMatches(split[2])) {
            given.setA(Integer.parseInt(split[0]));
            given.setB(Integer.parseInt(split[2]));
        } else if (split.length > 3)
            throw new ScannerException("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        else if (isMatches(split[0]) && isRome(split[2])) {
            throw new ScannerException("используются одновременно разные системы счисления");
        } else if (isRome(split[0]) && isMatches(split[2])) {
            throw new ScannerException("используются одновременно разные системы счисления");
        } else if (!given.isValid()) {
            throw new ScannerException("введеные значения некорректны");
        }
        return given;
    }

    private boolean isMatches(String value) {
        return value.matches("\\d+");
    }

    private boolean isRome(String romeValue) {
        String romeChar = "I II III IV V VI VII VIII IX X";
        return romeChar.contains(romeValue);
    }


    private int romeNum(String romeValue) {
        return switch (romeValue) {
            case "I" -> 1;
            case "II" -> 2;
            case "III" -> 3;
            case "IV" -> 4;
            case "V" -> 5;
            case "VI" -> 6;
            case "VII" -> 7;
            case "VIII" -> 8;
            case "IX" -> 9;
            case "X" -> 10;
            default -> throw new ScannerException("Введено неверное значение");
        };
    }
}

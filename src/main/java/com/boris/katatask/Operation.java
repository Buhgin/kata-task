package com.boris.katatask;



public enum Operation {
    SUM("+"),
    SUBTRACTION("-"),
    MULTIPLICATION("*"),
    DIVISION("/");

    private String operation;

    Operation(String operation) {
        this.operation = operation;
    }

    public String getOperation() {
        return operation;
    }

    public static Operation getOperation(String operation) {
        for (Operation value : Operation.values()) {
            if (value.getOperation().equals(operation)) {
                return value;
            }
        }
        throw new ScannerException("Неверный оператор");
    }
    public static boolean isOperation(String operation) {
        for (Operation value : Operation.values()) {
            if (value.getOperation().equals(operation)) {
                return true;
            }
        }
        return false;
    }
}

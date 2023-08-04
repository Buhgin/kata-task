package com.boris.katatask;

import lombok.Data;

@Data
class Calculator {
    private int a;
    private int b;
public int sum(int a, int b) {
    return a + b;
}
public int subtraction(int a, int b) {
    return a - b;
}
public int multiplication(int a, int b) {
    return a * b;
}
public int division(int a, int b) {
    return a / b;
}
}

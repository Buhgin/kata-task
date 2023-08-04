package com.boris.katatask;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Given {
    private int a;
    private  int b;
    private Operation operation;
    private boolean romanNumber = false;

    public void setA(int a) {
        if(a < 0 || a > 10)
            throw new ScannerException("введены значения больше 10 или меньше 1");
        this.a = a;
    }

    public void setB(int b) {
        if(b < 0 || b > 10)
            throw new ScannerException("введены значения больше 10 или меньше 1");
        this.b = b;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public boolean isValid() {
        return !(a == 0 || b == 0 || operation == null);
    }
}

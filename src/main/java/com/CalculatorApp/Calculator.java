package com.CalculatorApp;

/**
 * Created by zevisto on 04.07.17.
 */
public class Calculator {

    public int firstNumber;
    public int secondNumber;

    public Calculator(int firstNumber,int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int dodawanie() {
        return firstNumber + secondNumber;
    }

    public int odejmowanie() {
        return firstNumber - secondNumber;
    }

    public int mnożenie() {
        return firstNumber * secondNumber;
    }

}

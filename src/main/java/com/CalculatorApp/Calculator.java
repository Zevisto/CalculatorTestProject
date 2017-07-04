package com.CalculatorApp;

/**
 * Created by zevisto on 04.07.17.
 */
public class Calculator {

    public int firstNumber;
    public int secondNumber;
    public String informationOutput;

    public Calculator(int firstNumber,int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int dodawanie() {
        return firstNumber + secondNumber;
    }

    public int odejmowanie() {
        if(firstNumber < secondNumber) {
            informationOutput = "First number have to be higher than the second one. Minus values aren't " +
                    "supported by this calculator.";
            System.out.println(informationOutput);
            return 0;
        }
        return firstNumber - secondNumber;
    }

    public int mnożenie() {
        return firstNumber * secondNumber;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }
}

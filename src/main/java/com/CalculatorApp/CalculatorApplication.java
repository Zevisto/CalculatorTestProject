package com.CalculatorApp;
import com.CalculatorApp.Calculator;

public class CalculatorApplication {

	public static void main(String[] args) {
        Calculator kalkulatorTest = new Calculator(18, 13);

        System.out.println(kalkulatorTest.dodawanie());
        System.out.println(kalkulatorTest.odejmowanie());
        System.out.println(kalkulatorTest.mnożenie());
	}

}

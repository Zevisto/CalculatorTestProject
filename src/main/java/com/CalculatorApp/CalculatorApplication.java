package com.CalculatorApp;
import java.util.*;

public class CalculatorApplication {

	public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Wpisz pierwszą liczbe :");
        int wybrano = reader.nextInt();
        System.out.println("Wpisz druga liczbe :");
        int wybrano2 = reader.nextInt();
        Calculator kalkulatorTest = new Calculator(wybrano, wybrano2);

        System.out.println("Dodawanie Twoich liczb : " + wybrano + " + " + wybrano2 + " = " + kalkulatorTest.dodawanie());
        System.out.println("Odejmowanie Twoich liczb : " + wybrano + " - " + wybrano2 + " = " + kalkulatorTest.odejmowanie());
        System.out.println("Mnozenie Twoich liczb : " + wybrano + " * " + wybrano2 + " = " + kalkulatorTest.mnożenie());
	}

}

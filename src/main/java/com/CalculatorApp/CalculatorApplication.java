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
        System.out.println("Wpisz 1 - dodawanie, 2 - odejmowanie, 3 - mnozenie, 4 - zmien liczby, 5 - zakoncz program.");
        int userChoice = reader.nextInt();

        while(wybrano > 0 && wybrano2 > 0) {
                if(userChoice > 5) {
                        System.out.println("Brak opcji dla : " + userChoice);
                }
                if(userChoice == 1) {
                        System.out.println("Dodawanie Twoich liczb : " + wybrano + " + " + wybrano2 + " = " + kalkulatorTest.dodawanie());
                }
                if(userChoice == 2) {
                        System.out.println("Odejmowanie Twoich liczb : " + wybrano + " - " + wybrano2 + " = " + kalkulatorTest.odejmowanie());
                }
                if(userChoice == 3) {
                        System.out.println("Mnozenie Twoich liczb : " + wybrano + " * " + wybrano2 + " = " + kalkulatorTest.mnożenie());
                }
                if(userChoice == 4) {
                        System.out.println("Wpisz pierwszą liczbe :");
                        wybrano = reader.nextInt();
                        System.out.println("Wpisz druga liczbe :");
                        wybrano2 = reader.nextInt();
                }
                if(userChoice == 5) {
                        System.out.println("Program zakonczyl dzialanie.");
                        wybrano = 0;
                        wybrano2 = 0;
                } else {
                        System.out.println("Wpisz 1 - dodawanie, 2 - odejmowanie, 3 - mnozenie, 4 - zmien liczby, 5 - zakoncz program.");
                        userChoice = reader.nextInt();
                }
        }
	}

}

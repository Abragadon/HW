package homeWork.calculator;

import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {
        CalculatorOperation calculatorOperation = new CalculatorOperation();

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = scan.nextInt();

        System.out.print("Enter second number: ");
        int y = scan.nextInt();


        int sumOFNumbers = calculatorOperation.sum(x,y);
        System.out.println("Summa of numbers is: " + sumOFNumbers);

        int minusOfNumbers = calculatorOperation.minus(x,y);
        System.out.println("Minus of numbers is: " + minusOfNumbers);

        int multiOfNumbers = calculatorOperation.multiplication(x,y);
        System.out.println("Multiplication of numbers is: " + multiOfNumbers);

        double divOfNumbers = calculatorOperation.div(x,y);
        System.out.println("Division of numbers is: " + divOfNumbers);






    }
}

package com.example.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Simple Calculator");
        System.out.println("Operations: +, -, *, /");

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter operation: ");
        String op = scanner.next();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result;
        switch (op) {
            case "+":
                result = Calculator.add(num1, num2);
                break;
            case "-":
                result = Calculator.subtract(num1, num2);
                break;
            case "*":
                result = Calculator.multiply(num1, num2);
                break;
            case "/":
                result = Calculator.divide(num1, num2);
                break;
            default:
                throw new IllegalArgumentException("Invalid operation!");
        }

        System.out.println("Result: " + result);
        scanner.close();
    }
}
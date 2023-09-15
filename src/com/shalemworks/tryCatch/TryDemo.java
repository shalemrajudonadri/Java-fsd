package com.shalemworks.tryCatch;

public class TryDemo {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // This block is executed if an ArithmeticException is thrown
            System.out.println("An ArithmeticException occurred");
        } finally {
            
            System.out.println("Finally block executed.");
        }

        System.out.println("Program continues...");
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
//package com.fibo;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Provide the fibonacci number");
        Scanner scan = new Scanner(System.in);
        Fibonacci fib = new Fibonacci(scan.nextInt());
        System.out.println("The value of the next fib is " + fib.next());
    }
}

//package com.fibo;

public class Fibonacci {
    private int number;

    public Fibonacci(int number) {
        this.number = number;
    }

    public int next(){
        return calculateFib(++this.number);
    }

    private int calculateFib(int number){
        int prev = 0, next = 1, i , result = 0;

        if(number == 0){
            return 0;
        }else if(number == 1){
            return 1;
        }

        for(i = 1; i < number; i++ ){
            result = prev + next;
            prev = next;
            next = result;
        }
        return result;
    }
}

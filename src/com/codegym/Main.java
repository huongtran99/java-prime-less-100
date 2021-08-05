package com.codegym;

public class Main {

    private static boolean isPrime(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
}

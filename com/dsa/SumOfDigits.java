package com.dsa;

public class SumOfDigits {
    public static int sumDigits(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 1234;
        System.out.println(sumDigits(n)); // Output: 10
    }
}

package com.company.CTCI.ArraysAndStrings;

public class CheckPrime {

    public static void main(String[] args) {
        int number = 14;
        boolean flag = false;

        char c = (char) 97;
        for (int i = 2; i <= number / 2; ++i) {

            // condition for i to be a prime number
            if (checkPrime(i)) {

                // condition for n-i to be a prime number
                if (checkPrime(number - i)) {

                    // n = primeNumber1 + primeNumber2
                    System.out.printf("%d = %d + %d\n", number, i, number - i);
                    flag = true;
                }

            }
        }
//
//        if (!flag)
//            System.out.println(number + " cannot be expressed as the sum of two prime numbers.");

        if(flag)
            System.out.println("Alex");
        else
            System.out.println("Marty");
    }

    // Function to check prime number
    static boolean checkPrime(int num) {
        boolean isPrime = true;

        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
}
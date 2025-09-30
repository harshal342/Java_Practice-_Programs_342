package Program_30;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to find prime number\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter your number: ");
        int num = input.nextInt();

        boolean prime = isPrime(num);
        if (prime) {
            System.out.println("Your number is prime");
        } else {
            System.out.println("Your number is not prime");
        }
    }
    public static boolean isPrime(int num){
        int i = 2;
        while (i < num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}

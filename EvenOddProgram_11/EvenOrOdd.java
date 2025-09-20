package EvenOddProgram_11;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Welcome to check even or odd number\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("Your given number is Even");
        } else {
            System.out.println("Your given number is Odd");
        }
    }
}

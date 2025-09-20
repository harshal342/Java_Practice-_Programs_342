package NumCheckProgram_10;

import java.util.Scanner;

public class NumChecker {
    public static void main(String[] args) {
        System.out.println("Welcome to check Number\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number what is in your mind: ");
        int num = input.nextInt();

        if (num > 0) {
            System.out.println("Your number is positive!");
        } else if (num == 0) {
            System.out.println("Your number is zero");
        } else {
            System.out.println("Your number is negative");
        }
    }
}

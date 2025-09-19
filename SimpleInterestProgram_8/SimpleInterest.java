package SimpleInterestProgram_8;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to calculate Simple Interest\n");
        System.out.print("Please, Enter your principle number: ");
        int principle = input.nextInt();
        System.out.print("Now, Enter your rate of Interest: ");
        float rate = input.nextFloat();
        System.out.print("Now, Enter how many years you are borrowing this money: ");
        float year = input.nextFloat();

        float interest = (principle * rate * year)/100;
        System.out.println("Your simple interest in Rs is: " + interest);
    }
}

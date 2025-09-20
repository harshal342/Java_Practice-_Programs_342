package CompundInterestProgram_9;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        System.out.println("Welcome to calculate Compound Interest\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your principle amount in Rs: ");
        int principle = input.nextInt();
        System.out.print("Now, enter your rate of interest: ");
        double rate = input.nextDouble();
        System.out.print("Now, enter how many years you borrowing the money: ");
        double years = input.nextDouble();

        double compoundInterest = principle * Math.pow((1 + rate /100),years);
        System.out.println("Your Compound Interest is: " + compoundInterest);
    }
}

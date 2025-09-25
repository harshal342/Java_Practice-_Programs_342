package Program_15;

import java.util.Scanner;

public class PercentageGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to convert percentage into grade\n");
        System.out.print("Enter your percentage: ");
        int percent = input.nextInt();

        if (percent >= 90) {
            System.out.println("Your grade is A");
        } else if (percent >= 75) {
            System.out.println("Your grade is B");
        } else if (percent >= 60) {
            System.out.println("Your grade is C");
        } else if (percent >= 30) {
            System.out.println("Your grade is D");
        } else {
            System.out.println("Your grade is F");
        }
    }
}

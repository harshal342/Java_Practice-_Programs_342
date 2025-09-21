package Program_13;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        System.out.println("Welcome to find Greatest of Three Number\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int first = input.nextInt();
        System.out.print("Now, Enter your second number: ");
        int second = input.nextInt();
        System.out.print("Now, enter your last number: ");
        int third = input.nextInt();

        if (first >= second && first >= third) {
            System.out.println(first + " is the greatest number");
        } else if (second >= third) {
            System.out.println(second + " is the greatest  number");
        } else {
            System.out.println(third + " is the greatest number");
        }
    }
}

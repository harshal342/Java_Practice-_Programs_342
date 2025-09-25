package Program_16;

import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Age calculator\n");
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age > 60) {
            System.out.println("You are a Senior Citizen");
        } else if (age > 18) {
            System.out.println(" You are a Adult");
        } else if (age > 13) {
            System.out.println("You are a Teen");
        } else {
            System.out.println("You are a child");
        }
    }
}

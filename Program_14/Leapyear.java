package Program_14;

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        System.out.println("Welcome to check the leap year\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year you want to check: ");
        int year = input.nextInt();

        if (year % 400 == 0 || (year % 4 == 0 && 100 != 0)) {
            System.out.println("Your year is leap year..");
        } else {
            System.out.println("Your year is not leap year!");
        }
    }
}

package Program_12;

import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to convert fahrenheit to celsius\n");
        System.out.print("Enter your temperature in F: ");
        float fah = input.nextFloat();

        float cel = (fah - 32) * 5 / 9;
        System.out.println("Your converted temperature is: " + cel + " C");
    }
}

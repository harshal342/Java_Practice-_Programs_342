package Program_21;

import java.util.Scanner;

public class LeftShift {
    public static void main(String[] args) {
        System.out.println("Welcome to showcase of left sift operator\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();

        int result = num << 1;
        System.out.println("Result is: " +result);
    }
}

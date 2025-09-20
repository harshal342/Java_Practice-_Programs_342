package Program_3;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to swap to digits\n");
        System.out.print("Enter value of A: ");
        int a = input.nextInt(); //5
        System.out.print("Enter value of B: ");
        int b = input.nextInt(); // 10

        int c = a; //5
        a = b; //10
        b = c; //5
        System.out.println("Your value of A is: " + a);
        System.out.println("Your value of B is: " + b);
    }
}

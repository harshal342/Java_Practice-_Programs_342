package SwapProgram_3;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to swap to digits\n");
        System.out.print("Enter value of A: ");
        int a = input.nextInt();
        System.out.print("Enter value of B: ");
        int b = input.nextInt();

        int c = a;
        a = b;
        b = c;
        System.out.println("Your value of A is: " + a);
        System.out.println("Your value of B is: " + b);
    }
}

package Program_19;

import java.util.Scanner;

public class BitWiseXor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing bitwise AND operator\n");
        System.out.print("Enter your first number: ");
        int first = input.nextInt();
        System.out.print("Now, enter your second number: ");
        int second = input.nextInt();

        int result = first ^ second;
        System.out.println("Result is: "+ result);
    }
}

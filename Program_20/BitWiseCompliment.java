package Program_20;

import java.util.Scanner;

public class BitWiseCompliment {
    public static void main(String[] args) {
        System.out.println("Welcome to showcasing Not/Compliment Operator\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();

        int result = ~num;
        System.out.println("Result is: " +result);
    }
}

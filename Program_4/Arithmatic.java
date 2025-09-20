package Program_4;

import java.util.Scanner;

public class Arithmatic {
    public static void main(String[] args) {
        System.out.println("Welcome to Arithmatic operations \n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = input.nextInt();

        int add = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;
        int mod = num1 % num2;

        System.out.println("Your addition of two numbers is: " + add);
        System.out.println("Your substraction of two number is: "+ sub);
        System.out.println("Your division  of two number is: " + div);
        System.out.println("Your multiplication of two is: "+ mul);
        System.out.println("Your modulus of two number is: "+ mod);
    }
}

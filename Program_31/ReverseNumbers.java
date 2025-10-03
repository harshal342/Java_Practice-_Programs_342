package Program_31;

import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Reverse the given number\n");
        System.out.print("Please, enter your number: ");
        int num = input.nextInt();
        int reverse = reverseDigit(num);
        System.out.println("Your given number is reverse: " + reverse);

    }
    public static int reverseDigit(int num) {
        int revNum = 0;
        while (num > 0) {
            int digit = num % 10;
            revNum = revNum * 10 + digit;
            num /= 10;
        }
        return revNum;
    }
}

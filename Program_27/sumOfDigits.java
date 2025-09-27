package Program_27;

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        System.out.println("Welcome to Sum of Digits\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your numbers: ");
        int num = input.nextInt();
        int sum = sumOfDigits(num);
        System.out.println("Sum of digits is: " + sum);

    }
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;

        }
        return sum;
    }
}

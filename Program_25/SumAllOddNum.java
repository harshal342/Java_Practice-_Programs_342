package Program_25;

import java.util.Scanner;

public class SumAllOddNum {
    public static void main(String[] args) {
        System.out.println("Welcome to sum of all Odd number\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        int sum = sumOdd(num);
        System.out.println("OddSum till " + num + " is " + sum);
    }

    public static int sumOdd(int num) {
        int sum = 0;
        int i = 1;
        while (i <= num) {
            sum += i;
            i += 2;

        }
        return sum;
    }
}

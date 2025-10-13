package Program_33;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to calculate fibonacci series\n");
        System.out.print("Please, enter your number up to your series want to print: ");
        int num = input.nextInt();
        System.out.println("Here is your Fibonacci Series");
        printFibonacciSeries(num);
    }
    public static void printFibonacciSeries(int num) {

        int first = 0, second = 1;
        System.out.print(first + " " + second + " ");
        for (int i = 2; i < num; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
}

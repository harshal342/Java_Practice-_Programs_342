package Program_28;

import java.util.Scanner;

public class LeastCommonMul {
    public static void main(String[] args) {
        System.out.println("Welcome to calculate least common multiple\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int first = input.nextInt();
        System.out.print("Now, Enter your second number: ");
        int second = input.nextInt();

        int lcm = leastCommonMul(first,second);
        System.out.println("Your LCM is: " +lcm);
    }
    public static int leastCommonMul(int first, int second) {
        int i = 1;

        while (true) {
            int factor = first * i;

            if (factor % second == 0) {
                return factor;
            }
            i++;
        }

    }
}

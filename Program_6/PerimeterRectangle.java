package Program_6;

import java.util.Scanner;

public class PerimeterRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your all sides of perimeter of rectangle: ");
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int D = input.nextInt();

        int result = A + B + C + D;
        System.out.println("\n The perimeter of rectangle is: " + result);
    }
}

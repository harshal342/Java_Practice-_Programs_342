package Program_7;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to calculate area of Triangle\n");
        System.out.print("Enter your base in cms: ");
        double base = input.nextDouble();
        System.out.print("Now, enter your perpendicular height in cms: ");
        double height = input.nextDouble();

        double area = (base * height)/2;
        System.out.println("Your area of triangle is: " +area + " cms2");
    }
}

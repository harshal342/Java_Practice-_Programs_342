package WelcomeProgam_1;

import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Welcome " + name + " in Harshal's coding");
    }
}

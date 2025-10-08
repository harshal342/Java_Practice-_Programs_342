package Program_32;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Please enter your String: ");
        String str = input.next();
        String reverse = reverseString(str);
        System.out.println("Original String " + str);
        System.out.println("Reverse String " + reverse);
    }
    public static String reverseString(String str) {
        String revStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            revStr = revStr + str.charAt(i);
        }
        return revStr;
    }
}

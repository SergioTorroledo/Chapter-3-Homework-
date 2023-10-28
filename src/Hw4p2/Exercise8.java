/**
 * Class:Exercise8
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:4.11.8.
 * @written on:10/11/2023
 * Course:ITEC 2140-13 Saturday
 * This class displays a program that accepts a String value from the user and displays the reverse of that value and determine if the String and its reverse are equal and display a message explaining the result.
 * */
package Hw4p2;
import java.util.Scanner;
public class Exercise8 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    System.out.print("Enter a string: ");
    String originalString = scanner.nextLine();


    String reversedString = reverseString(originalString);


    System.out.println("Reverse of \"" + originalString + "\" is \"" + reversedString + "\"");


    if (areEqual(originalString, reversedString)) {
        System.out.println("String value \"" + originalString + "\" and its reverse \"" + reversedString + "\" are equal.");
    } else {
        System.out.println("String value \"" + originalString + "\" and its reverse \"" + reversedString + "\" are not equal.");
    }

    scanner.close();
}


    private static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }


    private static boolean areEqual(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}

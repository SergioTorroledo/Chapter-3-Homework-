/**
 * Class:Exercise9
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:4.11.9.
 * @written on:10/13/2023
 * Course:ITEC 2140-13 Saturday
 * This class displays a  String value and a character value
 * */
package Hw4p2;
import java.util.Scanner;
public class Exercise9 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    System.out.print("Enter a string: ");
    String inputString = scanner.nextLine();


    System.out.print("Enter a character: ");
    char targetChar = scanner.next().charAt(0);


    int lastIndex = -1;

    for (int i = 0; i < inputString.length(); i++) {
        if (inputString.charAt(i) == targetChar) {
            lastIndex = i;
        }
    }


    if (lastIndex != -1) {
        System.out.println("Last occurrence of character '" + targetChar + "' in \"" + inputString + "\" is at index " + lastIndex);
    } else {
        System.out.println("Character '" + targetChar + "' was not found in \"" + inputString + "\"");
    }

    scanner.close();
}
}

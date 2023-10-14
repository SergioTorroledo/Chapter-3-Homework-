/**
 * Class:Exercise7
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:4.11.7.
 * @written on:10/11/2023
 * Course:ITEC 2140-13 Saturday
 * This class displays if string 1 is greater in length than string 2 and also display if string 1 appears after string 2 in the lexicographic order or vice versa or if they are the same.
 * */
package Hw4p2;
import java.util.Scanner;
public class Exercise7 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String str1, str2;
            boolean continueLoop = true;

            while (continueLoop) {
                System.out.print("Enter the first string (or type 'exit' to quit): ");
                str1 = scanner.nextLine();

                if (str1.equalsIgnoreCase("exit")) {
                    continueLoop = false;
                    break;
                }

                System.out.print("Enter the second string: ");
                str2 = scanner.nextLine();


                if (str1.length() > str2.length()) {
                    System.out.println("String 1 is longer than String 2");
                } else if (str2.length() > str1.length()) {
                    System.out.println("String 2 is longer than String 1");
                } else {
                    System.out.println("Both strings are of the same length.");
                }


                int lexicoComparison = str1.compareTo(str2);
                if (lexicoComparison < 0) {
                    System.out.println("String 1 appears before String 2 in lexicographic order");
                } else if (lexicoComparison > 0) {
                    System.out.println("String 2 appears before String 1 in lexicographic order");
                } else {
                    System.out.println("Both strings are lexicographically the same.");
                }


                String combinedSentence = str1 + " " + str2;
                System.out.println("New sentence: " + combinedSentence);
            }

            scanner.close();
        }
    }



/**
 * Class:Exercise10
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:4.11.10.
 * @written on:10/13/2023
 * Course:ITEC 2140-13 Saturday
 * This class displays a pattern
 * */

package Hw4p2;

public class Exercise10 {
    public static void main(String[] args) {
        int rows = 6;

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

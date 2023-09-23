package hw3; /**
        * Class:hw3.Bank.java
        * @author:Sergio Alejandro Torroledo Gonzalez
        * @version:3.1
        * @written on:9/21/2023
        * Course:ITEC 2140-13 Saturday
        * This class displays a program that simulates a basic banking system
        * */

import java.util.Scanner;


public class Bank {
    public static void main(String[] args) {
        double initialBalance = 5000.00;
        double depositLimit = 10000.00;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice: deposit, withdraw, or check balance.");
        String choice = scanner.nextLine();

        switch (choice) {
            case "deposit":
                System.out.println("Enter the amount to deposit:");
                double depositAmount = scanner.nextInt();
                if( depositAmount > depositLimit){
                    System.out.println("Deposit amount exceeds the limit");
                } else {
                    initialBalance += depositAmount;
                    System.out.println("Current Balance: " + initialBalance);
                }
                break;
            case "withdraw":
                System.out.println("Enter the amount withdraw");
                double withdrawAmount = scanner.nextInt();
                if(withdrawAmount > initialBalance){
                    System.out.println("withdraw amount exceeds the limit");
                }else {
                    initialBalance -= withdrawAmount;

                    System.out.println("Current balance " + initialBalance);
                }
                break;
            case "check balance":
                System.out.println("Current balance "+ initialBalance);
                break;
            default:
                System.out.println("Unknown Option!");
        }
    }
}







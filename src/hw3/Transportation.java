package hw3;

import java.util.Scanner;

/**
 * Class:hw3.Ecommerce.java
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:3.3
 * @written on:9/22/2023
 * Course:ITEC 2140-13 Saturday
 * This class displays a program that simulates a transportation system
 * */
public class Transportation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the transport mode: car, train, or plane:");
        String choice = scanner.nextLine();

        switch (choice) {
            case "car":
                System.out.println("Enter the car model: sedan or sports:");
                String carChoice = scanner.nextLine().toLowerCase();
                if (carChoice.equals("sedan")) {
                    System.out.println("Sedan max speed 120 mph ");
                } else if (carChoice.equals("sports")) {
                    System.out.println("Sports max speed 200 mph");
                } else {
                    System.out.println("Unknown car model!");
                }
                break;
            case "train":
                System.out.println("Enter the train type: bullet or freight: ");
                String trainChoice = scanner.nextLine().toLowerCase();
                if (trainChoice.equals("bullet")) {
                    System.out.println("Bullet max speed 250 mph");
                } else if (trainChoice.equals("freight")) {
                    System.out.println("Freight max speed 70 mph");
                } else {
                    System.out.println("Unknown train model!");
                }
                break;
            case "plane":
                System.out.println("Enter the plane type: jet or propeller:");
                String planeChoice = scanner.nextLine().toLowerCase();
                if(planeChoice.equals("jet")){
                    System.out.println("Jet max speed 600 mph");
                } else if (planeChoice.equals("propeller")) {
                    System.out.println("Propeller max speed 200 mph");
                }else {
                    System.out.println("Unknown plane model!");
                }
                break;
            default:
                System.out.println("Unknown hw3.Transportation!");
        }
    }
}


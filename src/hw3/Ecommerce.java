package hw3; /**
 * Class:hw3.Ecommerce.java
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:3.2
 * @written on:9/21/2023
 * Course:ITEC 2140-13 Saturday
 * This class displays a program that simulates a basic e-commerce system
 * */
import java.util.Scanner;

public class Ecommerce {
    public static void main(String[] args) {
        int inventory = 50;
        int inventoryLimit = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice: buy, sell, or inventory:");
        String choice = scanner.nextLine();

        switch (choice) {
            case "buy":
                System.out.println("Enter the amount to buy:");
                int buyAmount = scanner.nextInt();
                if(inventory < buyAmount){
                    System.out.println("Not enough inventory");
                } else {
                    inventory -= buyAmount;
                    System.out.println("Bought " + buyAmount + " items.");
                    System.out.println("Current inventory: " + inventory);
                }
                break;
            case "sell":
                System.out.println("Enter the amount to sell");
                int sellAmount = scanner.nextInt();
                if(inventory + sellAmount > inventoryLimit){
                    System.out.println("Inventory limit reached");
                }else {
                    inventory += sellAmount;
                    System.out.println("Sold "+sellAmount+ " items.");
                    System.out.println("Current inventory " + inventory);
                }
                break;
            case "inventory":
                System.out.println("Current inventory "+ inventory);
                break;
            default:
                System.out.println("Unknown Option!");
        }
    }
}



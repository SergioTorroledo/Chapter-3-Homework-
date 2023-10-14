
/**
 * Class:Chocolate.java
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:1.15.10
 * @written on:8/30/2023
 * Course:ITEC 2140-13 Saturday
 * This class displays is a program to compute the number of bags you need to add three chocolates instead of two.
 * */

public class Chocolate {
    public static void main(String[] args) {

        int totalbags = 9;

        int barsBefore = 2;

        int barsAfter = 3;

        int bagsNeeded = (totalbags * barsBefore) / barsAfter;

        System.out.println(bagsNeeded);
    }
}

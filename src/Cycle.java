/**
 * Class:Cycle.java
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:1.15.12
 * @written on:9/1/2023
 * Course:ITEC 2140-13 Saturday
 * This class displays is a program to compute the total number of tricycles at the shop
 * */
public class Cycle {

    public static void main(String[] args) {

        int bicycles = 10;

        int bicyclessWheels = 2;

        int WheelsOfBicyclesAndTricycles = 47;

        int tricycles = (WheelsOfBicyclesAndTricycles - bicyclessWheels ) / 3;

        System.out.println( tricycles);

    }
}

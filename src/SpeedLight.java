/**
 * Class:SpeddLight.java
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:1.15.9
 * @written on:8/30/2023
 * Course:ITEC 2140-13 Saturday
 * This class displays is a program to compute the distance to a lightning strike based on the time elapsed between the flash and the sound of thunder.
 * */
public class SpeedLight {
    public static void main(String[] args) {

        int speedOfSound= 340;

        int timeElapsed = 5 ;

        int distance = speedOfSound * timeElapsed;

        System.out.println(distance);
    }
}

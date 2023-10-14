/**
 * Class:MaleStudent.java
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:1.15.14
 * @written on:9/1/2023
 * Course:ITEC 2140-13 Saturday
 * This class displays is a program to compute the number of male students in the middel school
 * */

public class MaleStudent {

    public static void main(String[] args) {

        int students = 389;

        int FemaleStudents = 175;

        int MaleStudents = (students - FemaleStudents);

        System.out.println(MaleStudents);
    }
}

package ch4;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class SubtractionQuiz {
    public static void main(String[] args) {
            // Math.random();// 0 to 1 (1 is not inclusive) 0 to 0.999999
        //Returns a double value with a positive sign,greater than or equal to 0.0 less than 1.0
        //not an integer
        Scanner input = new Scanner(System.in);
        int number1 = (int)(Math.random() * 10);
        int number2 =(int)(Math.random() * 10);
        System.out.println("BEFORE SWITCH values from each variable");
        System.out.print("number 1: "+ number1+ " \n");
        System.out.print("number 2:" +number2+ " \n");
        if(number1 < number2){
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        System.out.println("If number 1 is smaller than number 2 - AFTER SWHITCH values from each variable");
        System.out.print("number1: "+ number1+ " \n");
        System.out.print("number2: "+ number2 +" \n");
        System.out.println("//// QUIZ TIME///");


    }
}

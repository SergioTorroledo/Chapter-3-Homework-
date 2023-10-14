package ch4;

import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {
        //System.out.println(System.currentTimeMillis());
        // 345 345/10 ---> 34  345%--->5

        //long number1 = System.currentTimeMillis()%10;
        Scanner input = new Scanner(System.in);
        int number1 = (int) System.currentTimeMillis()%10;
        int number2 = (int) System.currentTimeMillis()*10%10;
        System.out.println(number1 + " + " + number2 + " = ");
        int yourAnswer = input.nextInt();
        int sum = number1 + number2;
        if ( yourAnswer == sum){
            System.out.println("great job");
        } else{
            System.out.println("invalid answear");


        }

        //System.out.println(number1);
        //System.out.println(number2);
    }
}

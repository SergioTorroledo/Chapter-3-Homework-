package ch4loops;

import java.util.Scanner;

public class DoWhileLoopDemo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      int num;
        int sum = 0;
        do{
            num = input.nextInt();
            sum+=num;

        } while( num != 0 );

        System.out.println("sum:" + sum);
         }
}

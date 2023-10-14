package ch4loops;

public class WhileOdd {
    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter an integer between 1 and 100");
        int num = input.nextInt();
        int startNumber = 1;
        if(num >= 1 && num <= 100){

            //use the while to process to print the output of odd numbers from 1 to num
            while (startNumber<=num){
                System.out.println(startNumber);
                startNumber+=2;
            }


        }
        else{
            System.out.println("Invalid");
        }

    }
}

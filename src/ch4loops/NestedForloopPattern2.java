package ch4loops;

public class NestedForloopPattern2 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter an integer value for the outer loop:");
        int number= input.nextInt();
        int startNumber=0;
        for (int row = 0;row <= number ;row++){
            for(int column = 1; column<=number-row;column++){
                System.out.printf("%-5s" ," ");
            }
            for (int column=0;column<=row;column++){

                System.out.printf("%-5d" ,startNumber);
            }
        }

    }
}

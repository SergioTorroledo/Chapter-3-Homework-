package ch4loops;
import java.util.Scanner;
public class DoWhileloopSDemo2
 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int count = 0; //initialization
            System.out.println("Enter an integer value: ");
            count = input.nextInt();
            do{
                if(count <10){
                 count += 1;
                 System.out.println("count is " + count);
             }

        } while(count < 10);

    }
}

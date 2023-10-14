package ch4;
import java.util.Scanner;
public class StringDemoAlphabet { public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter the entire alphabet letters in lowercase");

    String alphabet = input.nextLine();


    //write a syntax or a statement to store the length of alphabet and print out that value.

    int lengthOfAlphabet = alphabet.length();
    System.out.println("Alphabet has " + lengthOfAlphabet + "characters or letters");
    String upperCaseAlphabet = alphabet.toUpperCase();
    System.out.println(alphabet.toUpperCase());
    System.out.println(upperCaseAlphabet.toLowerCase());
    char x = alphabet.charAt(4);
    System.out.println("Returning character after you run alphabet.charAt(4) is "+ x);
    int ch =alphabet.indexOf(5);
    System.out.println("Returning integer valur after indexOF() method is taking actual integer is " + ch);

    int  ch2 = alphabet.indexOf("uvwx yz");

    int ch3 = alphabet.indexOf("u");
    int ch4 = alphabet.indexOf("u");
    int ch5 = alphabet.lastIndexOf("z");
    System.out.println("ch2= "+ ch2);
    System.out.println("ch3= " + ch3);
    System.out.println("ch4= " + ch4);
    System.out.println("ch5= " + ch5 );

    String alp = "abceefghi";
    char chx = alp.charAt(10);

}
}

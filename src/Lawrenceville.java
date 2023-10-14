
    public class Lawrenceville {
    public static void main(String[] args) {

        java.util.Scanner keyboard = new java.util.Scanner(System.in);

        System.out.print("Type Loganville:");

        String city = keyboard.next();

        char cityCharacter = city.charAt(0);

        char firstCharacter = keyboard.next().charAt(0);

        if(firstCharacter == 'L'){
            System.out.println("Loganville");
        }
    }
}


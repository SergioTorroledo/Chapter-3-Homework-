package Personalproyects;
import java.util.Random;


public class FlipCoin {

    public static void main(String[] args) {
    Random flip=new Random();

        System.out.println("choose heads or tails");

        int coin = flip.nextInt(2);
        if(coin==0){
            System.out.println("It's heads");
        }
        else{
            System.out.println("It's tails");
        }
    }
}
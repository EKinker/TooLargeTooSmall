/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int guessCounter = 1;
        int randomNum = (int) (Math.random() * 20)+1;
        int lastGuess = 0;
        int guess = 0;


        System.out.print("I'm thinking of a number between 1 and 20... Can you guess it?");
        while (randomNum != guess) {

            guess = in.nextInt();
            if (guess < 1 || guess > 20){
                System.out.print("C'mon, I said between 1 and 20.  That one didn't count. Try again.");
            } else if (guess ==lastGuess) {
                System.out.print("You already guessed that one! Try again.");
            } else if (guess > randomNum){
                System.out.print("Lower... Try again!");
                guessCounter++;
                lastGuess = guess;
            } else if (guess < randomNum){
                System.out.print("Higher... Try again!");
                guessCounter++;
                lastGuess = guess;
            }

        //System.out.println(randomNum); System.out.println(guessCounter); //for checking.  comment out later

        }
        if (guessCounter==1){
            System.out.print("Wow! You got it on the first try!");
        } else {
            System.out.print("Yes! You got it in "+guessCounter+" tries!");
        }

    }
}

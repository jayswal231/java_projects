import java.util.*;

public class Main {
    public static void main(String[] args)
    {

        Scanner sc =new Scanner(System.in);
        Random rand = new Random();
        int secretNumber=rand.nextInt(100)+1;
        int count=0;

        while(true) {
            System.out.println("Guess the Number (1-100): ");
            int guessNumber = sc.nextInt();
            count++;

            if (secretNumber == guessNumber) {
                System.out.println("The guess number is: " + guessNumber + " "+" Absolutely right!");
                System.out.println("You try at : "+ count + " " + "times");
                break;

            } else if (guessNumber < secretNumber) {
                System.out.println("The guess number is :" + guessNumber + " "+" less than actual number, Please guess again.");
            } else if (guessNumber > secretNumber) {
                System.out.println("The guess number is :" + guessNumber + " " + "greater than actual number, Please guess again.");
            }
        }
    }
}
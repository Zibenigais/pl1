import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(final String[] args) {
        // YOUR CODE GOES HERE
         Scanner scanner = new Scanner(System.in);
         Random random = new Random();

         // Initializing the random number in range 1-10
         int number = random.nextInt(11);

         while(true){
            System.out.println("Guess a number: ");
            int guess = scanner.nextInt();
            
            if(guess == number){
                System.out.println("Success!");
                break;
            } else if (guess < number){
                System.out.println("Guess was too low");
            } else{
                System.out.println("Guess was too high");
            }
         }

    }
}
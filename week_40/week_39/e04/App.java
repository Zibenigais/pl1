import java.util.Scanner;
public class App {
    public static void main(final String[] args) {
        // YOUR CODE GOES HERE
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Enter a number (0 to quit): ");
            int number = scanner.nextInt();
            if (number == 0){
                break;
            } else if (number % 2 == 0){
                System.out.println("Even number");
            } else{
                System.out.println("Odd number");
            }
        }
        
        scanner.close();
    }
}
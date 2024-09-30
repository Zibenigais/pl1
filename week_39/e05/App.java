import java.util.Scanner;
public class App {
    public static void main(final String[] args) {
        // YOUR CODE GOES HERE
        Scanner scanner = new Scanner(System.in);
        
        int amount = 0;
        int sum = 0;

        while(true){
            System.out.println("Give a test score (-1 to quit): ");
            float score = scanner.nextInt();
            if (score == -1){
                break;
            } else {
                amount++;
                sum += score;
                System.out.println("Average: " + ((float)sum / amount));
            }
        }
        System.out.println("Summary");
        System.out.println("-------");
        System.out.println("Tests: " + amount);
        System.out.println("Average: " + ((float)sum / amount));
        scanner.close();
    }
}
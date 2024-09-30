import java.util.Scanner;
public class App {
    public static void main(final String[] args) {
        // YOUR CODE GOES HERE 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which multiplication table to show?");
        int number = scanner.nextInt();

        for (int i = 0; i <= 10; i++ ){
            System.out.println(i + " x " + number + " = " + (number * i));
        }

        scanner.close();
    }
}
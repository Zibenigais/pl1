import java.util.Scanner;

public class App {
    public static void main(final String[] args) {
        // YOUR CODE GOES HERE
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name = scanner.nextLine();
        System.out.println("You entered: " + name);
        for (int i = 0; i < name.length(); i++){
            if (i % 2 == 0){
                System.out.println(name.charAt(i));
            }
        }
    }    
}   
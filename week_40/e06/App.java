import java.util.Scanner;

public class App {
    public static void main(final String[] args) {
        // YOUR CODE GOES HERE
        Scanner scanner = new Scanner(System.in);
        String name = "";
        while (true){
            System.out.println("Enter a name: ");
            String newName = scanner.nextLine();
            if (newName.equals("Quit")){
                break;
            }
            name = name.concat(newName);
            System.out.println(name);
        }  
    }
}   
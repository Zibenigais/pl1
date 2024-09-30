import java.util.Scanner;

public class App { 
    public static void main(final String[] args) 
    { // YOUR CODE GOES HERE 
        Scanner scanner = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Is it the weekend? (Yes/No)");
        String weekend = scanner.nextLine();

        if(age < 18 || age > 65){

            if(weekend.equals("No")){
                System.out.println("You get a discount!");
            } else {
                System.out.println("You pay the full price!");
            }
        } else{
            System.out.println("Pay the full price!");
        }
        
    } 
}

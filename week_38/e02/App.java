import java.util.Scanner;

public class App { 
    public static void main(final String[] args) 
    { // YOUR CODE GOES HERE 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the result: ");

        int result = scanner.nextInt();

        switch(result/10){
            case 10:
            case 9:
                System.out.println("Excellent!");
                break;
            case 8:
            case 7:
                System.out.println("Good Job!");
                break;
            case 6:
            case 5:
                System.out.println("Needs improvement.");
                break;
            default:
                System.out.println("Fail.");
        }
        scanner.close();
    } 
}

import java.util.Scanner;

public class App { 

    enum Days {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
    }
    
    public static void main(final String[] args) 
    { 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the day: ");
        String day = scanner.nextLine();

        Days name = Days.valueOf(day);

        switch(name){
            case Monday:
                System.out.println("Let's get to work!");
                break;
            case Tuesday:
                System.out.println("Monday's already behind!");
                break;
            case Wednesday:
                System.out.println("It's midweek!");
                break;
            case Thursday:
                System.out.println("You can already feel the Friday!");
                break;
            case Friday:
                System.out.println("The final push!");
                break;
            case Saturday:
                System.out.println("Enjoy the weekend!");
                break;
            case Sunday:
                System.out.println("Make the most of Sunday!");
                break;
            default:
                System.out.println("Invalid day inputted");
                break;             
        }
        
        scanner.close();
    } 
}

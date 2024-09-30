import java.util.Scanner;

public class App { 
    public static void main(final String[] args) 
    { 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number: ");
        int number = Integer.valueOf(scanner.nextLine());

        String dayname;

        switch(number){
            case 1:
                dayname = "Monday";
                break;
            case 2:
                dayname = "Tuesday";
                break;
            case 3:
                dayname = "Wednesday";
                break;
            case 4:
                dayname = "Thursday";
                break;
            case 5:
                dayname = "Friday";
                break;
            case 6:
                dayname = "Saturday";
                break;
            case 7:
                dayname = "Sunday";
                break;
            default:
                dayname = "Invalid day";
                break;             
        }
        System.out.println("The day you inputted is: " + dayname);



        
    } 
}

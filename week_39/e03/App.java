public class App {
    public static void main(final String[] args) {
        // YOUR CODE GOES HERE
        for (int i = 1; i <= 6; i++){
            for (int spaces = 6-i; spaces > 0; spaces--){
                System.out.print(" ");
            }
            for (int number = i; number > 0; number--){
                System.out.print(i);
            }
            System.out.println();                
        } 
    }
}
public class App {
    public static void main(final String[] args) {
        // YOUR CODE GOES HERE
        for (int i = 1; i <= 4; i++){
            for (int spaces = 4-i; spaces > 0; spaces--){
                System.out.print(" ");            
            }
            for (int stars = (2*i) - 1; stars > 0; stars--){
                System.out.print("*");
            }
            System.out.println(); 
        }
        
    }
}
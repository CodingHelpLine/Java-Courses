package section2;

/**
 *
 * @author Programmer
 */
public class Lecture9ForLoop {
    
    public static void main(String[] args) {
        
        // For lOOp - counting loop
        for(int x = 1; x <= 10; x++) {
            System.out.println("Value of  x = " + x);
        }
        
        // For lOOp - Only even number
        System.out.println("\nEven Numbers: ");
        for(int x = 1; x <= 10; x++) {
            if(x % 2 == 0) {
                System.out.println("Value of  x = " + x);
            }
        }
    }
}

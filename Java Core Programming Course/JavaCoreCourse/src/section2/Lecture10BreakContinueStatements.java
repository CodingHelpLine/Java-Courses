package section2;

/**
 *
 * @author Programmer
 */
public class Lecture10BreakContinueStatements {
        
    public static void main(String[] args) {
        
        // run a loop to only print even number using continue
        System.out.println("Example: Continue Statement");
        for(int i=1; i<=10; i++) {
            
            // condition to check odd number
            if(i % 2 != 0) {
                continue;
            }
            
            System.out.println("Even Value of i = " + i);
        }
        
        // run a loop to only print even number and use Break Statement
        System.out.println("Example: Break Statement");
        for(int i=2; i<=10; i++) {
            
            // condition to check odd number
            if(i % 2 != 0) {
                break;   // not a good practice to use break except swtich - case statements
            }
            
            System.out.println("Even Value of i = " + i);
        }
    }
 
}

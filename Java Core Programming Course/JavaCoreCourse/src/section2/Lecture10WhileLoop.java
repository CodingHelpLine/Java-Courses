package section2;

import java.util.Scanner; 

/**
 *
 * @author Programmer
 */
public class Lecture10WhileLoop {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in); 
        
        // While LOOP
        // Two components: Condition / Loop body
        
        /*
        while(condition) {
            // loop body
        }
        */
        
        int i = 1; 
        while( i <= 10) {
            System.out.println("I = " + i);
            i++;
        }
        
        int input = 0; 
        int sum = 0; 
        while(input != -1) {
            
            // Prompt to enter a number
            System.out.print("Enter a Num to add or -1 to exit: ");
            input = keyboard.nextInt(); 
            
            if(input != -1) {
                sum += input; 
                System.out.println("Sum is now: " + sum);
            }
            
        }
        
         i = 1; 
         System.out.println("\nDo While Loop");
         do {
             System.out.println("I = " + i);
             i++;
         } while(i <= 10);
         
         
         i = 1; 
         System.out.println("\nDo While Loop - At least once");
         do {
             System.out.println("I = " + i);
             i++;
         } while(i < 1);
         
    }
}

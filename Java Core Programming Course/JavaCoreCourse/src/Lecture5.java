/**
 *
 * @author Programmer
 */
public class Lecture5 {
    public static void main(String [] args) {
        
        // Declare variables
        int x = 10; 
        int y = 0; 
        
        // Print 
        System.out.printf("X = %d, Y = %d%n", x, y); 
        
        // Increment operator
        y = x++; // post fix form assign first then increase
        System.out.printf("X = %d, Y = %d%n", x, y); 
        
        x = 10;
        y = 0; 
        
        // Prefix Fom
        y = ++x; 
        System.out.printf("X = %d, Y = %d%n", x, y); 
        
        System.out.println("\nDecrement Operator");
        x = 10;
        y = 0; 
        
        // Decrement Postfix Fom
        y = x--; 
        System.out.printf("Postfix: X = %d, Y = %d%n", x, y); 
        
        x = 10;
        y = 0;         
        // Decrement Postfix Fom
        y = --x; 
        System.out.printf("Prefix: X = %d, Y = %d%n", x, y); 
        
       
        System.out.println("Shorter Integer Data Type and Arithmetic Operations");
        byte b = 5; 
        byte c = 10; 
        
        // now another variable
        byte a = 15; // fine
        
        // if we operate,lets say +
        int result = b + c; // here error? 
        
        System.out.println(result);
        
        // Short value
        short s = 9; 
        result = s + b; // 14
        System.out.println(result);
        
        int i = 3; 
        result = c + a; // no error
        System.out.println(result);
        
        // Arithmetic errors
        // overflow / under flow occurs
        result = Integer.MAX_VALUE + Integer.MAX_VALUE;
        System.out.println(result); 
        
        // underflow
        result = Integer.MIN_VALUE + Integer.MIN_VALUE;  // -2^31  
        System.out.println(result); 
        
        x = 9;
        y = 0;
        
        System.out.println(x / y); // DivisionZero Exception 
    }
}

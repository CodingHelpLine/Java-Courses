package section1;

/**
 *
 * @author Programmer
 */
public class Lecture4 {
    
    public static void main(String [] args) {
        
        // declare and initialize some variables
        int x = 5; 
        int y = 3; 
        int z = 12; 
        
        // Print
        System.out.printf("X = %d%n", x);
        System.out.printf("Y = %d%n", y);
        System.out.printf("Z = %d%n", z);
        
        // First + 
        int result = x + y; 
        System.out.printf("%d + %d = %d%n", x, y, result);
        
        // Subtraction
        result = z - x;
        System.out.printf("%d - %d = %d%n", z, x, result);
        
        // Multiplication
        result = x * y; 
        System.out.printf("%d * %d = %d%n", x, y, result);
        
        // Division
        result = z / x;
        System.out.printf("%d / %d = %d%n", z, x, result);
        
        result = z / y;
        System.out.printf("%d / %d = %d%n", z, y, result);
        
        // Modulus
        result = z % x; 
        System.out.printf("%d %% %d = %d%n", z, x, result);
        
        result = z % y;
        System.out.printf("%d %% %d = %d%n", z, y, result);
       
        // Precendence 
        result = x * y + z; 
        System.out.printf("%d * %d + %d = %d%n", x, y, z, result);
        
        // Same precedence
        result = x * y / x;
        System.out.printf("%d * %d / %d = %d%n", x, y, x, result);
        
    }
}

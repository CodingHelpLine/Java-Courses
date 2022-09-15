/**
 *
 * @author Programmer
 */
public class Lecture6 {
    public static void main(String [] args) {
        
        // Few Variables
        byte b = 3; 
        short s = 9;
        int i = 4; 
        
        // Print values
        System.out.printf("b = %d, s = %d, i = %d%n", b, s, i);
        
        // Casting
        // Implicit Casting
        i = b; // ok
        
        // Print values
        System.out.printf("b = %d, s = %d, i = %d%n", b, s, i);

        i = s; 
        // Print values
        System.out.printf("b = %d, s = %d, i = %d%n", b, s, i);

        // Explicit Casting
        i = 4;
        
        b = (byte) i; // no error after casting
        // Print values
        System.out.printf("b = %d, s = %d, i = %d%n", b, s, i);

        s = (short) i; // no error after casting
        // Print values
        System.out.printf("b = %d, s = %d, i = %d%n", b, s, i);

        // Test overflow
        i = Integer.MAX_VALUE;  // 2^31 - 1
        // Print values
        System.out.printf("b = %d, s = %d, i = %d%n", b, s, i);

        s = (short) i; // Casting ok & legal
        // BUT: overflow will result in invalid value

        // Print values
        System.out.printf("b = %d, s = %d, i = %d%n", b, s, i);
        
        // Op= operators
        i = 4;
        s = 3; 
        i += b; // legal conversion 
        
        // Print values
        System.out.printf("b = %d, s = %d, i = %d%n", b, s, i);

        // Bitwize operators
        b = 2; 
        i = 5; 
        s = 3; 
        
        int x = 5;
        int y = 11;
        
        // print values as binary
        System.out.printf("%d in Binary %s %n", x, Integer.toBinaryString(x));
        System.out.printf("%d in Binary %s %n", y, Integer.toBinaryString(y));
        
        int result = 5 & y; 
        System.out.printf("%d in Binary %s %n", result, 
                    Integer.toBinaryString(result));
        
        result = 5 | y; 
        System.out.printf("%d in Binary %s %n", result, 
                    Integer.toBinaryString(result));
        
        result = 5 ^ y; 
        System.out.printf("%d in Binary %s %n", result, 
                    Integer.toBinaryString(result));
        
        result = ~y; 
        System.out.printf("%d in Binary %s %n", result, 
                    Integer.toBinaryString(result));
        
        // Shift operators
        x = 5;
        y = -17;
        
        // Left shift
        System.out.printf("%d in Binary %s %n", x, 
                    Integer.toBinaryString(x));
        System.out.printf("Y = %d in Binary %s %n", y, 
                    Integer.toBinaryString(y));
        
        // left shift
        result = y << 2;
        System.out.println("Left Shift y 2 bits");
        System.out.printf("%d in Binary %s %n", result, 
                    Integer.toBinaryString(result));
        
        result = y >> 2;
        System.out.println("Right Shift y 2 bits");
        System.out.printf("%d in Binary %s %n", result, 
                    Integer.toBinaryString(result));
        
        result = y >>> 2;
        System.out.println("l:Unsigned Right Shift y 2 bits");
        System.out.printf("%d in Binary %s %n", result, 
                    Integer.toBinaryString(result));
        
    }
}

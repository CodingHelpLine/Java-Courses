/**
 *
 * @author Programmer
 */
public class Lecture2 {
    
    public static void main(String [] args) {
        int intVar;  // this is declaration
        
        intVar = 5; // this is assignment or initialization
        
        // we can do this on a single line or single
        // statement
        long intVar2 = 3; 
        
        System.out.println(intVar); 
        System.out.println(intVar2); 
        
        // Wrong name
        int _Var = 15; // compiler error
         System.out.println(_Var); 
         
         // Case sensitive
         // IntVar
         System.out.println(intVar);
         
         // Talk about size 
         // Wrapper class: int has Integer 
         // long has Long 
         // float has Float wrapper 
         System.out.println("Min Value of int: " + Integer.MIN_VALUE);
         System.out.println("Max Value of int: " + Integer.MAX_VALUE);
         
         System.out.println("Min Value of long: " + Long.MIN_VALUE);
         System.out.println("Max Value of long: " + Long.MAX_VALUE);
         
         // boolean
         boolean flag = true; // can only hold true/false
         
         // Characters
         // can store a single character
         char charVar = 'A';
         char charVar2 = '\u0042';
         
         // Escape sequences
         // for example: \n = new line
         // \t tab character
         // \r carriage return
         // \b beep sound
         
         System.out.println("Value of charVar: " + charVar);
         System.out.println("Value of charVar2: " + charVar2);
         
    }
    
}

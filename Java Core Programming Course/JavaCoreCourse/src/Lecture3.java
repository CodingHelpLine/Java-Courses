/**
 *
 * @author Programmer
 */
public class Lecture3 {
    public static void main(String [] args) {
        
        // declare variables
        int lengthInInches = 25;    // inches
        
        // conversion rate
        final double CM_IN_INCHES = 2.54; // centimer to inches
        
        // new varialbe to store result
        double lengthInCM = CM_IN_INCHES * lengthInInches; 
        
        // Print
        System.out.printf("Length in Inches: %d%n", lengthInInches);
        System.out.printf("Length in CM: %.2f%n", lengthInCM);
   }
}

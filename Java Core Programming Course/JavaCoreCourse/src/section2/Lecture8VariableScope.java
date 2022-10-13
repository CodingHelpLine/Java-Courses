package section2;

/**
 *
 * @author Programmer
 */
public class Lecture8VariableScope {
    
    public static void main(String[] args) {
        
        // Variable scope
        
        // Rule of Thumb
        
        /*
            
        1. Must declare a variable before you use it. 
        2. You must consider the scope of variable
        3. Outer space variable is visible within inner scope
        4. Inner Scope variable is not accessible outside of that scope 
        
        */
        
        int i = 5; 
        
        for(int x = 0; x<10; x++)
        {
            int j = 10; 
            
            if(x == 5) {
                int y = 3; 
                System.out.println("y is here: " + y);
            }
            
           // System.out.println("y is not here: " + y);
            
            System.out.println("J value = " + i);
        }
    }
}

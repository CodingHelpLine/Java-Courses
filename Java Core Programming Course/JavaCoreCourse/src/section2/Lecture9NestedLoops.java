package section2;

/**
 *
 * @author Programmer
 */
public class Lecture9NestedLoops {
    
    public static void main(String[] args) {
        
        // Nested Loop 
        // A Loop Within another Loop
        // Draw a box of # character
        int size = 10; 
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                System.out.print("#");
            } // inner loop
            System.out.println("");
        } // outer loop
        
        
        // Lets draw triangle
        System.out.println("\nTriangle");
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                if(j <= i) {
                    System.out.print("#");
                }
            } // inner loop
            System.out.println("");
        } // outer loop
        
        // Hallow Box
        System.out.println("\nHallow Box");
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                
                if(i==0 || i == (size-1) || (j == 0 || j == (size-1))) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
                
            } // inner loop
            System.out.println("");
        } // outer loop
        
        // Hallow Box with Croxx
        System.out.println("\nHallow Box with Cross");
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                
                if(i==0 || i == (size-1) || (j == 0 || j == (size-1)) || (i == j || j == size-i-1)) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
                
            } // inner loop
            System.out.println("");
        } // outer loop
    }
}

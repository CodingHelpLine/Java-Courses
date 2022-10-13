package section2;

/**
 *
 * @author Programmer
 */
public class Lecture9EnahncedForLoop {
    
    public static void main(String[] args) {
        
        // enhanced for loop
        // only words with array and collections
        
        // integer array
        int array [] = {2, 3, 9, 11, 15};
        
        // A. counting loop
        for(int i=0; i<array.length; i++) {
            System.out.printf("Array[%d] = %d%n", i, array[i]);
        }
        
        // B. Enhanced loop
        System.out.println("\nEnhanced For Loop");
        for(Integer i: array) {
            System.out.printf("%d ", i);
        }
    }
}

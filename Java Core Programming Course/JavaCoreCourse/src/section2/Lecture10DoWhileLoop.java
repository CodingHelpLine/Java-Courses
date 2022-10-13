package section2;

import java.util.Scanner;

/**
 *
 * @author Programmer
 */
public class Lecture10DoWhileLoop {
    public static void main(String[] args) {
        
        // moslty we use do-while in menu driven program 
        
        int choice; 
        
        Scanner keyboard = new Scanner(System.in); 
        
        do {
            
            // print menu
            System.out.println("1. Select Option A");
            System.out.println("2. Select Option B");
            System.out.println("3. Select Option C");
            System.out.println("0. Exit");
            System.out.print("Enter option: ");
            choice = keyboard.nextInt(); 
            
            switch(choice) {
                case 1: System.out.println("Option A Selected"); break; 
                case 2: System.out.println("Option B Selected"); break;
                case 3: System.out.println("Option C Selected"); break; 
                default: 
                        System.out.println("Default is selected");
            }
            
        } while( choice != 0); 
        
        keyboard.close();
    }
}

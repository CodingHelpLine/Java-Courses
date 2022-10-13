package section2;

/**
 *
 * @author Programmer
 */
public class IfStatements {
    
    /**
     * Entry point of program. 
     * 
     * @param args 
     */
    public static void main(String[] args) {
        
        // What is an if statement
        boolean flag = false; 
        boolean flag2 = false; 
        
        if (flag) {
            // statement
            System.out.println("Im Inside if-block");
            
            if(flag2) {
                System.out.println("I am inside nested if-block");
            } else {
                System.out.println("I am inside nested else-block");
            }
        } else {
            System.out.println("Im inside else block");
            
            if(flag2) {
                System.out.println("I am inside nested if-block");
            } else {
                System.out.println("I am inside nested else-block");
            }
        }
        
        System.out.println("After If-Block");
        
        
        // ------------ Practice relational operators
        // >, <, >=, <= and == and !=
        
        // lets we have two variables
        int x = 5; 
        int y = 7; 
        
        if(x < y) {
            System.out.println("X=5 Less than Y=7");
        } else {
            System.out.println("X=5 Greater than Y=7");
        }
        
        // make statements to test other relational operators
        System.out.println("x=5 greater than y=7 => " + (x > y));
        System.out.println("x=5 less than y=7 => " + (x < y));
        System.out.println("x=5 greater than equal to y=7 => " + (x >= y));
        System.out.println("x=5 less than equal to y=7 => " + (x <= y));
        System.out.println("x=5 equals to => " + (x == y));
        System.out.println("x=5 not equals to y=7 => " + (x != y));
        
        // combine relational or other logical expressions
        // by use of logical operators
        // &, |, ! and condition Or || and conditional && operator
        
        x = 5; 
        y = 7;
        int z = 3;
        
        /*
        And truth table
            A    B
            True  False  False
            True  True    True
            Flase True   false 
            false false  false 
        
        Or Truth table
        
            A    B
            True  False  True
            True  True   True
            Flase True   True 
            false false  False 
        
        
        */
        
        // & and && operators
        if(x >= 7 && x >= z) {
            System.out.println("x >= y and x >= z => True");
        } else {
            System.out.println("x >= y and x >= z => False");
        }
        
        if(x >= 7 | x >= z) {
            System.out.println("x >= y and x >= z => True");
        } else {
            System.out.println("x >= y and x >= z => False");
        }
        
        
        // Not Operator
        // reverses the boolean result
        if(!(x >= z)) {
            System.out.println("x >= z => True");
        } else {
            System.out.println("x >= z => False");
        }        
    }   
}

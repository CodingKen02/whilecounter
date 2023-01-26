/*
 * Name: Kennedy Keyes
 * Date: April 2, 2021
 * Name of Program: WhileCounter.java
 * Description: This program will demonstrate counter-controlled iteration 
with the while iteration statement.
 */
package whilecounter;

/**
 *
 * @author codingken
 */
public class WhileCounter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int counter = 1; // declare and initialize control variable
        
        while (counter <= 10) { // loop-continuation condition
            System.out.printf("%d  ", counter);
            ++counter; // increment control variable
        }
        
        System.out.println();
    }
}

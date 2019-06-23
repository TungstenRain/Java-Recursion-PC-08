package ch16pc08;

import java.util.Scanner;

/**
 * Sum of Numbers
 * Sum the numbers up to the user-input value
 * @author frank
 */
public class Ch16pc08 {

    /**
     * The Main Method
     * @param args String[] The command line arguments
     */
    public static void main(String[] args) {
        // Variables
        int x;
        
        // Instantiate Scanner
        Scanner keyboard = new Scanner(System.in);
        
        // Request user input
        System.out.println("Welcome to Sum of Numbers");
        System.out.print("Please enter the value you want summed: ");
        x = keyboard.nextInt();
        
        // Calculate the result and display it to the user
        System.out.println("The sum of all the numbers to " + Integer.toString(x) +
                " is: " + Integer.toString(sumOfNumber(x)));
    }
    
    /**
     * Sum the numbers from 0 up to the value of the number input
     * @param x int The value of the number to be summed up to
     * @return int The value of the summinb
     */
    private static int sumOfNumber(int x) {
        if (x == 1)
            return 1;
        else
            return sumOfNumber(x - 1) + x;
    }

}

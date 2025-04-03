package simplecalculation;

import java.util.Scanner;  // Import Scanner class for user input

/**
 *
 * @author hp
 */
public class SimpleCalculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Display options to the user
        System.out.println("Simple Calculator");
        System.out.println("Select operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        
        // Get user choice for operation
        int choice = scanner.nextInt();

        // Get two numbers from the user
        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();

        // Perform the operation based on user's choice
        double result = 0;
        switch (choice) {
            case 1:
                result = num1 + num2;  // Addition
                System.out.println("Result: " + result);
                break;

            case 2:
                result = num1 - num2;  // Subtraction
                System.out.println("Result: " + result);
                break;

            case 3:
                result = num1 * num2;  // Multiplication
                System.out.println("Result: " + result);
                break;

            case 4:
                if (num2 != 0) {
                    result = num1 / num2;  // Division
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            case 5:
                result = num1 % num2;  // Modulus
                System.out.println("Result: " + result);
                break;

            default:
                System.out.println("Invalid choice! Please select a valid operation.");
        }

        // Close the scanner object
        scanner.close();
    }
    
}


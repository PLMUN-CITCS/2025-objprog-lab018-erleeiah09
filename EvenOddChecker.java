import java.util.Scanner;

public class EvenOddChecker {

    // Method to get an integer input from the user
    public static int getIntegerInput(Scanner scanner) {
        int number = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter an integer: ");
            
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Clear invalid input
            }
        }
        return number;
    }

    // Method to check if a number is even or odd
    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return number + " is an Even number.";
        } else {
            return number + " is an Odd number.";
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the first integer
        int number1 = getIntegerInput(scanner);
        System.out.println(checkEvenOrOdd(number1));
        
        // Get the second integer
        int number2 = getIntegerInput(scanner);
        System.out.println(checkEvenOrOdd(number2));
        
        scanner.close();
    }
}
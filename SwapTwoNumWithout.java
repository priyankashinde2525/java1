package Day1;
import java.util.Scanner;

public class SwapTwoNumWithout {

public static void main(String[] args) {
             // Create Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

              // A enter two numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Display the numbers before swapping
        
        System.out.println("Before swapping: ");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        // without using a third variable
        num1 = num1 + num2; 
        num2 = num1 - num2;
        num1 = num1 - num2;
        
        System.out.println("After swapping: ");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

    }
}

package Day1;

import java.util.Scanner;

public class SwapTwoNumUsingThird {
	
	    public static void main(String[] args) {
	        // Create Scanner object to read input from the user
	        Scanner sc = new Scanner(System.in);

	        //  enter two numbers
	        System.out.print("Enter first number: ");
	        int num1 = sc.nextInt();

	        System.out.print("Enter second number: ");
	        int num2 = sc.nextInt();

	        // Display the numbers before swapping
	        System.out.println("Before swapping: ");
	        System.out.println("First number: " + num1);
	        System.out.println("Second number: " + num2);

	        // Swap the numbers
	        int temp = num1;
	        num1 = num2;
	        num2 = temp;

	        // Display the numbers after swapping
	        System.out.println("After swapping: ");
	        System.out.println("First number: " + num1);
	        System.out.println("Second number: " + num2);
	        
	       
	    }
	}

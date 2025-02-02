package Day1;

import java.util.Scanner;

public class ifElaseWeek {

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        
		        System.out.print("Enter the month number (1 to 12): ");
		        int day = sc.nextInt();
		        
		        String days = "";
		        int dayinweek= 0;
		        
		        
		        // Using if-else to determine the day of the week
		        if (day == 1) {
		        	
		            days = "Sunday";
		            
		        } else if (day == 2) {
		            days = "Monday";
		            
		        } else if (day == 3) {
		            days = "Tuesday";
		            
		        } else if (day == 4) {
		            days = "Wednesday";
		            
		        } else if (day == 5) {
		            days = "Thursday";
		            
		        } else if (day== 6) {
		            days = "Friday";
		            
		        } else if (day == 7) {
		            days = "Saturday";
		            
		        } else {
		            days = "Invalid day number. Please enter a number between 1 and 7.";
		        }

		        // Display the result
		        System.out.println("The day is: " + days);
		    }
		

	}


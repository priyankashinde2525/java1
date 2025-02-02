package Day1;

import java.util.Scanner;

public class IfElseMonthDetails {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		        
		        System.out.print("Enter the month number (1 to 12): ");
		        int month = sc.nextInt();
		        
		        String monthName = "";
		        int daysInMonth = 0;
		        
		        if (month == 1) {
		            monthName = "January";
		            daysInMonth = 31;
		        } 
		        else if (month == 2) {
		            monthName = "February";
		            daysInMonth = 28; 
		        }
		        else if (month == 3) {
		            monthName = "March";
		            daysInMonth = 31;
		        }
		        else if (month == 4) {
		            monthName = "April";
		            daysInMonth = 30;
		        }
		        else if (month == 5) {
		            monthName = "May";
		            daysInMonth = 31;
		        }
		        else if (month == 6) {
		            monthName = "June";
		            daysInMonth = 30;
		        }
		        else if (month == 7) {
		            monthName = "July";
		            daysInMonth = 31;
		        }
		        else if (month == 8) {
		            monthName = "August";
		            daysInMonth = 31;
		        }
		        else if (month == 9) {
		            monthName = "September";
		            daysInMonth = 30;
		        }
		        else if (month == 10) {
		            monthName = "October";
		            daysInMonth = 31;
		        }
		        else if (month == 11) {
		            monthName = "November";
		            daysInMonth = 30;
		        }
		        else if (month == 12) {
		            monthName = "December";
		            daysInMonth = 31;
		        }
		        else {
		            System.out.println("Invalid month number");
		            
		        }
		        System.out.println("Month: " + monthName);
		        System.out.println("Number of days: " + daysInMonth);
		        		       }
		}
		
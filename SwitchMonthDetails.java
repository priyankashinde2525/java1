package Day1;

import java.util.Scanner;

public class SwitchMonthDetails {

	public static void main(String[] args) {
		
		int Monthday;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a month number : 1-12 ");
		Monthday=sc.nextInt();
		
		switch(Monthday) {
		case 1:
			System.out.println("jan -31 Days ");
			break;
			
		case 2:
			System.out.println("Feb -28 Days ");
			break;
			
		case 3:
			System.out.println("March -31 Days ");
			break;
			
		case 4:
			System.out.println("April -30 Days ");
			break;
			
		case 5:
			System.out.println("May -31 Days ");
			break;
			
		case 6:
			System.out.println("jun -30 Days ");
			break;
			
		case 7:
			System.out.println("july -31 Days ");
			break;
			
		case 8:
			System.out.println("Augest -31 Days ");
			break;
			
		case 9:
			System.out.println("September-30 Days ");
			break;
			
		case 10:
			System.out.println("October-31 Days ");
			break;
			
		case 11:
			System.out.println("November -30 Days ");
			break;
			
		case 31:
			System.out.println("December -31 Days ");
			break;
			
			default:
				System.out.println("wrong info");
		}
	}

}

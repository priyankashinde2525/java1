package Day1;

import java.util.Scanner;

public class MaxOfTwoNum {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter 1st number");
		int num1;
		num1=sc.nextInt();
					
		System.out.println("Enter 2nd number");
		int num2;
		num2=sc.nextInt();
					
		if(num1>num2) {
		System.out.println("max no"+" "+num1);
		}
		else {
		System.out.println("not max no"+" " +num2);
		}
		}

}

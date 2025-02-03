package Day1;

import java.util.Scanner;

public class SwitchCaseUsingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;
		int num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a first num");
		num1=sc.nextInt();
		
		System.out.println("enter second num");
		num2=sc.nextInt();
		
		System.out.println("enter the operation(add,sub,mul,div)");
		char operation=sc.next().charAt(0);
		
		switch(operation) {
		
		case 'a':
			System.out.println("addition perform"+(num1+num2));
			break;
		
		case's':
			System.out.println("subtraction perform"+(num1-num2));
			break;
			
		case'm':
			System.out.println("muliplication perform"+(num1*num2));
			break;
			
		case'd':
			System.out.println("division perform"+(num1/num2));
			break;
			
		
		}
		
		
	}

}

package Day1;

import java.util.Scanner;

public class ArithmaticOperator {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int a;
		int b;
		
		
		System.out.println("enter number");
		int num1=sc.nextInt();
		
        System.out.println("enter second number");
		
		int num2=sc.nextInt();
		
		System.out.println("Addition :" +(num1+num2));
		
		System.out.println("Subtraction :"+(num1-num2) );

		System.out.println("Multiplication:"+(num1*num2));

		System.out.println("Division :" +(num1%num2));

		
	}

}

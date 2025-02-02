package Day1;

import java.util.Scanner;

public class IfElsePossitiveNegative {

	public static void main(String[] args) {

		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		
		if(num>0) {
			System.out.println(" number is possitive no");
		}
		else if(num<0) {
			System.out.println("number is negative no");
		}
		else {
			System.out.println("number is zero");
		}
		
		
	}

}

package Day1;

import java.util.Scanner;

public class DivisibleByNo {

	public static void main(String[] args) {

		int num;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Entr a number");
		num=sc.nextInt();		
		if(num%3==0) {
			System.out.println("divisible by 3");
			}
			else
			
			{
			System.out.println("not divisible by 3");
			}
		}

}
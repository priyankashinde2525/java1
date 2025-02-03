package Day1;

import java.util.Scanner;

public class WhileLoopOddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int num;
		System.out.println("enter a num");
		num=sc.nextInt();
		
		 int i=1;
		 while(i<=num) {
			 System.out.println(i);
			 i=i+2;
		 }

	}

}

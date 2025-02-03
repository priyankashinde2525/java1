package Day1;

import java.util.Scanner;

public class WhileLoopUsingScanner1To10Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int num;
		System.out.println("enter a num till you want to print natural num");
		num=sc.nextInt();
		
		 int i=1;
		 while(i<=num) {
			 System.out.println(i);
			 i++;
		 }

	}

}

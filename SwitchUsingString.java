package Day1;

import java.util.Scanner;

public class SwitchUsingString {

	public static void main(String[] args) {
 
		int num1;
		int num2;
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("ener first num");
		num1=sc.nextInt();
		
		System.out.println("ener second num");
		num2=sc.nextInt();
		
		System.out.println("Enter the operation( add,sub,mul,div)");
		sc.nextLine();
		
		 String operation = sc.nextLine().toLowerCase();
		 
		 switch(operation) {
		 
		 case "add":
			 System.out.println("Addition perform result is" + (num1+num2));
		 break;
		 
		 case "sub":
			 System.out.println("Addition perform result is" + (num1-num2));
		 break;
		 
		 case "div":
			 System.out.println("Addition perform result is "+ (num1%num2));
		 break;
		 
		 case "mul":
			 System.out.println("Addition perform result is"+ (num1*num2));
		 break;
		 
		 
		 }
		 
		 
		 
	}

}

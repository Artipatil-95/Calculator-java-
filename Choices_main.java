package Project;

import java.util.Scanner;

public class Choices_main {
	public static void main(String[] args) {
		System.out.println("welcome to Online Calculator...!");
		Calculator c=new Calculator();
		System.out.println("enter your choice");
		char x=0;
		do {
			System.out.println("press 1:for addition");
			System.out.println("press 2: for sutraction");
			System.out.println("press 3: for multiplication");
			System.out.println("press 4: for  average");
			
			Scanner sc=new Scanner(System.in);
	        int num= sc.nextInt();
			switch (num) {
			case 1:{
				c.addition();
				break;
				
			}
			case 2:{
				c.substact();
				break;
			}
			case 3:{
				c.multi();
				break;
			}
			case 4: {
				c.division();
				break;
			}
			case 5: {
				c.avg();
				break;
			}
			 default : {
				System.out.println("invalid input");
			}
			
			}
			System.out.println("do you want to continue y|n");
			x=sc.next().charAt(0);   // nextInt is string method charAt for taking only one method
			
		}
		while(x=='y' || x=='Y') ;         //because user can give opinion in capital or smaller letter
		
		 System.out.println("thank you...Visit Again...!");
		
		
	

	
}
	
	
}
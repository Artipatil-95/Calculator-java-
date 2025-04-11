package Project;

import java.util.Scanner;

public class Calculator {
	Scanner sc=new Scanner(System.in);             // declare globle
	
		void addition()
		{
			System.out.println("Enter 1st number");
			int a=sc.nextInt();
			System.out.println("Enter 2nd number");
			int b=sc.nextInt();
			int c=a+b;
			System.out.println(c);
		}
		void substact() {
			System.out.println("Enter 1st number");
			int a=sc.nextInt();
			System.out.println("Enter 2nd number");
			int b=sc.nextInt();
			
			int c=a-b;
			System.out.println("c");
			
		}
		void multi() {
			System.out.println("Enter 1st number");
			int a=sc.nextInt();
			System.out.println("Enter 2nd number");
			int b=sc.nextInt();
			int c= a*b;
			System.out.println(c);
		}
		void division() {
			System.out.println("Enter 1st number");
			int a=sc.nextInt();
			System.out.println("Enter 2nd number");
			int b=sc.nextInt();
			int c=a/b;  
			System.out.println(c);
		}
		void avg() {
			System.out.println("Enter 1st number");
			int a=sc.nextInt();
			System.out.println("Enter 2nd number");
			int b=sc.nextInt();
			int c=(a+b)/2;
			System.out.println(c);
		}
	}
	
	



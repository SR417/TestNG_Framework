package Homework;

import java.util.Scanner;

public class MultiplicationTable {
	
	public static void main(String[]args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int input=sc.nextInt();
		
					
			for(int i=1; i<=10; i++) {
				int result = input*i;
				System.out.println(input+"*"+ i + " = "+result);
				
						
		}
		
		
		
		
		
	}

}

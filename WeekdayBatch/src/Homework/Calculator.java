package Homework;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		String yn;
		do {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the first number");
			int num1 = sc.nextInt();
			System.out.println("Enter the second number");
			int num2 = sc.nextInt();
			System.out.println("Select +,-,*,/");
			String ops = sc.next();
			int res;
			switch (ops) {
			case "+":
				res = num1 + num2;
				System.out.println(res);
				break;
			case "-":
				res = num1 - num2;
				System.out.println(res);
				break;
			case "*":
				res = num1 * num2;
				System.out.println(res);
				break;
			case "/":
				res = num1 / num2;
				System.out.println(res);
				break;
			default:
				System.out.println("Invalid symbol");
				break;
			}
			System.out.println("Do you want to continue? Press Y for Yes and N for No");
			yn = sc.next();
			} while (yn.equals("Y"));

	}
}

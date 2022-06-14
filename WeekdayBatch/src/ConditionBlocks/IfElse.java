package ConditionBlocks;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the marks");
		int Student_marks=sc.nextInt();

		if (Student_marks >= 90) {
			System.out.println("Distinction");
		} else if (Student_marks >= 70 && Student_marks < 90) {
			System.out.println("First Class");
		} else if (Student_marks >= 45 && Student_marks < 70) {
			System.out.println("Second Class");
		} else {
			System.out.println("Fail");
		}

	}

}

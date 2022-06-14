package ConditionBlocks;

import java.util.Scanner;

public class IfElse {
	
	 public static void main(String[] args) {
		  
		 /*Syntax

		 if (condition) {
		   // block of code to be executed if the condition is true
		 } else {
		   // block of code to be executed if the condition is false
		 }
		 */
		   
		   
		   /*///IF ---Else IF--Else Syntax
		    * if (condition1) { 
		    * // block of code to be executed if condition1 is true
		    *  }
		    *
		    * else if (condition2) { // block of code to be executed if the condition1 is
		    * false and condition2 is true
		    *  } 
		    * 
		    * else { // block of code to be executed if the
		    * condition1 is false and condition2 is false }
		    */

		   
		   
		   
		   
		    Scanner sc =new Scanner(System.in);
		    System.out.println("Please enter value of a:");
		    int a=sc.nextInt();
		    
		    if(a>67) {
		     System.out.println("hello");
		    } 
		    else if(a<5){
		     System.out.println("hi");
		    
		    }
		    else {
		     System.out.println("no one is matching");
		    }
		   
		    
		    
		    int stdmarks=70;
		  
		  if(stdmarks>=90)
		  {
		   System.out.println("Distinction");
		   
		  }
		  else if(stdmarks>=70 && stdmarks <90)
		  {
		   System.out.println("First class");
		  }
		  else if(stdmarks>=45 && stdmarks <70) 
		  {
		   System.out.println("Second class");
		  }
		  else
		  {
		   System.out.println("Fail");
		  }
		  
		    
		    
		    
		    
		   
		    
		  
		  //Student marks-
		    // marks>=90 --distinction , marks >=70 and <90 - First class, marks >=45 and <70 --second class,
		     //mrks <45 - fail
		   
		   
		   
		   
		  }

}

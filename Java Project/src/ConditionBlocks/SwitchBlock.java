package ConditionBlocks;

public class SwitchBlock {
	
	//syntax 
	 /*
	  * switch(expression){    
	 case value1:    
	  //code to be executed;    
	  break;  //optional  
	 case value2:    
	  //code to be executed;    
	  break;  //optional  
	 ......    
	     
	 default:     
	   code to be executed if all cases are not matched;  
	 }    
	  */
	 
	 
	 
	 
	 public static void main(String[] args) {
	  
	  int day=5;
	  
	  switch(day) {
	  
	  case 1:
	   System.out.println("Monday");
	   
	  case 2:
	   System.out.println("Tuesday");
	   break;
	    
	  case 3:
	   System.out.println("Wendsday");
	   break;
	   
	  case 4:
	   System.out.println("Thursday");
	   break;
	   
	  default: 
	   System.out.println("i am default day");
	  
	  }
	  
	  
	  
	  
	 }

}

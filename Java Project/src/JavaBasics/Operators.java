package JavaBasics;

public class Operators {

	 /*
	 Arithmetic operators--addition,subsctracion.multi.divis.modul,incremenet and decrement
	 Assignment operators =
	 Comparison operators
	 Logical operators*/
	 
	 //Moduas operator remindar 
	 
	 public static void main(String[] args) {
	 
	  float a=30.5f;
	     float b=10.5f;
	  float c=a%b; 
	    System.out.println(c);
	    
	  
	    
	    //increment and decrement operator
	    
	    //Preincrement---
	    
	    int y=6;
	    System.out.println(--y);   //5
	    System.out.println(y);  //5
	    
	    //Postinrement
	    
	    int x=10;
	    System.out.println(x--);  //10
	    System.out.println(x);  //9
	    
	      
	  
	    //Comparison operator-
	    
	  /*  == Equal to x == y 
	    != Not equal x != y 
	    > Greater than x > y 
	    < Less than x < y 
	    >= Greater than or equal to x >= y 
	    <= Less than or equal to x <= y*/
	  
	  
	    
	    int l=20;
	    int m=20;
	    System.out.println(l>m); //false
	    System.out.println(l<m); //false
	    System.out.println(l>=m); //true     
	    System.out.println(l<=m); //true
	    System.out.println(l!=m); //false
	    
	    
	    //logica
	    
	  /*&&    Logical and  Returns true if both statements are true x < 5 &&  x < 10 
	   x < 4 
	  !   Logical not  Reverse the result, returns false if the result is true !(x < 5 && x < 10) 
	      
	  */
	  
	    
	    
	    int z=10;
	    
	    System.out.println(z<9 && z>=20);//flase
	    System.out.println(z<11 || z>=20);//true
	    
	    System.out.println(!(z<11 || z>=20)); //false
	    
	    
	    
	    
	    
	    
	  
	 }
	
}

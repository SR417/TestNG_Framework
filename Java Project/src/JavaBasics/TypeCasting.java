package JavaBasics;

public class TypeCasting {

	/*
	  Widening Casting (automatically) - converting a smaller type to a larger type size--implicit type casting
	byte -> short -> char -> int -> long -> float -> double

	Narrowing Casting (manually) - converting a larger type to a smaller size type----explicit type casting
	double -> float -> long -> int -> char -> short -> byte

	*/
	 
	 
	 public static void main(String[] args) {
	  
	  //Widnening
	  int a=10;
	  float b=a;
	  System.out.println(a); //10
	  System.out.println(b); //10.0
	  
	  
	  
	 
	  //Narrowing
	  float c=7.5f;
	  int d=(int)c;
	  
	  System.out.println(c); //7.5
	  System.out.println(d); //7
	  
	  
	  ////Narrowing
	  
	  double f=7.90d;
	  short g=(short)f;
	  
	  
	    System.out.println(g);
	    
	    
	    //char to int
	    
	    char k='L';
	    int  o=k;
	  
	    System.out.println(o);
	    
	    //short to char-- Exceptional case
	    
	    short p=65;
	    char q=(char)p;
	    
	    System.out.println(q);
	  
	  
	  
	   
	  
	 
	 }

	}

package JavaBasics;

public class TypeCasting {
	public static void main(String[] args) {
		/*
		  Widening Casting (automatically) - converting a smaller type to a larger type size--implicit type casting
		byte -> short -> char -> int -> long -> float -> double

		Narrowing Casting (manually) - converting a larger type to a smaller size type----explicit type casting
		double -> float -> long -> int -> char -> short -> byte

		*/
				
		short a=65;
	    char b=(char)a;
	      
	    byte c=10;
	    long d=c;
	    
	    char e='g';
	    float f=e;
	    
	    double g=25.568;
	    short h=(short)g;
	    
	    byte i=56;
	    char j=(char)i;
	    
	           
	    System.out.println(b);
	    System.out.println(d);
	    System.out.println(f);
	    System.out.println(h);
	    System.out.println(j);
	    
	    
	}
	
     

}

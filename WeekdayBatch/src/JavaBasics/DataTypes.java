package JavaBasics;

public class DataTypes {
	
	public static void main(String[] args) {
		
		/*
		 Primitive data types - includes byte, short, int, long, float, double, boolean and char
		   Non-primitive data types - such as String, Arrays and Classes
		  
		 */
		//java is not 100% object oriented.

		//The main difference between primitive and non-primitive data types are: Primitive types are predefined (already defined) in Java.(does not require any object)
		//Non-primitive types are created by the programmer and is not defined by Java (except for String ). ... A primitive type has always a value, while non-primitive types can be null .

		/*DataType	Size	Description
		byte		1 byte	Stores whole numbers from -128 to 127
		short		2 bytes	Stores whole numbers from -32,768 to 32,767
		int			4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
		long		8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		float		4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
		double		8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
		boolean		1 bit	Stores true or false values
        char		2 bytes	Stores a single character/letter or ASCII values*/
         
		byte a=127;
		System.out.println(a);
		short b=32568;
		System.out.println(b);
		int c=789654111;
		System.out.println(c);
		long d=65454878545132456l;
		System.out.println(d);
		float e=2.548484f;
		System.out.println(e);
		double f=2.5454455554545455155454444;
		System.out.println(f);
		boolean g=true;
		System.out.println(g);
		char h='h';
		System.out.println(h);
		

		//DataType variableName=value;
		
	}

}

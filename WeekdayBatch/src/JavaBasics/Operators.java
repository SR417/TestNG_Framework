package JavaBasics;

public class Operators {
	
	public static void main(String[] args){
		
		 /*
		 Arithmetic operators--addition,subsctracion.multi.divis.modul,increment and decrement
		 Assignment operators =
		 Comparison operators
		 Logical operators
		 */
		
		short a=105;
		char b='c';
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		
		int d=59;
		int e=--d;
		System.out.println(d);
		System.out.println(e);
		
		int f=15;
		int g=f++;
		System.out.println(f);
		System.out.println(g);
		
		
		int h=15;
		int i=59;
		System.out.println(h>i);
		System.out.println(h<i);
		System.out.println(h>=i);
		System.out.println(h<=i);
		System.out.println(h!=i);
		
		
		int j=10;
		int k=20;
		System.out.println(j>=10&&k<15);
		System.out.println(j>=10||k<15);
		System.out.println(!(j>10&&k<15));
		
		
		
	}

}

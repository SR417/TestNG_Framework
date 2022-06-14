package Arrays;

public class SingleDimensionalArray {
	
	public static void main(String[]args) {
		
	int []a= {10,20,30,40,50};
		
	System.out.println(a.length);
	System.out.println(a[3]);
	
	a[2]=60;
	
	//For loop
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
	
	//For each loop
	
	for(int b:a) {
		System.out.println(b);
	}
	
	String []c= {"Sanket","Sham","Prachi"};
	for(int i=0;i<c.length;i++) {
		System.out.println(c[i]);
				
	}
	
	for(String d:c) {
		System.out.println(d);
	}
	
	
	int []k=new int[4];
	
	k[0]=10;
	k[1]=20;
	k[2]=30;
	k[3]=40;
	
	
	for (int i=k.length-1;i>=0;i--) {
		System.out.println(k[i]);
	}
	
	
	
	
	
	
	
	}
	
	
}

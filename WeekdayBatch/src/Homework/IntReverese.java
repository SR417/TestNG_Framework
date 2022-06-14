package Homework;

public class IntReverese {
	
	public static void main(String[]args) {
		
		int a=59873;
		int temp=0;
		int reminder;
		
		
		while(a!=0){
		reminder=a%10;
		temp=temp*10+reminder;
		a=a/10;
		}
		
		System.out.println(temp);
		
	}

}

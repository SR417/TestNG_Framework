package Homework;

public class Prime_Number 
{

	public static void main(String[] args)
	{
		
		for(int no=2;no<=100;no++)
		{
			int temp=0;
			for(int i=2;i<=no-1;i++)
			{
				if(no%i==0)
				{
					temp=temp+1;
				}
				
			}
			if(temp==0)
			{
				System.out.print(no+" ");
			}
			
		}
	
		/*
		 * for(int i=2;i<100;i++) {
  int temp=0;
  
  for(int j=2;j<=i-1;j++) {
   
   if(i%j==0) {
    temp=temp+1;
   }
   
  }
  if(temp==0) {
   System.out.println(i+"is prime number");
  }
  
 }
		 */
		
		
		
		
	}
}

	
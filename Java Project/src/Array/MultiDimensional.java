package Array;

public class MultiDimensional {
	
	public static void main(String[] args) {
		  // TODO Auto-generated method stub
		  
		  
		              //0th array     //1st Array
		  int a[][]= {{10,20,30,40},{50,60,70,80}};
		  
		  
		  //First bracket-- Which array;
		  
		  //second bracket --which index;
		   System.out.println(a[1][0]);
		   
		    System.out.println(a.length); //2
		    
		    System.out.println(a[0].length);  //4
		    System.out.println(a[1].length); //4
		    
		    
		 
		 for (int i = 0; i < a.length; i++) {   //outer for loop
		  
		  for (int j = 0; j < a[i].length; j++) { //inner for loop
		   System.out.println(a[i][j]);
		  }
		  
		 }
		  
		    
		    
		    //a[0][0]=10
		 
		 //a[0][1]=20
		 
		    //a[0][2]=30
		 
		 //a[0][3]=40
		    
		  //a[1][0]=50
		 //a[1][1]=60
		 //a[1][2]=70
		 //[1][3]=80
		 
		   
		   

		 }

}

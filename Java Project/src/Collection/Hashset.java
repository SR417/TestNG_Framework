package Collection;

import java.util.HashSet;

public class Hashset {
	
	//Set-Interface
	 //HashSet- is class
	 
	 //Seqeunce is not fixed
	 //Duplicates values are not allowed
	 //only single null is allowed
	 
	 public static void main(String[] args) {
	  
	  HashSet<Integer> obj=new HashSet<Integer>();
	  
	  obj.add(1);
	  obj.add(30);
	  obj.add(20);
	  obj.add(12);
	  obj.add(12);
	  
	  System.out.println(obj);
	  
	  obj.remove(12);
	  
	  System.out.println(obj);
	  
	  
	  System.out.println(obj.size());
	  System.out.println(obj.contains(20));
	  
	  //for each loo
	  for(int p:obj) {
	   System.out.println(p);
	  }
	  
	 
	  
	  
	 }

}

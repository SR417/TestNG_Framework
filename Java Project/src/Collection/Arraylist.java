package Collection;

import java.util.ArrayList;

public class Arraylist {
	
	//List---- interface
	 //ArrayList-- is class
	 //Duplciate values are alllowed
	 //sequence is fixed
	 //any number of null values are allowed
	 
	 /*The ArrayList class is a resizable array, which can be found in the java.util package.

	 The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified (if you want to add or remove elements to/from an array, you have to create a new one). While elements can be added and removed from an ArrayList whenever you want.
	 */
	 
	 public static void main(String[] args) {
	  // TODO Auto-generated method stub

	  
	  ArrayList<String> obj=new ArrayList<String>();
	  
	  obj.add("rahul");
	  obj.add("ramesh");
	  obj.add("ram");
	  obj.add("ram");
	  
	  
	 // System.out.println(obj.get(2)); //To print the value on specici index
	 
	  /*
	  obj.add(2, "mahesh"); //Added the value at specific index
	   
	  System.out.println(obj);
	  
	  obj.remove(3);  //remove the specific index value
	  
	  System.out.println(obj);
	  
	  System.out.println(obj.size()); //To verify the size
	  
	  obj.set(0, "temp") ; //to replace the value
	  
	  System.out.println(obj);
	 
	  obj.clear();//To clear the arrayList
	  System.out.println(obj);*/
	  
	  
	  //For each loop
	  for(String k:obj) {
	   System.out.println(k);
	  }
	  
	  //For loop
	  for(int i=0;i<obj.size();i++) {
	   
	   System.out.println(obj.get(i));
	  }
	  
	  
	 }

}

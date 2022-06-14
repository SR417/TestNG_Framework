package Collection;

import java.util.ArrayList;

public class ArrayListInJava {

	public static void main(String[] args) {
		
		
		
		//List= Interface
		//Arraylist=Class
		//Sequence is fixed.
		//Duplicate values are allowed.
		//Any number of null values are allowed.

		ArrayList<String> obj = new ArrayList<String>();
		obj.add("Rahul");
		obj.add("Sanket");
		obj.add("Ram");
		obj.add("Janu");
		obj.size();
		obj.add(1, "Radha"); //Added to the specific index value
		obj.remove(3);  //Remove the specific index value
		System.out.println(obj.size());
		obj.set(2, "Deepali"); //Remove the specific index value
		System.out.println(obj);
		//obj.clear();
		//System.out.println(obj);
		obj.get(2);
		
		for(String k:obj) {
			System.out.println(k);
		}
		/*
		for(int i=0;i<obj.size();i++) {
			System.out.println(obj.get(i));
			
		}
*/
	}

}

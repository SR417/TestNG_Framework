package Collection;

import java.util.HashSet;

public class HashSet_Demo {
	
	public static void main(String[] args) {
		
		//Set=Interface
		//HashSet=Class
		//Sequence is not fixed.
		//Duplicate values are not allowed.
		//only single null value allowed
	
	
	HashSet<Integer> obj = new HashSet<Integer>();
	obj.add(1);
	obj.add(20);
	obj.add(12);
	obj.add(12);
	obj.add(30);
	//obj.add(null);
	obj.remove(12);
	System.out.println(obj);
	System.out.println(obj.size());
	System.out.println(obj.contains(20));
	
	for(int k:obj) {
		System.out.println(k);
	}
	

	
	
	}
}

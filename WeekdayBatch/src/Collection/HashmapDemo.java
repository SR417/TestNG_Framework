package Collection;

import java.util.HashMap;

public class HashmapDemo {
	
	public static void main(String[] args) {
		
		
		//Map=Interface
		//Hashmap=Class
		//Sequence is not fixed.
		//Duplicate values are not allowed.
		//Key and value
		//Single null key and multiple null values are allowed.
		HashMap<String, String> obj = new HashMap<String, String>();
		obj.put("MH", "Mumbai");
		obj.put("Guj", "Gandhinagar");
		obj.put("Goa", "Panaji");
		obj.put("Kar", "Bangalore");
		obj.put("Kar", null);
		obj.put(null, null);
		System.out.println(obj);		
		System.out.println(obj.keySet()); //print keys
		System.out.println(obj.values()); //print values
		System.out.println(obj.get("Guj")); //print value of key
		System.out.println(obj.remove("Kar")); //print value of key
		System.out.println(obj);	
		System.out.println(obj.size());
		//obj.clear();
		//System.out.println(obj);
		
		
		//Printing both key and values using for each loop
		for (String p:obj.keySet()) {
			System.out.println(p+"="+obj.get(p));
		}
				
		
		
		
	}
	

}

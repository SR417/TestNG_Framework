package Collection;

import java.util.HashMap;

public class HashMapDemo {
	
	//Map-interface
	 //HashMap-class
	 //duplciates values are not allowed
	 //Sequence is not fixed
	 
	 
	 /*Null values
	  Hashmap: It can contain a single null key and multiple null values. 
	  Hashset: It can contain a single null value.
	  
	 */
	 
	 public static void main(String[] args) {
	  
	  HashMap<String, String> obj=new HashMap<String, String> ();
	  
	  obj.put(null, null);
	  obj.put("gujrat", null);
	  obj.put("Kar", "banaglore");
	  obj.put("Mp", "lakh");
	  obj.put("Kar", "banaglore");
	  
	  System.out.println(obj);
	  
	  System.out.println(obj.keySet()); //print only keys
	  System.out.println(obj.values()); // print only values
	  
	  System.out.println(obj.get("Mp")); //To print the value of specific keys
	  
	  obj.remove("Kar");
	  System.out.println(obj);
	  System.out.println(obj.size());
	 // obj.clear();
	 // System.out.println(obj);
	  
	  
	  //Both key and value print
	  
	  
	  for(String p:obj.keySet()) {
	   System.out.println(p+"="+obj.get(p));
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	 }

}

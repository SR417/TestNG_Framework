package JavaBasics;

public class StringOperations {

	public static void main(String[] args) {
        //0          //13
    String s="Rahul is my name";
 
    //Length-- Will always starts from 1
    //index-- will always starts from 0

    
 //   String k=s.toUpperCase();
 //   System.out.println(k);
    
 
   System.out.println(s.toUpperCase());  //to convet capita letters
   System.out.println(s.toLowerCase());// to convert small leters
   System.out.println(s.length()); //To find length of sting-- it include spaces also-
   System.out.println(s.charAt(6)); // This will give the charcter at specicc index
   System.out.println(s.indexOf("a"));  //This will give the index of specic character
   System.out.println(s.lastIndexOf("a"));   //This will return the last index
   
   
   String a="rahul";
   String b="test";
   
  System.out.println(a+" "+b);
  
  //String concatanation--
  System.out.println(a.concat(" "+b)); 
  
  
  //Escape character--  /
  
  //My name is "Rahul" test
  
 
    String k= "My name is \"Rahul\" Test";
    System.out.println(k);
    
   
    String m="i love \\ character";
    System.out.println(m);
    
    String p="this is \\@ char";
    System.out.println(p);
    
    
    
    //Substring  
    String t="my name is rahul";
    System.out.println(t.substring(4));
    
   // t.sub
    
    //end index==  endIndex+1=
                     //  12+1=

    
                                //Beign index EndIndex+1
    System.out.println(t.substring(3, 10));
    
    
    
    
    
  
  String j="hello java";
  System.out.println(j.contains("hello1"));
  
   
  
  //Homewwrk
//contains, equals, trim, replace,  Split--
   
   
   
   
   
    
   
   
    
    
    
    
    
    
    
    
    
    
    
    



}
	
}

package Encapsulation;

/*
 * Encapsulation
The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:

declare class variables/attributes as private
provide public get and set methods to access and update the value of a private variable

 */

public class Demo {

 // TODO Auto-generated method stub
    private String newName;
    
    //private String name;// private = restricted access
                    
  
                               //john
 public void setName(String name) {//To set the the value
                       
                 //john
  newName =name;  //update the value of private varaible
  
  //newName==john
 }
 
 public String getName() {//to get the value
  return newName;
  
  //john
 }
        

 
 



 /*
  * The get method returns the value of the variable name.
  * 
  * The set method takes a parameter (newName) and assigns it to the name
  * variable. The this keyword is used to refer to the current object.
  */

}

/*
 * Better control of class attributes and methods Class attributes can be made
 * read-only (if you only use the get method), or write-only (if you only use
 * the set method) Flexible: the programmer can change one part of the code
 * without affecting other parts Increased security of data
 */

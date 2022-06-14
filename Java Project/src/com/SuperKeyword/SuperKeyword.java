package com.SuperKeyword;

//public class SuperKeyword {
 class A
 {
  int no=10;
 }
 
 
 class B extends A
 {
  int no=20;  
  void show(int n)
  {

   System.out.println(n);      
   System.out.println(this.no); 
   System.out.println(super.no); 
  }
 }

 class SuperAndThisKeyword
 {
  public static void main(String[] args)
  {
   B ob=new B();
   ob.show(30);
   
   
   
  }
 }


 
 
 
 
 
 
 
 
 
 
 
   

 


/*
-> The super keyword is a reference variable
which is used to refer immediate parent class object
-> Use of super keyword :-
1. super keyword can be used to refer the
immediate parent class instance variable
2. super keyword can be used to invoke
parent class method
3. super keyword is used to invoke parent
class constructor
-> If we dont provide super() in
constructor then compiler provides it implicitly
-> super() should always be the first
statement in constructor*/
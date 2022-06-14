package TestNG;

import org.testng.annotations.Test;

public class parallelDemo {
 
 
 @Test
 public void method1() {
  System.out.println("hello");
    System.out.println("The thread ID for method1 "+ Thread.currentThread().getId());
 }

 @Test
 public void method2() {
  System.out.println("hii");
   System.out.println("The thread ID for method2 "+ Thread.currentThread().getId());
 }

}

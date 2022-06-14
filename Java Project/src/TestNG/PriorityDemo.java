package TestNG;

import org.testng.annotations.Test;

public class PriorityDemo {
 
 @Test(priority=1)
 public void amethod1() {
  System.out.println("method1");
 }
 
 @Test(priority=3)
 public void method2() {
  System.out.println("method2");
 }
 @Test(priority=0)
 public void method3() {
  System.out.println("method3");
 }
 
 @Test()
 public void method7() {
  System.out.println("method7");
 }
 
 @Test(priority=-1)
 public void method4() {
  System.out.println("method4");
 }

}

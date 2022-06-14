package TestNG;

import org.testng.annotations.Test;

public class GroupsDemo {
 
 @Test(groups= {"smokeTestcases"})
 public void method1() {
  System.out.println("method1");
 }
 

 @Test(groups= {"smokeTestcases"})
 public void method3() {
  System.out.println("method3");
 }
 
 @Test(groups= {"RegressionTestcases"})
 public void method2() {
  System.out.println("method2");
 }

}

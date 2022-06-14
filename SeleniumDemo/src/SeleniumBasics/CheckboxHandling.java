package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxHandling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\y8rurw\\Desktop\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// We can store xpath to link similar to data type and use it for operations.
		WebElement a = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		a.click();
		System.out.println(a.isDisplayed()); //true
		System.out.println(a.isEnabled()); //true
		System.out.println(a.isSelected()); //true
		// To operate on multiple objects at same time.
		List<WebElement> b = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		/*
		 * System.out.println(b.size()); for(WebElement d:b) { d.click();
		 */

		// diff between findelement and findelements:
		// findelement: used When we have single element. error will be thrown if value is incorrect.
		// findelements: used When we have multiple element. error will not be thrown if value is incorrect.
		for (int i = 0; i < 2; i++) {
			b.get(i).click();
		}
		
		

	}

}
package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\y8rurw\\Desktop\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("us");
		Thread.sleep(3000);
		/*
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys(Keys.ENTER);
		*/
		
		List<WebElement> obj=driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
		for(WebElement a:obj) {
			if(a.getText().equalsIgnoreCase("Belarus")) {
				a.click();
				break;
			}
				
			
		}
		
		
		
	}

}

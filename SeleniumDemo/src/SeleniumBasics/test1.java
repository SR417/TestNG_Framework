package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {
	
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\y8rurw\\Desktop\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //WebDriver: Interface; ChromeDriver: Class
        //To navigate to URL
        driver.get("https://amazon.com");
        //maximize the window
        driver.manage().window().maximize();
        //To Print the title of the page.
        System.out.println(driver.getTitle());
        //To Print the URL
        System.out.println(driver.getCurrentUrl());
        //To move backward
		driver.navigate().back();
		Thread.sleep(3000);
		//To move forward
		driver.navigate().forward();
		//To refresh the page
		driver.navigate().refresh();
		//To close the current opened browser. 
		driver.close();
		//To close all opened browsers. 
		driver.quit();
		driver.get("https://amazon.com");
		
		/*diff between driver.close and driver.quit: 
		 * driver.close: if any url is opened after close, error is Invalid session ID. so it does not terminate the session, it generates new session ID.
		 * driver.quit: if any url is opened after close, error is session ID is null. So it terminates the session and does not generate new session ID.
		 */
		
	}

}

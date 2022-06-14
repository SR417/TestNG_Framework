package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public WebDriver driver;
	public Properties prop;
	

	public WebDriver driverInitialization() throws IOException {

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\Data1.properties");
		prop = new Properties();
		prop.load(fis);
		String browsername = prop.getProperty("browser");

		if (browsername.contentEquals("chrome")) {
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\y8rurw\\Desktop\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		}

		else {
			System.out.println("Please input correct browser name");
		}
		return driver;
	}
	
	@BeforeMethod
	public void launchDriver() throws IOException {
		
		driver=driverInitialization();
		driver.get(prop.getProperty("url"));
	}
	
	@AfterMethod
	public void closedriver() {
		driver.close();
	}

}

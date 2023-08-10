package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class TestBase extends AbstractTestNGCucumberTests {
	
	public static WebDriver driver;
	
	
//	public static ChromeOptions chromeOption() {
//		String chrome = System.getProperty("user.dir")+"\\Chrome_Driver\\chromedriver.exe";   
//		System.setProperty("webdriver.chrome.driver", chrome);
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		return options;
//	}

	@BeforeMethod
	public void setup() {
		//String chrome = System.getProperty("user.dir")+"\\Chrome_Driver\\ChromeDriver-104.exe";
		String chrome = System.getProperty("user.dir")+"\\Chrome_Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		//options.addArguments("--headless");
		driver =  new ChromeDriver(options);
		driver.manage().window().maximize();
	}
	
//	@AfterMethod
//	public void teardown() {
//		driver.close();
//		driver.quit();
//	}
	
	
}

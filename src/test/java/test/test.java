package test;

import java.awt.Desktop.Action;
import java.lang.reflect.Array;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;



public class test extends TestBase {
	
	
	
	
	@Test
	public void help() throws InterruptedException {
		
		//driver.get("http://10.0.79.215:8088/vision-dashboard-qmg/");
		LoginPage loginobject = new LoginPage(driver);
		loginobject.loadPage();
		loginobject.click_EnglishLanguage();
		loginobject.text_Username("seaport_demo");
		loginobject.text_Password("1");
		loginobject.click_Login();
		loginobject.implicitlyWait();
		loginobject.click_BorderControl();
		loginobject.click_SeaPort();
//		ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
//		System.out.println(tab.size());
//		driver.switchTo().window(tab.get(1));
//		
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		WebElement e = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[1]/form/div/div/div[1]/div/div/ul/li[1]/a"));
//		
//		
//		Actions act =  new Actions(driver);
//		
//		act.moveToElement(e).perform();
		
		HomePage homepageobject = new HomePage(driver);
		//homepageobject.implicitlyWait();
		Thread.sleep(3000);
		homepageobject.windowSwitch(1);
		homepageobject.mouse_hover(homepageobject.mouseHover_VesselOwnerParent());
		homepageobject.mouse_hover(homepageobject.mouseHover_VesselOwnerSub());
		homepageobject.click_OwnerRegistration();
//		WebElement e1 = driver.findElement(By.partialLinkText("Vessels' Owners"));
//		act.moveToElement(e1).perform();
		
		
		
		
		//driver.findElement(By.partialLinkText("Owner Registration")).click();
		
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame("frame1");
		driver.findElement(By.id("j_idt44")).click();
		driver.findElement(By.id("j_idt44")).sendKeys("EGYPT");
		driver.findElement(By.id("nameEn")).sendKeys("jerrjhgjy");

		driver.findElement(By.id("blackListSearchFocusIdAr")).click();
		
//		driver.findElement(By.id("j_idt44")).click();
//		driver.findElement(By.id("j_idt44")).sendKeys("EGYPT");
		Thread.sleep(5000);
	//	WebElement ele =  driver.findElement(By.id("j_idt60"));
	//	act.doubleClick(ele).perform();
		driver.findElement(By.id("j_idt60")).click();
//		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click()", ele);
		
		Thread.sleep(5000);
		String errormsg = driver.findElement(By.xpath("/html/body/div[6]/div/div/div[1]/span")).getText();
		System.out.println(errormsg);
		Assert.assertEquals("Owner Already Exist", errormsg);
	}
	

	//@Test
//	public void approval() throws InterruptedException {
//		
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		Thread.sleep(3000);
//	
//		ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
//		System.out.println(tab.size());
//		driver.switchTo().window(tab.get(1));
//		
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		WebElement e = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[1]/form/div/div/div[1]/div/div/ul/li[1]/a"));
//		
//		
//		Actions act =  new Actions(driver);
//		
//		act.moveToElement(e).perform();
//		
//		WebElement e1 = driver.findElement(By.partialLinkText("Vessels' Owners"));
//		act.moveToElement(e1).perform();
//		
//		
//		
//		
//		driver.findElement(By.partialLinkText("Owner Registration")).click();
//		
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.switchTo().frame("frame1");
//		driver.findElement(By.id("j_idt44")).click();
//		driver.findElement(By.id("j_idt44")).sendKeys("EGYPT");
//		driver.findElement(By.id("nameEn")).sendKeys("jhrtjkkyuigjsy");
//
//		driver.findElement(By.id("blackListSearchFocusIdAr")).click();
//		
//		//driver.findElement(By.id("j_idt44")).click();
//		//driver.findElement(By.id("j_idt44")).sendKeys("EGYPT");
//		Thread.sleep(4000);
//	//	WebElement ele =  driver.findElement(By.id("j_idt60"));
//	//	act.doubleClick(ele).perform();
//		driver.findElement(By.xpath("/html/body/div[1]/div/form/div/div/span/span/div[2]/div/a[1]")).click();
//		//Thread.sleep(4000);
//		//	WebElement ele =  driver.findElement(By.id("j_idt60"));
//		//	act.doubleClick(ele).perform();
//		//driver.findElement(By.id("j_idt60")).click();
////		
////		JavascriptExecutor js = (JavascriptExecutor) driver;
////		js.executeScript("arguments[0].click()", ele);
//		
//		Thread.sleep(5000);
//		String errormsg = driver.findElement(By.id("j_idt65")).getText();
//		//System.out.println(errormsg);
//		//Assert.assertEquals("Owner registered successfully", errormsg);
//		Assert.assertTrue(errormsg.contains("Owner registered successfully"),"Failure message");
//		
//		driver.findElement(By.id("j_idt65:j_idt68")).click();
//		
//		driver.switchTo().frame("frame2");
//		String title = driver.findElement(By.id("formLayoutPanel1")).getText();
//		Assert.assertTrue(title.contains("Vessel Registration"),"Failure message");
//	}
}

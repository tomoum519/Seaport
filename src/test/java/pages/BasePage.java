package pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Random;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	private String lexicon = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	private String numbers = "123456789";

	private Random rand = new Random();
	
	public WebDriver driver;
	
	public String page_url;
	
	public JavascriptExecutor js;
	
	private Select select;
	

	
	
	private By vesselowner_parentmenu = By.linkText("Vessels / Owners");
	private By vesselowner_submenu = By.partialLinkText("Vessels' Owners");
	private By ownerregistration_menu = By.partialLinkText("Owner Registration");
	private By ownersearch_menu = By.partialLinkText("Owner Search");
	private By vessels_menu = By.linkText("Vessels");
	private By vesselsregistration_menu = By.partialLinkText("Vessel Registration");
	private By vesselspermit_menu = By.linkText("Vessels' Permits");
	private By vesselsearch_menu = By.linkText("Vessel Search");

	
	public BasePage(WebDriver driver) {
		
		this.driver = driver;
		js = (JavascriptExecutor) driver;
		//PageFactory.initElements(driver, this);
	}

	public void loadPage() {
		
		driver.get(page_url);
	}
	
	public String getPageUrl() {
		
		return page_url;
		
	}
	
	protected void clickElement(By element) {
		driver.findElement(element).click();
	}
	
	protected boolean isDisplayed(By element) {
		return driver.findElement(element).isDisplayed();
	}
	
	protected Select dropdown(By element) {
		return select = new Select(driver.findElement(element));
	}
	
	protected void dropdownvalue(Select dropdown,String value) {
		dropdown.selectByValue(value);
	}
	
	protected boolean isSelected(By element) {
		return driver.findElement(element).isSelected();
	}
	
	protected void sendtext(By element, String text) {
		driver.findElement(element).sendKeys(text);
	}
	
	public void windowSwitch(int window_index) throws InterruptedException {
		ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(tab);
		driver.switchTo().window(tab.get(window_index));
		
	}
	
	public void mouse_hover(WebElement e) {
		Actions act =  new Actions(driver);
		act.moveToElement(e).perform();
	}
	
	public void implicitlyWait () {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void switchIframe(String iframe) {
		driver.switchTo().frame(iframe);
	}
	
	public void switchBackIframe() {
		driver.switchTo().defaultContent();
	}
	
	protected String getText(By element) {
		return driver.findElement(element).getText();
	}
	
	protected void clearText(By element) {
		driver.findElement(element).clear();
	}
	
	protected WebElement onlyElement(By element) {
		return driver.findElement(element);
	}
	
	public void sleepWait () throws InterruptedException {
		Thread.sleep(1000);
	}
	
	public String randomName() {
	    StringBuilder builder = new StringBuilder();
	    while(builder.toString().length() == 0) {
	        int length = rand.nextInt(7)+7;
	        for(int i = 0; i < length; i++) {
	            builder.append(lexicon.charAt(rand.nextInt(lexicon.length())));
	        }
	    }
	    return builder.toString();
	}
	
	public String randomNumber() {
	    StringBuilder builder = new StringBuilder();
	    while(builder.toString().length() == 0) {
	        int length = rand.nextInt(7)+7;
	        for(int i = 0; i < length; i++) {
	            builder.append(numbers.charAt(rand.nextInt(numbers.length())));
	        }
	    }
	    return builder.toString();
	}
	
	public void scrolldown() {
		
		js.executeScript("window.scrollBy(0,3550)", "");
	}
	
	public void scrollIntoViewElement(WebElement element) {
		
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	
	public WebElement mouseHover_VesselOwnerParent() {
		return driver.findElement(vesselowner_parentmenu);
	}
	
	public WebElement mouseHover_VesselOwnerSub() {
		return driver.findElement(vesselowner_submenu);
	}
	
	public void click_OwnerRegistration() {
		clickElement(ownerregistration_menu);
	}
	
	public void click_OwnerSearch() {
		clickElement(ownersearch_menu);
	}
	
	public void click_VesselSearch() {
		clickElement(vesselsearch_menu);
	}
	
	public WebElement mouseHover_Vessels() {
		return driver.findElement(vessels_menu);
	}
	
	public void click_VesselRegistration() {
		clickElement(vesselsregistration_menu);
	}
	
	public void click_VesselPermit() {
		clickElement(vesselspermit_menu);
	}
	
	protected void uploadFile(By element,String filename) {
		String  filepath=System.getProperty("user.dir")+"\\upload\\" +filename;
		sendtext(element,filepath);
	}
}

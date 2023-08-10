package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends BasePage {

	
	private By english_button = By.className("form-control");
	private By username_text = By.name("username");
	private By password_text = By.name("password");
	private By login_button = By.className("vsnboard-login-form-submit-btn");
	private By bordercontrol_bar = By.xpath("/html/body/app-root/div/app-dashboard/div[2]/div[1]/section/div/div[1]");
	private By seaport_button = By.xpath("/html/body/app-root/div/app-dashboard/div[2]/div[1]/section/div/div[2]/div[4]");

	
	public LoginPage(WebDriver driver) {
		super(driver);
		//this.page_url = "http://10.0.79.215:8088/vision-dashboard-qmg/";
		this.page_url = "https://qmgvsn.e-vision.ae/vision-dashboard-qmg";
		// TODO Auto-generated constructor stub
	}
	
	public void click_EnglishLanguage() {
		clickElement(english_button);
	}
	
	public void text_Username(String username) {
		sendtext(username_text,username);
	}
	
	public void text_Password(String password) {
		sendtext(password_text,password);
	}
	
	public void click_Login() {
		clickElement(login_button);
	}
	
	public void click_BorderControl() {
		clickElement(bordercontrol_bar);
	}
	
	public void click_SeaPort() {
		clickElement(seaport_button);
	}

}

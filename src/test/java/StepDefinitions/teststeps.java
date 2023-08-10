package StepDefinitions;

import io.cucumber.java.en.Given;
import pages.LoginPage;
import test.TestBase;

public class teststeps extends TestBase {
	
	LoginPage loginobject = new LoginPage(driver);
	@Given("login Vission Dashboard and go to SeaPort username {string} and password {string}")
	public void login(String username,String password) {
		
		
		loginobject.loadPage();
		loginobject.click_EnglishLanguage();
		loginobject.text_Username(username);
		loginobject.text_Password(password);
		loginobject.click_Login();
		loginobject.implicitlyWait();
		loginobject.click_BorderControl();
		loginobject.click_SeaPort();
	   
	}

}

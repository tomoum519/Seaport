package StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import DataProvider.ConfigFileUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import pages.OwnerSearchPage;
import pages.RegisterOwnerPage;
import pages.VesselRegistrationPage;
import test.TestBase;

public class OwnerRegistrationSteps extends TestBase {
	
	
	
	LoginPage loginobject = new LoginPage(driver);
	HomePage homepageobject = new HomePage(driver);
	RegisterOwnerPage registerOwnerobject = new RegisterOwnerPage(driver);
	VesselRegistrationPage vesselregisterationobject = new VesselRegistrationPage(driver);
	OwnerSearchPage ownersearchobject = new OwnerSearchPage(driver);
	public String randomname = registerOwnerobject.randomName();
	
	@Given("login Vission Dashboard and go to SeaPort")
	public void login() {
		
		
		loginobject.loadPage();
		loginobject.click_EnglishLanguage();
		loginobject.text_Username("seaport_demo");
		loginobject.text_Password("1");
		loginobject.click_Login();
		loginobject.implicitlyWait();
		loginobject.click_BorderControl();
		loginobject.click_SeaPort();
	   
	}
	
	@And("switch window")
	public void switchwindow() throws InterruptedException {
		
		Thread.sleep(1000);
		homepageobject.windowSwitch(1);
		
	}
	
	@And("User navigate to Owner Registration")
	public void goToOwnerRegistrationPage() throws InterruptedException {
		
		homepageobject.mouse_hover(homepageobject.mouseHover_VesselOwnerParent());
		homepageobject.mouse_hover(homepageobject.mouseHover_VesselOwnerSub());
		homepageobject.click_OwnerRegistration();
	}
	
	
	@When("Register a old owner name {string} and nationality {string}")
	public void createOldOwner(String name,String nationality)throws IOException, InterruptedException {
		
		registerOwnerobject.switchIframe("frame1");
		registerOwnerobject.click_Nationality();
		registerOwnerobject.text_Nationality(nationality);
		registerOwnerobject.text_EnglishName(name);
		registerOwnerobject.sleepWait();
		registerOwnerobject.click_TranslatToArabic();
		registerOwnerobject.sleepWait();
		registerOwnerobject.click_Save();
		
	}
	
	@Then("msg will appear {string}")
	public void checkErrorMsg(String errormsg) throws IOException, InterruptedException {
		
		Assert.assertEquals(errormsg,registerOwnerobject.get_ErrorMsg());
		
	}
	
	@When("Register a new owner name and nationality {string}")
	public void createNewOwner(String nationality)throws IOException, InterruptedException {
		
		registerOwnerobject.switchIframe("frame1");
		registerOwnerobject.click_Nationality();
		registerOwnerobject.text_Nationality(nationality);
		registerOwnerobject.text_EnglishName(randomname);
		registerOwnerobject.sleepWait();
		registerOwnerobject.click_TranslatToArabic();
		registerOwnerobject.sleepWait();
		registerOwnerobject.click_Save();
		
	}
	
	@Then("msg will contain {string}")
	public void checkSuccMsg(String succmsg) throws IOException, InterruptedException {
		registerOwnerobject.sleepWait();
		Assert.assertTrue(registerOwnerobject.get_SuccMsg().contains(succmsg),registerOwnerobject.get_SuccMsg());
		
		
	}

	@Then("go to vessal page and the title")
	public void checkvesselpage() throws IOException, InterruptedException {
		
		registerOwnerobject.click_YesOnPopUp();
		vesselregisterationobject.sleepWait();
		vesselregisterationobject.switchBackIframe();
		vesselregisterationobject.switchIframe("frame2");
		Assert.assertTrue(vesselregisterationobject.get_PageTitle().contains("VESSEL REGISTRATION"),vesselregisterationobject.get_PageTitle());
		
	}
	
	@And("Check that stay in the same page after click NO")
	public void clickNoAndCheckTital() throws InterruptedException {
		registerOwnerobject.click_NoOnPopUp();
		//Assert.assertTrue(registerOwnerobject.get_OwnerRegistrationTital().contains("Register Owner"),"Failure message");
	}
	
	@Then("navigate to owner search")
	public void navigateToOwnerSearch() throws IOException, InterruptedException {
		homepageobject.mouse_hover(homepageobject.mouseHover_VesselOwnerParent());
		homepageobject.mouse_hover(homepageobject.mouseHover_VesselOwnerSub());
		homepageobject.click_OwnerSearch();
		
	}
	
	@And("Enter english name in owner search page")
	public void enterEnglishNameInOwnerSearchPage() throws InterruptedException {
		ownersearchobject.text_EnglishName(randomname);
	}
	
	@And("Click search in owner search page")
	public void clickSearchInOwnerSearchPage() throws InterruptedException {
		ownersearchobject.sleepWait();
		ownersearchobject.click_Search();
	}
	
	@And("Click search result row")
	public void clickSearchResultRowInOwnerSearchPage() throws InterruptedException {
		ownersearchobject.click_RowTable();
	}
	
	@And("Click edit in owner search page")
	public void clickEditInOwnerSearchPage() throws InterruptedException {
		ownersearchobject.click_Edit();
	}
	
	@And("Update english name in owner search page")
	public void updateEnglishNameInOwnerSearchPage() throws InterruptedException {
		ownersearchobject.sleepWait();
		ownersearchobject.click_EditEnglishName();
		ownersearchobject.text_EditEnglishName("QS");
	}
	
	@And("Click update in owner search page")
	public void clickUpdateInOwnerSearchPage() throws InterruptedException {
		ownersearchobject.click_Update();
	}
	
	@And("Updated successfully msg {string}")
	public void updateOwnerUser(String msg) throws InterruptedException {
		
		Assert.assertEquals(ConfigFileUtils.getProperty(msg),ownersearchobject.get_UpdateSuccMsg(),ownersearchobject.get_UpdateSuccMsg());
	}
}

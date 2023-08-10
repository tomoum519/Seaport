package StepDefinitions;

import org.testng.Assert;

import DataProvider.ConfigFileUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.VesselRegistrationPage;
import test.TestBase;

public class VesselRegestrationSteps extends TestBase {
	
	HomePage homepageobject = new HomePage(driver);
	VesselRegistrationPage vesselregisterationobject = new VesselRegistrationPage(driver);
	
	@And("User navigate to Vessel Registration")
	public void goToVesselRegistrationPage() throws InterruptedException {
		
		homepageobject.mouse_hover(homepageobject.mouseHover_VesselOwnerParent());
		homepageobject.sleepWait();
		homepageobject.mouse_hover(homepageobject.mouseHover_Vessels());
		homepageobject.click_VesselRegistration();
	}
	
	@When("Register with vessel english name {string} and nationality {string} and vessel type {string}")
	public void createVessel(String name , String nationality , String type) throws InterruptedException {
		vesselregisterationobject.switchIframe("frame1");
		vesselregisterationobject.click_Vesselflag();
		vesselregisterationobject.text_VesselFlag(nationality);
		vesselregisterationobject.text_IMO("IMO54652");
		vesselregisterationobject.click_VesselType();
		vesselregisterationobject.text_VesselType(type);
		vesselregisterationobject.sleepWait();
		vesselregisterationobject.text_VesselEnglishName(name);
		vesselregisterationobject.click_TranslatToArabic();
		vesselregisterationobject.sleepWait();
		vesselregisterationobject.text_OfficialNumber("9876510014");
		vesselregisterationobject.click_Owner();
		vesselregisterationobject.sleepWait();
		vesselregisterationobject.text_OwnerEnglishName("TOM");
		vesselregisterationobject.click_OwnerSearchList();
		vesselregisterationobject.sleepWait();
		vesselregisterationobject.click_FirstOwnerList();
		
		
	}
	
	@And("Click save in vessel Registration page")
	public void clickSave() throws InterruptedException {
		vesselregisterationobject.sleepWait();
		vesselregisterationobject.click_SaveVesselRegistration();
	
		
	}
	
	@And("Click Yes on navigate license is missing popup")
	public void clickYesPopUp() throws InterruptedException {
		
		vesselregisterationobject.sleepWait();
		vesselregisterationobject.click_YesPopUpVessel();
		
	}
	
	@And("Click Yes popup and navigate to issue vessel permit")
	public void clickYesPopUpNavigateToIssuePermit() throws InterruptedException {
		
		vesselregisterationobject.sleepWait();
		vesselregisterationobject.click_YesPopupNavigateToIssuePermit();
		
	}
	
	@Then("Check that the error msg beacuse the IMO Dublicate")
	public void checkErrorMshDublicateIMO() throws InterruptedException {
		
		Assert.assertTrue(vesselregisterationobject.get_IMOErrorMsg().contains("There is a existing vessel that is registered with the same IMO number"),vesselregisterationobject.get_IMOErrorMsg());
		
	}
	
	@When("Register with vessel english name {string} and nationality {string} and vessel type {string} and uniqe IMO")
	public void createVesselUniqeIMO(String name , String nationality , String type) throws InterruptedException {
		vesselregisterationobject.switchIframe("frame1");
		vesselregisterationobject.click_Vesselflag();
		vesselregisterationobject.text_VesselFlag(nationality);
		ConfigFileUtils.setProperty("IMONumber", "IMO"+ vesselregisterationobject.randomNumber());
		vesselregisterationobject.text_IMO(ConfigFileUtils.getProperty("IMONumber"));
		vesselregisterationobject.click_VesselType();
		vesselregisterationobject.text_VesselType(type);
		vesselregisterationobject.sleepWait();
		vesselregisterationobject.text_VesselEnglishName(name);
		vesselregisterationobject.click_TranslatToArabic();
		vesselregisterationobject.sleepWait();
		vesselregisterationobject.text_OfficialNumber("9876510014");
		vesselregisterationobject.click_Owner();
		vesselregisterationobject.sleepWait();
		vesselregisterationobject.text_OwnerEnglishName("TOM");
		vesselregisterationobject.click_OwnerSearchList();
		vesselregisterationobject.sleepWait();
		vesselregisterationobject.click_FirstOwnerList();
		
		
	}
	
	@Then("Check create vessel succes msg")
	public void checkCreateVesselSuccesMsg() throws InterruptedException {
		vesselregisterationobject.sleepWait();
		//Assert.assertTrue(vesselregisterationobject.get_ConfirmationWithOutNavigation().contains("Do you want to Issue Entry Permit for this Vessel"),vesselregisterationobject.get_ConfirmationWithOutNavigation());
		vesselregisterationobject.click_NoPopUpNavigatToPermnt();
	}
	
	@And("Check true navigation licence")
	public void checkNavigationLicence() throws InterruptedException {
		vesselregisterationobject.sleepWait();
		vesselregisterationobject.click_NavigationLicence();
		vesselregisterationobject.sleepWait();
		vesselregisterationobject.text_NavigationLicenceNumber("1234987");
		vesselregisterationobject.text_NavigationLicenceExpairyDate("29-06-2026");
		
		
	}

}

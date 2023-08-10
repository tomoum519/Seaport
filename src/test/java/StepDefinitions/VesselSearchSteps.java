package StepDefinitions;

import org.testng.Assert;

import DataProvider.ConfigFileUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.VesselSearchPage;
import test.TestBase;

public class VesselSearchSteps extends TestBase{
	
	HomePage homepageobject = new HomePage(driver);
	VesselSearchPage vesselsearchobject = new VesselSearchPage(driver);
	
	@And("User navigate to Vessel Search")
	public void goToVesselSearchPage( ) throws InterruptedException {
		
		homepageobject.mouse_hover(homepageobject.mouseHover_VesselOwnerParent());
		homepageobject.sleepWait();
		homepageobject.mouse_hover(homepageobject.mouseHover_Vessels());
		homepageobject.click_VesselSearch();
		
	}
	
	@Then("Check elements")
	public void checkIssueVesselPermitElements() throws InterruptedException {
		homepageobject.sleepWait();
		homepageobject.implicitlyWait();
		Assert.assertTrue(vesselsearchobject.get_PageTitle().contains("VESSEL SEARCH"),vesselsearchobject.get_PageTitle());
		Assert.assertTrue(vesselsearchobject.check_VesselFlag());
		Assert.assertTrue(vesselsearchobject.check_VesselEnglishName());
		Assert.assertTrue(vesselsearchobject.check_OfficialNumber());
		Assert.assertTrue(vesselsearchobject.check_NavigateLicenseNumber());
		Assert.assertTrue(vesselsearchobject.check_VesselArabicName());
		Assert.assertTrue(vesselsearchobject.check_IMONumber());
		Assert.assertTrue(vesselsearchobject.check_VesselType());
		Assert.assertTrue(vesselsearchobject.check_LicenseExpiryDate());
		Assert.assertTrue(vesselsearchobject.check_OwnerSearch());
		Assert.assertTrue(vesselsearchobject.check_TranslateToArabic());
		Assert.assertTrue(vesselsearchobject.check_TranslateToEnglish());
		Assert.assertTrue(vesselsearchobject.check_VesselSearch());
		Assert.assertTrue(vesselsearchobject.check_VesselReset());
	}
	
	@When("Enter IMO Number")
	public void enterIMONumberSearch() throws InterruptedException {
		vesselsearchobject.text_IMONumber(ConfigFileUtils.getProperty("IMONumber"));
	}
	
	@And("Click search in Vessel Search Page")
	public void clickSearchVesselSearchPage() throws InterruptedException {
		vesselsearchobject.click_VesselSearch();
	}
	
	@And("The search result in Vessel Search Page")
	public void clickSearchResultVesselSearchPage() throws InterruptedException {
		vesselsearchobject.click_ResultSearchRow1();
	}
	
	@And("Click add document in Vessel Search Page")
	public void clickAddDocumentVesselSearchPage() throws InterruptedException {
		vesselsearchobject.scrollIntoViewElement(vesselsearchobject.get_AddDocumentElement());
		vesselsearchobject.click_AddDocument();
	}
	
	@And("Enter document name document type {string} and file name {string}")
	public void clickAddDocumentDetailsVesselSearchPage(String documenttype, String filename) throws InterruptedException {
		vesselsearchobject.text_DocumentName(vesselsearchobject.randomName());
		vesselsearchobject.text_DocumentType(documenttype);
		vesselsearchobject.upload_Documentfile(filename);
	}
	
	@And("Vessel Search Doument added sucessfully")
	public void clickAddDocumentPopupVesselSearchPage() throws InterruptedException {
		vesselsearchobject.sleepWait();
		vesselsearchobject.click_AddDocumentPopup();
		vesselsearchobject.click_CloseAddDocumentPopup();
	}
	
	@Then("Click reset in Vessel Search Page")
	public void clickResetVesselSearchPage() throws InterruptedException {
		vesselsearchobject.click_VesselReset();
	}
	
	@Then("Check table titles {string} , {string} , {string} , {string} , {string} , {string} , {string} , {string} , {string}")
	public void checkResaltTableVesselSearchPage(String vesselname,String vesselflag,String officialnumber,String imonumber,String vesseltype,String ownername,String navigationlicensenumber,String licenseexpirydate,String block) throws InterruptedException {
		vesselsearchobject.sleepWait();
		Assert.assertEquals(vesselsearchobject.get_VesselNameColumn(), vesselname,vesselsearchobject.get_VesselNameColumn());
		Assert.assertEquals(vesselsearchobject.get_VesselFlagColumn(), vesselflag,vesselsearchobject.get_VesselFlagColumn());
		Assert.assertEquals(vesselsearchobject.get_OfficialNumberColumn(), officialnumber,vesselsearchobject.get_OfficialNumberColumn());
		Assert.assertEquals(vesselsearchobject.get_IMONumberColumn(), imonumber,vesselsearchobject.get_IMONumberColumn());
		Assert.assertEquals(vesselsearchobject.get_VesselTypeColumn(), vesseltype,vesselsearchobject.get_VesselTypeColumn());
		Assert.assertEquals(vesselsearchobject.get_OwnerNameColumn(), ownername,vesselsearchobject.get_OwnerNameColumn());
		Assert.assertEquals(vesselsearchobject.get_NavigationLicenseNumberColumn(), navigationlicensenumber,vesselsearchobject.get_NavigationLicenseNumberColumn());
		Assert.assertEquals(vesselsearchobject.get_LicenseExpiryDateColumn(), licenseexpirydate,vesselsearchobject.get_LicenseExpiryDateColumn());
		Assert.assertEquals(vesselsearchobject.get_BlockColumn(), block,vesselsearchobject.get_BlockColumn());
		
	}
	
	
	@When("Enter IMO Number not exist in vessel search")
	public void enterIMONumberNotexistSearch() throws InterruptedException {
		vesselsearchobject.text_IMONumber(vesselsearchobject.randomNumber());
	}
	
	@Then("Check that no register vessel msg {string}")
	public void checkNoRegisterVessel(String msg) throws InterruptedException {
		vesselsearchobject.sleepWait();
		Assert.assertTrue(vesselsearchobject.get_NoRegisterVesselPopup().contains(msg),vesselsearchobject.get_NoRegisterVesselPopup());
	}

	@And("Click edit in vessel search page")
	public void clickEditInVesselSearch() throws InterruptedException {
		vesselsearchobject.scrollIntoViewElement(vesselsearchobject.get_EditInVesselPage());
		vesselsearchobject.click_EditInVesselPage();
	}
	
	@And("Update vessel english name in vessel search page")
	public void updateVesselEnglishName() throws InterruptedException {
		vesselsearchobject.sleepWait();
		vesselsearchobject.text_VesselEnglishNameUpdate(vesselsearchobject.randomName());
	}
	
	@And("Click update in vessel search page")
	public void clickUpdateInVesselSearch() throws InterruptedException {
		
		vesselsearchobject.clickUpdateInVesselPage();
	}
	
	@And("Click No on navigation license is missing popup in vessel search page")
	public void clickNoOnNavifationLiecenseMissingPopup() throws InterruptedException {
		vesselsearchobject.clickNoNavigationLicenseMissing();
	}
	
	@Then("Vessel updated successfully msg {string}")
	public void checkUpdateMsg(String msg) throws InterruptedException {
		vesselsearchobject.sleepWait();
		Assert.assertTrue(vesselsearchobject.get_UpdateMsgSuccessfully().contains(msg),vesselsearchobject.get_UpdateMsgSuccessfully());
	}
	
	@And("Click block in vessel search page")
	public void clickBlockInVesselSearch() throws InterruptedException {
		
		vesselsearchobject.click_BlockInVesselPage();
	}
	
	@And("Write the reason of the block {string}")
	public void enterBlockReson(String msg) throws InterruptedException {
		vesselsearchobject.sleepWait();
		vesselsearchobject.text_BlockReason(msg);
	}
	
	@And("Click block popup in vessel search page")
	public void clickBlockPopupInVesselSearch() throws InterruptedException {
		vesselsearchobject.sleepWait();
		vesselsearchobject.click_BlockPopupInVesselPage();
	}
	
	@Then("Vessel blocked successfully msg {string}")
	public void checkBlockMsg(String msg) throws InterruptedException {
		vesselsearchobject.sleepWait();
		Assert.assertTrue(vesselsearchobject.get_BlockMsgSuccessfully().contains(msg),vesselsearchobject.get_BlockMsgSuccessfully());
	}
}

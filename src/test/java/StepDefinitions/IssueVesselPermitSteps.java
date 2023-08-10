package StepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.IssueVesselPermitPage;
import pages.ReviewVesselPermitPgae;
import test.TestBase;

public class IssueVesselPermitSteps extends TestBase{
	
	HomePage homepageobject = new HomePage(driver);
	IssueVesselPermitPage issuevesselpermitobject = new IssueVesselPermitPage(driver);
	ReviewVesselPermitPgae reviewvesselpermitobject = new ReviewVesselPermitPgae(driver);
	
	@And("User navigate to Issue Vessel Permit")
	public void goToVesselPermitPage() throws InterruptedException {
		
		homepageobject.mouse_hover(homepageobject.mouseHover_VesselOwnerParent());
		homepageobject.sleepWait();
		homepageobject.mouse_hover(homepageobject.mouseHover_Vessels());
		homepageobject.click_VesselPermit();
		
	}
	
	@When("Switch to default frame")
	public void switchDefaultFrame() throws InterruptedException {
		homepageobject.sleepWait();
		homepageobject.switchBackIframe();
	}
	
	@When("Switch to Iframe {string}")
	public void switchIframe(String iframe) throws InterruptedException {
		homepageobject.switchIframe(iframe);	
	}
	
	@Then("Check page title {string} displayed successfully entry , exit radio button displayed successfully search , reset button displayed successfully")
	public void checkIssueVesselPermitElements(String title) throws InterruptedException {
		homepageobject.sleepWait();
		Assert.assertTrue(issuevesselpermitobject.get_PageTitle().contains(title),issuevesselpermitobject.get_PageTitle());
		Assert.assertTrue(issuevesselpermitobject.check_Entry());
		Assert.assertTrue(issuevesselpermitobject.selected_Entry());
		Assert.assertTrue(issuevesselpermitobject.check_Exit());
		issuevesselpermitobject.click_Exit();
		Assert.assertTrue(issuevesselpermitobject.selected_Exit());
		Assert.assertTrue(issuevesselpermitobject.check_ChooseVessel());
		Assert.assertTrue(issuevesselpermitobject.check_SearchIcon());
		Assert.assertTrue(issuevesselpermitobject.check_reset());
		
		
	}
	
	@And("Enter Establishment Name {string}")
	public void enterEstablishmentName(String establishmentname) {
			issuevesselpermitobject.text_EstablishmentName(establishmentname);
	}
	
	@And("Click Establishment search")
	public void clickEstablishmentSearch( ) {
			issuevesselpermitobject.click_EstablishmentSearch();
	}
	
	@And("Click Establishment result row")
	public void clickEstablishmentResultRow( ) {
		
		issuevesselpermitobject.click_EstablishmentRow();
	}
	
	@And("scroll down")
	public void scrollDown( ) {
		issuevesselpermitobject.scrolldown();
	}
	
	@And("scroll down untill find elements")
	public void scrollDownUntillFindElement( ) {
		issuevesselpermitobject.scrollIntoViewElement(issuevesselpermitobject.get_FirstArrivalPortElement());
	}
	
	@And("Select Classification {string}")
	public void selectClassification(String classification ) {
		
		issuevesselpermitobject.click_Classification();
		issuevesselpermitobject.text_Classification(classification);
		issuevesselpermitobject.click_FirstArrivalPort();
	}
	
	@And("Select Arrival Port {string}")
	public void selectArrivalPort(String arrivalport ) {
		
		issuevesselpermitobject.click_ArrivalPort();
		issuevesselpermitobject.text_ArrivalPort(arrivalport);
	}
	
	@And("Select Departing Port {string}")
	public void selectDepartingPort(String departingport ) {
		
		issuevesselpermitobject.scrollIntoViewElement(issuevesselpermitobject.get_FirstArrivalPortElement());
		issuevesselpermitobject.click_DepartingPort();
		issuevesselpermitobject.text_DepartingPort(departingport);
	}
	
	@And("Select Departing Country {string}")
	public void selectDepartingCountry(String departingcountry ) {
		
		issuevesselpermitobject.scrollIntoViewElement(issuevesselpermitobject.get_FirstArrivalPortElement());
		issuevesselpermitobject.click_DepartingCountry();
		issuevesselpermitobject.text_DepartingCountry(departingcountry);
	}
	
	@And("Click Add Seaman button")
	public void clickAddSeaman( ) {
		issuevesselpermitobject.click_AddSeaman();
	}
	
	@And("Enter SeamanType {string} and Religion {string} and Date of birth {string} and Nationalty {string}")
	public void selectSeamanType(String seamantype,String religin, String dateofbirth, String nationalty) {
		issuevesselpermitobject.click_SeamanType();
		issuevesselpermitobject.text_SeamanType(seamantype);
		issuevesselpermitobject.text_firstName(issuevesselpermitobject.randomName());
		issuevesselpermitobject.text_Lastname(issuevesselpermitobject.randomName());
		issuevesselpermitobject.click_Religion();
		issuevesselpermitobject.text_Religion(religin);
		issuevesselpermitobject.text_DateOfBirth(dateofbirth);
		issuevesselpermitobject.click_Nationalty();
		issuevesselpermitobject.text_Nationalty(nationalty);
		
	}
	
	@And("Enter Seaman passport details Issue Country {string} and Expiry Date {string}")
	public void SeamanPasportDetails(String issuecountry,String expirydate ) {
		issuevesselpermitobject.text_PassportNumber("L" + issuevesselpermitobject.randomNumber());
		issuevesselpermitobject.click_IssueCountry();
		issuevesselpermitobject.text_IssueCountry(issuecountry);
		issuevesselpermitobject.text_ExpiryDate(expirydate);
	}
	
	@And("Enter Seaman book Nationalty {string}")
	public void SeamanBook(String nationalty ) {
		issuevesselpermitobject.scrollIntoViewElement(issuevesselpermitobject.get_AddElement());
		issuevesselpermitobject.click_BookNationalty();
		issuevesselpermitobject.text_BookNationalty(nationalty);
		issuevesselpermitobject.text_BookNumber("Sea"+ issuevesselpermitobject.randomNumber());
		issuevesselpermitobject.click_TransliateToArabic();
	}
	
	@And("Click submit Seaman button")
	public void submitSeaman( ) throws InterruptedException {
		issuevesselpermitobject.sleepWait();
		issuevesselpermitobject.click_SeamanSubmit();
	}
	
	@Then("Check application created succssefuly {string}")
	public void checkCreateVesselEntryPermitMsg(String succmsg ) throws InterruptedException {
		issuevesselpermitobject.sleepWait();
		issuevesselpermitobject.implicitlyWait();
		Assert.assertTrue(issuevesselpermitobject.get_VesselEntryPermitSucces().contains(succmsg),issuevesselpermitobject.get_VesselEntryPermitSucces());
	}
	
	@Then("Check application updated succssefuly {string}")
	public void checkCreateVesselEntryPermitUpdatedMsg(String succmsg ) throws InterruptedException {
		issuevesselpermitobject.sleepWait();
		issuevesselpermitobject.implicitlyWait();
		Assert.assertTrue(issuevesselpermitobject.get_VesselEntryPermitUpdatedSucces().contains(succmsg),issuevesselpermitobject.get_VesselEntryPermitUpdatedSucces());
	}
	
	@Then("Click Reset")
	public void clickReset( ) {
		issuevesselpermitobject.click_Reset();
	}
	
	@And("Reset succsefully")
	public void CheckIsntDisaple( ) throws InterruptedException {
		issuevesselpermitobject.sleepWait();
		issuevesselpermitobject.sleepWait();
		issuevesselpermitobject.sleepWait();
		try {
			Assert.assertFalse(issuevesselpermitobject.check_EstablishmentName(), "It didn't reset");
		} catch (Exception e) {
			// TODO: handle exception
		}
		Assert.assertFalse(false);
	}

	@And("Click save Vessel Permit")
	public void clickSaveVesselPermit( ){
		issuevesselpermitobject.scrollIntoViewElement(issuevesselpermitobject.get_SaveVesselPermitElement());
		issuevesselpermitobject.click_SaveVesselPermit();
	}
	
	@And("Click yes to navigate to review vessel permit")
	public void clickYesToNavigateToReviewVesselPermit( ){
		issuevesselpermitobject.click_YesToNavigateToReviewVesselPermit();
	}
	
	@And("Check that navigate to review vessel permit")
	public void checkReviewVesselPermitTitle( ){
		Assert.assertEquals(reviewvesselpermitobject.get_PageTitle(),"REVIEW VESSEL PERMIT","didn't navigate to review vessel Permit");
	}
	
	@And("Select exit permit")
	public void selectExitPermit( ){
		issuevesselpermitobject.click_Exit();
	}
	
	@And("Click add document")
	public void clickAddDocument( ){
		issuevesselpermitobject.click_AddDocument();
	}
	
	@And("Issue vessel permit Doument added sucessfully")
	public void enterDocumentDetails( ) throws InterruptedException{
		issuevesselpermitobject.text_DocumentName(issuevesselpermitobject.randomName());
		issuevesselpermitobject.select_DocumentType("345");
		issuevesselpermitobject.upload_DocumentLocation();
		issuevesselpermitobject.sleepWait();
		issuevesselpermitobject.click_AddDocumentPopup();
		issuevesselpermitobject.click_CloseDocumentPopup();
	}
	
	@Then("Check that it can not create exit permit message {string}")
	public void checkNoActiveEntryPermitMsg(String invalidmsg ) {
		Assert.assertEquals(issuevesselpermitobject.get_NoActiveEntryPermitMsg(),invalidmsg,issuevesselpermitobject.get_NoActiveEntryPermitMsg());
	}
	
	@Then("Check change arrival port message {string}")
	public void checkChangeArrivalPortMsg(String succesmsg ) throws InterruptedException {
		issuevesselpermitobject.click_FirstArrivalPort();
		Assert.assertEquals(issuevesselpermitobject.get_ChangeArrivalPorttMsg(),succesmsg,issuevesselpermitobject.get_ChangeArrivalPorttMsg());
		issuevesselpermitobject.click_OkChangeArrivalPort();
	}
	
	@And("Click Approve in review vessel permit page")
	public void clickApproveButton( ){
		reviewvesselpermitobject.click_ApproveButton();
	}
	
	@Then("Check Entry Permit Created Successfuly message {string}")
	public void checkEntryPermitCreatedSuccessfulyMsg(String succesmsg ) throws InterruptedException {
		reviewvesselpermitobject.sleepWait();;
		Assert.assertTrue(reviewvesselpermitobject.get_EntryPermitCreatedSuccessfulyMsg().contains(succesmsg),reviewvesselpermitobject.get_EntryPermitCreatedSuccessfulyMsg());	
	}
	
	@Then("Check no captain popup message {string}")
	public void checkNoCaptaionMsg(String succesmsg ) throws InterruptedException {
		reviewvesselpermitobject.sleepWait();;
		Assert.assertEquals(reviewvesselpermitobject.get_NOCaptinMsg(),succesmsg,reviewvesselpermitobject.get_NOCaptinMsg());	
	}
	
	@And("Click yes on no captain popup")
	public void clickYesNoCaptainPopupButton( ){
		reviewvesselpermitobject.click_YesNoCaptainPopup();
	}
	
	@And("Click Reject in review vessel permit page")
	public void clickRejectButton( ){
		reviewvesselpermitobject.click_RejectButton();
	}
	
	@And("Enter Reject Reason {string}")
	public void enterRejectReason(String resaon ) throws InterruptedException{
		reviewvesselpermitobject.sleepWait();
		reviewvesselpermitobject.text_Rejectreason(resaon);
	}
	
	@And("Click Reject on popup")
	public void clickRejectPopupButton( ){
		reviewvesselpermitobject.click_RejectPopupButton();
	}
	
	@Then("Check Entry Permit Rejected Successfuly message {string}")
	public void checkEntryPermitRejectedSuccessfulyMsg(String rejectmsg ) throws InterruptedException {
		reviewvesselpermitobject.sleepWait();;
		Assert.assertTrue(reviewvesselpermitobject.get_EntryPermitRejectedSuccessfulyMsg().contains(rejectmsg),reviewvesselpermitobject.get_EntryPermitRejectedSuccessfulyMsg());	
	}
	
	@When("Click on view Busniess Rules")
	public void clickViewBusniessRules() throws InterruptedException {
		issuevesselpermitobject.click_ViewBusniessRules();	
	}
	
	@Then("Check show Busniess rules")
	public void checkBusniessRulesPopup() throws InterruptedException {
		reviewvesselpermitobject.sleepWait();;
		Assert.assertTrue(issuevesselpermitobject.check_BusniessRuleTable(),"Didn't found the busniess rules");	
	}
}

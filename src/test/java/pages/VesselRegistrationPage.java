package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class VesselRegistrationPage extends BasePage{
	
	private By vesselpage_title = By.xpath("//*[@id=\"formLayoutPanel1\"]/h3");
	private By vesselflag_text = By.id("vesflag");
	private By imo_text = By.id("imonumber");
	private By vesseltype_text = By.id("vesType");
	private By vesselenglishname_text = By.id("nameEn");
	private By transletarabic_button = By.id("blackListSearchFocusIdAr");
	private By officialnumber_text = By.id("vesselRegistrationNo");
	private By ownersearch_button = By.id("j_idt60");
	private By ownerenglishname_text = By.xpath("//*[@id=\"j_idt104:ownerSearchPanel\"]/div[2]/div[1]/input");
	private By ownersearchlist_button = By.id("j_idt104:j_idt122");
	private By choosefirstrow_hyperlink = By.id("j_idt104:j_idt128:0:j_idt130");
	private By savevesselregistration_button = By.id("saveVessel");
	private By missingnavigationpopup_yesbutton = By.xpath("//*[@id=\"j_idt87:j_idt92\"]");
	private By sameimo_msg = By.xpath("//*[@id=\"gritter-item-1\"]/div/div[1]/span");
	private By confrmationwithoutnavigation_msg = By.xpath("//*[@id=\"j_idt87\"]/span");
	private By navigatpermntresdint_nobutton = By.id("j_idt87:j_idt96");
	private By navigationlicence_checkbox = By.id("disableFlag");
	private By navigationlicencenumber_text = By.id("licNumber");
	private By navigationlicenceexpairydate_text = By.id("exptDate");
	private By yespopupnavigatetoissuepermit = By.id("j_idt87:j_idt90");

	public VesselRegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public String get_PageTitle() {
		return getText(vesselpage_title);
	}
	
	public void click_Vesselflag() {
		clickElement(vesselflag_text);
	}
	
	public void text_VesselFlag(String vesselflag) {
		sendtext(vesselflag_text,vesselflag);
	}
	
	public void text_IMO(String imo) {
		sendtext(imo_text,imo);
	}
	
	public void click_VesselType() {
		clickElement(vesseltype_text);
	}
	
	public void text_VesselType(String vesselType) {
		sendtext(vesseltype_text,vesselType);
	}
	
	public void text_VesselEnglishName(String vesselenglishname) {
		sendtext(vesselenglishname_text,vesselenglishname);
	}
	
	public void click_TranslatToArabic() {
		clickElement(transletarabic_button);
	}
	
	public void text_OfficialNumber(String officialnumber) {
		sendtext(officialnumber_text,officialnumber);
	}
	
	public void click_Owner() {
		clickElement(ownersearch_button);
	}
	
	public void text_OwnerEnglishName(String ownerenglishname) {
		sendtext(ownerenglishname_text,ownerenglishname);
	}
	
	public void click_OwnerSearchList() {
		clickElement(ownersearchlist_button);
	}
	
	public void click_FirstOwnerList() {
		clickElement(choosefirstrow_hyperlink);
	}
	
	public void click_SaveVesselRegistration() {
		clickElement(savevesselregistration_button);
	}
	
	public void click_YesPopUpVessel() {
		//clickElement(missingnavigationpopup_yesbutton);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", driver.findElement(missingnavigationpopup_yesbutton));
	}
	
	public String get_IMOErrorMsg() {
		return getText(sameimo_msg);
	}
	
	public String get_ConfirmationWithOutNavigation() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return (String) js.executeScript("arguments[0].value", driver.findElement(confrmationwithoutnavigation_msg));
		//return getText(confrmationwithoutnavigation_msg);
	}
	
	public void click_NoPopUpNavigatToPermnt() {
		//clickElement(missingnavigationpopup_yesbutton);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", driver.findElement(navigatpermntresdint_nobutton));
	}
	
	public void click_NavigationLicence() {
		clickElement(navigationlicence_checkbox);
	}
	
	public void text_NavigationLicenceNumber(String navigationnumber) {
		sendtext(navigationlicencenumber_text,navigationnumber);
	}
	
	public void text_NavigationLicenceExpairyDate(String navigationdate) {
		sendtext(navigationlicenceexpairydate_text,navigationdate);
	}
	
	public void click_YesPopupNavigateToIssuePermit() {
		clickElement(yespopupnavigatetoissuepermit);
	}
}

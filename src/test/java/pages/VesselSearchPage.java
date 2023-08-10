package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VesselSearchPage extends BasePage {
	
	private By vesselsearch_pagetitle = By.xpath("//*[@id=\"formLayoutPanel1\"]/h3");
	private By vesselflag_selectbox = By.id("vesflag_selectBox");
	private By vesselenglishname_text = By.id("nameEn");
	private By officialnumber_text = By.id("vesselRegistrationNo");
	private By navigationlicensenumber = By.id("licNumber");
	private By vesseltype_selectbox = By.id("vesType_selectBox");
	private By vesselarabicname_text = By.id("nameAr");
	private By imonumber_text = By.id("imonumber");
	private By licenseexpirydate_text = By.id("exptDate");
	private By ownersearch_icon = By.id("j_idt60");
	private By translatetoarabic_button = By.id("blackListSearchFocusIdAr");
	private By translatetoenglish_button = By.id("blackListSearchFocusIdEn");
	private By vesselsearch_button = By.id("j_idt67");
	private By vesselreset_button = By.id("j_idt68");
	private By resultSearch_row = By.id("resultSearch_row_0");
	private By adddocument_button = By.id("j_idt175");
	private By documentname_text = By.id("docAttDesc");
	private By documenttype_text = By.id("docAttType");
	private By documentfile_button = By.id("j_idt245_input");
	private By adddocumentpopup_button = By.id("j_idt247");
	private By adddocumentpopupclose_button = By.xpath("//*[@id=\"j_idt233\"]/div[1]/a/span");
	private By vesselname_column = By.id("resultSearch:j_idt72");
	private By vesselflag_column = By.id("resultSearch:j_idt74");
	private By officialnumber_column = By.id("resultSearch:j_idt76");
	private By imonumber_column = By.id("resultSearch:j_idt79");
	private By vesseltype_column = By.id("resultSearch:j_idt82");
	private By ownername_column = By.id("resultSearch:j_idt85");
	private By navigationlicensenumber_column = By.id("resultSearch:j_idt88");
	private By licenseexpirydate_column = By.id("resultSearch:j_idt91");
	private By block_column = By.id("resultSearch:j_idt94");
	private By noregistervesselpopup_msg = By.xpath("/html/body/div[12]/div[2]/form/span");
	private By clickedit_button = By.id("j_idt182");
	private By vesselenglishnameupdate_text = By.xpath("//*[@id=\"secondpagepannel\"]/div[2]/div[1]/input");
	private By clickupdate_button = By.id("saveVessel");
	private By clicknonavigatinlicencemissing_button = By.id("j_idt218:j_idt227");
	private By getvesselupdatemsg = By.xpath("//*[@id=\"gritter-item-1\"]/div/div[1]/span");
	private By clickblock_button = By.id("j_idt183");
	private By blockReason_text = By.name("j_idt190");
	private By clickblockpopup_button = By.xpath("//*[@id=\"j_idt192\"]");
	private By getvesselblockmsg = By.xpath("//*[@id=\"gritter-item-2\"]/div/div[1]/span");

	public VesselSearchPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public String get_PageTitle() {
		return getText(vesselsearch_pagetitle);
	}
	
	public boolean check_VesselFlag() {
		return isDisplayed(vesselflag_selectbox);
	}
	
	public void text_VesselFlag (String text ) {
		sendtext(vesselflag_selectbox,text);
	}
	
	public boolean check_VesselEnglishName() {
		return isDisplayed(vesselenglishname_text);
	}
	
	public void text_VesselEnglishName (String text ) {
		sendtext(vesselenglishname_text,text);
	}
	
	public boolean check_VesselArabicName() {
		return isDisplayed(vesselarabicname_text);
	}
	
	public void text_VesselArabicName(String text ) {
		sendtext(vesselarabicname_text,text);
	}
	
	public boolean check_OfficialNumber() {
		return isDisplayed(officialnumber_text);
	}
	
	public void text_OfficialNumber(String text ) {
		sendtext(officialnumber_text,text);
	}
	
	public boolean check_NavigateLicenseNumber() {
		return isDisplayed(navigationlicensenumber);
	}
	
	public void text_NavigateLicenseNumber(String text ) {
		sendtext(navigationlicensenumber,text);
	}
	
	public boolean check_VesselType() {
		return isDisplayed(vesseltype_selectbox);
	}
	
	public void text_VesselType(String text ) {
		sendtext(vesseltype_selectbox,text);
	}
	
	public boolean check_IMONumber() {
		return isDisplayed(imonumber_text);
	}
	
	public void text_IMONumber(String text ) {
		sendtext(imonumber_text,text);
	}
	
	public boolean check_LicenseExpiryDate() {
		return isDisplayed(licenseexpirydate_text);
	}
	
	public void text_LicenseExpiryDate(String text ) {
		sendtext(licenseexpirydate_text,text);
	}
	
	public boolean check_OwnerSearch() {
		return isDisplayed(ownersearch_icon);
	}
	
	public boolean check_TranslateToArabic() {
		return isDisplayed(translatetoarabic_button);
	}
	
	public boolean check_TranslateToEnglish() {
		return isDisplayed(translatetoenglish_button);
	}
	
	public boolean check_VesselSearch() {
		return isDisplayed(vesselsearch_button);
	}
	
	public void click_VesselSearch() {
		clickElement(vesselsearch_button);
	}
	
	public boolean check_VesselReset() {
		return isDisplayed(vesselreset_button);
	}
	
	public void click_ResultSearchRow1() {
		clickElement(resultSearch_row);
	}
	
	public void click_AddDocument() {
		clickElement(adddocument_button);
	}
	
	public WebElement get_AddDocumentElement () {
		return onlyElement(adddocument_button);
	}
	
	public void text_DocumentName(String text ) {
		sendtext(documentname_text,text);
	}
	
	public void text_DocumentType(String text ) {
		dropdownvalue(dropdown(documenttype_text), text);
	}
	
	public void upload_Documentfile(String text ) {
		uploadFile(documentfile_button,text);
	}
	
	public void click_AddDocumentPopup() {
		clickElement(adddocumentpopup_button);
	}
	
	public void click_CloseAddDocumentPopup() {
		clickElement(adddocumentpopupclose_button);
	}
	
	public void click_VesselReset() {
		clickElement(vesselreset_button);
	}
	
	public String get_VesselNameColumn() {
		return getText(vesselname_column);
	}
	
	public String get_VesselFlagColumn() {
		return getText(vesselflag_column);
	}
	
	public String get_OfficialNumberColumn() {
		return getText(officialnumber_column);
	}
	
	public String get_IMONumberColumn() {
		return getText(imonumber_column);
	}
	
	public String get_VesselTypeColumn() {
		return getText(vesseltype_column);
	}
	
	public String get_OwnerNameColumn() {
		return getText(ownername_column);
	}
	
	public String get_NavigationLicenseNumberColumn() {
		return getText(navigationlicensenumber_column);
	}
	
	public String get_LicenseExpiryDateColumn() {
		return getText(licenseexpirydate_column);
	}
	
	public String get_BlockColumn() {
		return getText(block_column);
	}
	
	public String get_NoRegisterVesselPopup() {
		return getText(noregistervesselpopup_msg);
	}
	
	public void click_EditInVesselPage() {
		clickElement(clickedit_button);
	}
	
	public void text_VesselEnglishNameUpdate(String text ) {
		sendtext(vesselenglishnameupdate_text,text);
	}
	
	public void clickUpdateInVesselPage() {
		clickElement(clickupdate_button);
	}
	
	public void clickNoNavigationLicenseMissing() {
		clickElement(clicknonavigatinlicencemissing_button);
	}
	
	public WebElement get_EditInVesselPage() {
		return onlyElement(clickedit_button);
	}
	
	public String get_UpdateMsgSuccessfully() {
		return getText(getvesselupdatemsg);
	}

	public void click_BlockInVesselPage() {
		clickElement(clickblock_button);
	}
	
	public void text_BlockReason(String text ) {
		sendtext(blockReason_text,text);
	}
	
	public void click_BlockPopupInVesselPage() {
		clickElement(clickblockpopup_button);
	}
	
	public String get_BlockMsgSuccessfully() {
		return getText(getvesselblockmsg);
	}
}

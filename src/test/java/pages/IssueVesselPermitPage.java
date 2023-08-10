package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IssueVesselPermitPage extends BasePage{

	
	private By issuevesselpermit_title = By.xpath("//*[@id=\"j_idt45\"]/h3");
	private By entry_radiobutton = By.id("j_idt50:0");
	private By exit_radiobutton = By.id("j_idt50:1");
	private By choosevessel_text = By.id("fromPermitNo");
	private By searchicon_button = By.id("j_idt56");
	private By reset_button = By.id("j_idt59");
	private By establishmentname_text = By.xpath("//*[@id=\"estabSearchPanel\"]/div[2]/div[2]/input");
	private By establishmentsearch_button = By.id("j_idt237");
	private By establishment_row = By.id("j_idt239_row_0");
	private By classification_text = By.id("j_idt265");
	private By addseaman_button =By.id("j_idt581");
	private By firstarrivalport_text =By.xpath("//*[@id=\"travelInfo\"]/div[2]/div/input");
	private By boxnumbert_text =By.xpath("//*[@id=\"travelInfo\"]/div[5]/div[1]/input");
	private By arrivalport_text =By.id("j_idt294");
	private By departingport_text =By.id("j_idt300");
	private By seamantype_text =By.id("seamanTypeSelectCombo");
	private By firstname_text =By.id("j_idt375");
	private By lastname_text =By.id("j_idt382");
	private By dateofbirth_text =By.id("dob");
	private By religion_text =By.id("profileReligion");
	private By nationalty_text =By.id("j_idt395");
	private By passportnumber_text =By.name("j_idt442");
	private By issuecountry_text =By.id("j_idt436");
	private By expairydate_text =By.id("docExpDate");
	private By booknationalty_text =By.id("j_idt477");
	private By booknumber_text =By.id("j_idt483");
	private By submitseaman_button =By.id("j_idt490");
	private By transliatarabic_button =By.id("j_idt486");
	private By vesselentrypermitsucces_msg =By.xpath("//*[@id=\"gritter-item-1\"]/div/div[1]/span");
	private By vesselentrypermitupdatedsucces_msg =By.xpath("//*[@id=\"gritter-item-4\"]/div/div[1]/span");
	private By departingcountry_text =By.id("j_idt273");
	private By savevesselpermit_button =By.id("j_idt745");
	private By yespopuptoreviewvesselpermit_button =By.id("j_idt1035:j_idt1038");
	private By noactiveentrypermit_msg =By.xpath("//*[@id=\"gritter-item-1\"]/div/div[1]/span");
	private By arrivalportselect_msg =By.xpath("//*[@id=\"j_idt1052\"]/span");
	private By okchangearrivalport_button =By.id("j_idt1052:j_idt1057");
	private By adddocument_button =By.id("j_idt739");
	private By doucmentname_text =By.id("docAttDesc");
	private By doucmenttype_select =By.id("docAttType");
	private By documentlocation_upload =By.id("j_idt1073_input");
	private By adddocumentpopup_button =By.id("j_idt1075");
	private By closedocumentpopup_button =By.xpath("//*[@id=\"j_idt1061\"]/div[1]/a/span");
	private By busniessrulesview_button =By.id("seamanList:0:j_idt575");
	private By busniessrulepopup_body = By.id("j_idt610_data");
			
	
			
	public IssueVesselPermitPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public String get_PageTitle() {
		return getText(issuevesselpermit_title);
	}
	
	public boolean check_Entry() {
		return isDisplayed(entry_radiobutton);
	}
	
	public boolean selected_Entry() {
		return isSelected(entry_radiobutton);
	}
	
	public boolean check_Exit() {
		return isDisplayed(exit_radiobutton);
	}
	
	public boolean selected_Exit() {
		return isSelected(exit_radiobutton);
	}
	
	public void click_Exit() {
		clickElement(exit_radiobutton);
	}
	
	public boolean check_ChooseVessel() {
		return isDisplayed(choosevessel_text);
	}
	
	public boolean check_SearchIcon() {
		return isDisplayed(searchicon_button);
	}
	
	public boolean check_reset() {
		return isDisplayed(reset_button);
	}
	
	public void click_Reset() {
		clickElement(reset_button);
	}
	
	public boolean check_EstablishmentName() {
		return isDisplayed(establishmentsearch_button);
	}
	
	public void text_EstablishmentName(String establishmentname) {
		sendtext(establishmentname_text,establishmentname);
	}
	
	public void click_EstablishmentSearch() {
		clickElement(establishmentsearch_button);
	}
	
	public void click_EstablishmentRow() {
		clickElement(establishment_row);
	}
	
	public void text_Classification (String classification ) {
		sendtext(classification_text,classification);
	}
	
	public void click_Classification () {
		clickElement(classification_text);
	}
	
	public void click_FirstArrivalPort () {
		clickElement(firstarrivalport_text);
	}
	
	public WebElement get_FirstArrivalPortElement () {
		return onlyElement(firstarrivalport_text);
	}
	
	public void click_ArrivalPort() {
		clickElement(arrivalport_text);
	}
	
	public void text_DepartingCountry (String text ) {
		sendtext(departingcountry_text,text);
	}
	
	public void click_DepartingCountry() {
		clickElement(departingcountry_text);
	}
	
	public void text_ArrivalPort (String arrivalport ) {
		sendtext(arrivalport_text,arrivalport);
	}
	
	public void click_DepartingPort() {
		clickElement(departingport_text);
	}
	
	public void text_DepartingPort (String departingport ) {
		sendtext(departingport_text,departingport);
	}
	
	public void click_AddSeaman() {
		clickElement(addseaman_button);
	}
	
	public void click_SeamanType() {
		clickElement(seamantype_text);
	}
	
	public void text_firstName (String text ) {
		sendtext(firstname_text,text);
	}
	
	public void text_Lastname (String text ) {
		sendtext(lastname_text,text);
	}
	
	public void text_DateOfBirth (String text ) {
		sendtext(dateofbirth_text,text);
	}
	
	public void text_Religion (String text ) {
		sendtext(religion_text,text);
	}
	
	public void click_Religion() {
		clickElement(religion_text);
	}
	
	public void text_SeamanType (String text ) {
		sendtext(seamantype_text,text);
	}
	
	public void text_Nationalty (String text ) {
		sendtext(nationalty_text,text);
	}
	
	public void click_Nationalty() {
		clickElement(nationalty_text);
	}
	
	public void text_PassportNumber (String text ) {
		sendtext(passportnumber_text,text);
	}
	
	public void text_IssueCountry (String text ) {
		sendtext(issuecountry_text,text);
	}
	
	public void click_IssueCountry() {
		clickElement(issuecountry_text);
	}
	
	public void text_ExpiryDate (String text ) {
		sendtext(expairydate_text,text);
	}
	
	public void text_BookNationalty (String text ) {
		sendtext(booknationalty_text,text);
	}
	
	public void click_BookNationalty() {
		clickElement(booknationalty_text);
	}
	
	public void text_BookNumber (String text ) {
		sendtext(booknumber_text,text);
	}
	
	public WebElement get_AddElement () {
		return onlyElement(booknationalty_text);
	}
	
	public void click_SeamanSubmit() {
		clickElement(submitseaman_button);
	}
	
	public void click_TransliateToArabic() {
		clickElement(transliatarabic_button);
	}
	
	public String get_VesselEntryPermitSucces() {
		return getText(vesselentrypermitsucces_msg);
	}
	
	public String get_VesselEntryPermitUpdatedSucces() {
		return getText(vesselentrypermitupdatedsucces_msg);
	}
	
	public void click_SaveVesselPermit() {
		clickElement(savevesselpermit_button);
	}
	
	public WebElement get_SaveVesselPermitElement () {
		return onlyElement(savevesselpermit_button);
	}
	
	public void click_YesToNavigateToReviewVesselPermit() {
		clickElement(yespopuptoreviewvesselpermit_button);
	}
	
	public String get_NoActiveEntryPermitMsg() {
		return getText(noactiveentrypermit_msg);
	}
	
	public String get_ChangeArrivalPorttMsg() {
		return getText(arrivalportselect_msg);
	}
	
	public void click_OkChangeArrivalPort() {
		clickElement(okchangearrivalport_button);
	}
	
	public void click_AddDocument() {
		clickElement(adddocument_button);
	}
	
	public void text_DocumentName (String text ) {
		sendtext(doucmentname_text,text);
	}
	
	public void select_DocumentType (String text ) {
		dropdownvalue(dropdown(doucmenttype_select), text);
	}
	
	public void upload_DocumentLocation () {
		String  filepath=System.getProperty("user.dir")+"\\upload\\save.pdf";
		sendtext(documentlocation_upload,filepath);
	}
	
	public void click_AddDocumentPopup() {
		clickElement(adddocumentpopup_button);
	}
	
	public void click_CloseDocumentPopup() {
		clickElement(closedocumentpopup_button);
	}
	
	public void click_ViewBusniessRules() {
		clickElement(busniessrulesview_button);
	}
	
	public boolean check_BusniessRuleTable() {
		return isDisplayed(busniessrulepopup_body);
	}
	

}

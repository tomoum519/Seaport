package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterOwnerPage extends BasePage{

	private By nationality_dropdown = By.id("j_idt44");
	private By englishname_text = By.id("nameEn");
	private By translatarabic_button = By.id("blackListSearchFocusIdAr");
	private By save_button = By.id("j_idt60");
	private By error_alreadyexistmsg = By.xpath("/html/body/div[6]/div/div/div[1]/span");
	private By succ_msg = By.id("j_idt65");
	private By popupyes_button = By.id("j_idt65:j_idt68");
	private By popupno_button = By.id("j_idt65:j_idt74");
	private By ownerregistration_tital = By.id("formLayoutPanel1");
	
	public RegisterOwnerPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void click_Nationality() {
		clickElement(nationality_dropdown);
	}
	
	public void text_Nationality(String nationality) {
		sendtext(nationality_dropdown,nationality);
	}
	
	public void text_EnglishName(String englishname) {
		sendtext(englishname_text,englishname);
	}
	
	public void click_TranslatToArabic() {
		clickElement(translatarabic_button);
	}
	
	public void click_Save() {
		clickElement(save_button);
	}
	
	public String get_ErrorMsg() {
		return getText(error_alreadyexistmsg);
	}
	
	public String get_SuccMsg() {
		return getText(succ_msg);
	}
	
	public void click_YesOnPopUp() {
		clickElement(popupyes_button);
	}
	
	public void click_NoOnPopUp() {
		clickElement(popupno_button);
	}
	
	public String get_OwnerRegistrationTital() {
		return getText(ownerregistration_tital);
	}
}

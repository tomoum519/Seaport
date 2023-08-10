package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OwnerSearchPage extends BasePage{
	
	private By ownerenglishname_text =  By.id("nameEn");
	private By search_button =  By.id("j_idt44");
	private By row_table = By.id("resultSearch_row_0");
	private By edit_button =  By.id("j_idt92");
	private By editenglishname_text =  By.id("editNameEn");
	private By update_button =  By.id("j_idt93");
	private By updatesucc_msg =  By.id("gritter-item-1");
	private By norecord_msg =  By.id("gritter-item-1");
	private By nofieldentered_msg =  By.id("gritter-item-1");
	private By translatetoarabic_button =  By.id("blackListSearchFocusIdAr");
	private By nationalty_text =  By.id("j_idt34");
	private By reset_button =  By.id("reset");
	private By editarabicname_text =  By.id("nameAr");
	private By translatetoenglish_button =  By.id("blackListSearchFocusIdEn");
	private By page_title = By.xpath("//*[@id=\"formLayoutPanel1\"]/h3");

	public OwnerSearchPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void text_EnglishName(String englishname) {
		sendtext(ownerenglishname_text,englishname);
	}
	
	public void click_Search() {
		clickElement(search_button);
	}
	
	public void click_RowTable() {
		clickElement(row_table);
	}
	
	public void click_Edit() {
		clickElement(edit_button);
	}
	
	public void click_EditEnglishName() {
		clickElement(editenglishname_text);
	}
	
	public void text_EditEnglishName(String englishname) {
		sendtext(editenglishname_text,englishname);
	}
	
	public void click_Update() {
		clickElement(update_button);
	}
	
	public String get_UpdateSuccMsg() {
		return getText(updatesucc_msg);
	}
	
	public String get_NoRecordMsg() {
		return getText(norecord_msg);
	}
	
	public String get_NoFieldEnteredMsg() {
		return getText(nofieldentered_msg);
	}
	
	public void click_TranslateToArabic() {
		clickElement(translatetoarabic_button);
	}
	
	public void click_Nationalty() {
		clickElement(nationalty_text);
	}
	
	public void text_nationalty(String text) {
		sendtext(nationalty_text,text);
	}
	
	public void click_Reset() {
		clickElement(reset_button);
	}
	
	public void click_EditArabicName() {
		clickElement(editarabicname_text);
	}
	
	public void text_EditArabicName(String text) {
		sendtext(editarabicname_text,text);
	}
	
	public void click_TranslateToEnglish() {
		clickElement(translatetoenglish_button);
	}
	
	public boolean check_OwnerEnglishName() {
		return isDisplayed(ownerenglishname_text);
	}
	
	public boolean check_Search() {
		return isDisplayed(search_button);
	}
	
	public boolean check_TranslateToArabic() {
		return isDisplayed(translatetoarabic_button);
	}
	
	public boolean check_TranslateToEnglish() {
		return isDisplayed(translatetoenglish_button);
	}
	
	public boolean check_Reset() {
		return isDisplayed(reset_button);
	}
	
	public boolean check_Nationalty() {
		return isDisplayed(nationalty_text);
	}
	
	public boolean check_OwnerArabicName() {
		return isDisplayed(editarabicname_text);
	}
	
	public String get_PageTitle() {
		return getText(page_title);
	}

}

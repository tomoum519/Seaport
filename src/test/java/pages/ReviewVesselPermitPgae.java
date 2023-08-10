package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReviewVesselPermitPgae extends BasePage{

	private By reviewvesselpermit_title =By.xpath("//*[@id=\"j_idt43\"]/h3");
	private By approve_button =By.id("approve");
	private By entrypermitcreatedsuccessfuly_msg =By.xpath("//*[@id=\"gritter-item-1\"]/div/div[1]/span");
	private By nocaptainpopup_msg =By.xpath("//*[@id=\"j_idt1200\"]/span");
	private By yesnocaptainpopup_button =By.id("j_idt1200:j_idt1205");
	private By reject_button =By.id("j_idt801");
	private By rejectreason_button =By.id("rejectReason");
	private By rejectpopup_button =By.id("j_idt854");
	private By entrypermitrejectsuccessfuly_msg =By.xpath("//*[@id=\"gritter-item-1\"]/div/div[1]/span");
	
	public ReviewVesselPermitPgae(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public String get_PageTitle() {
		return getText(reviewvesselpermit_title);
	}
	
	public void click_ApproveButton() {
		clickElement(approve_button);
	}
	
	public String get_EntryPermitCreatedSuccessfulyMsg() {
		return getText(entrypermitcreatedsuccessfuly_msg);
	}
	
	public String get_NOCaptinMsg() {
		return getText(nocaptainpopup_msg);
	}
	
	public void click_YesNoCaptainPopup() {
		clickElement(yesnocaptainpopup_button);
	}
	
	public void click_RejectButton() {
		clickElement(reject_button);
	}
	
	public void click_RejectPopupButton() {
		clickElement(rejectpopup_button);
	}
	
	public void text_Rejectreason (String text ) {
		sendtext(rejectreason_button,text);
	}
	
	public String get_EntryPermitRejectedSuccessfulyMsg() {
		return getText(entrypermitrejectsuccessfuly_msg);
	}

}

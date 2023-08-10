package StepDefinitions;

import org.testng.Assert;

import DataProvider.ConfigFileUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.OwnerSearchPage;
import test.TestBase;

public class OwnerSearchSteps extends TestBase {
	
	OwnerSearchPage ownersearchobject = new OwnerSearchPage(driver);
	
	@And("Enter random english name in owner search page")
	public void enterEnglishNameInOwnerSearchPage() throws InterruptedException {
		ownersearchobject.text_EnglishName(ownersearchobject.randomName());
	}
	
	@Then("Check that no record found msg {string}")
	public void noRecordMsg(String msg) throws InterruptedException {
		
		Assert.assertEquals(ownersearchobject.get_NoRecordMsg(),ConfigFileUtils.getProperty(msg),ownersearchobject.get_NoRecordMsg());
	}
	
	@Then("Check that no field entered msg {string}")
	public void noFieldEnterdMsg(String msg) throws InterruptedException {
		
		Assert.assertEquals(ownersearchobject.get_NoFieldEnteredMsg(),ConfigFileUtils.getProperty(msg),ownersearchobject.get_NoFieldEnteredMsg());
	}
	
	@And("Click translate to arabic in owner search page")
	public void clickTranslateToArabicInOwnerSearchPage() throws InterruptedException {
		ownersearchobject.click_TranslateToArabic();
	}
	
	@And("Choose nationalty in owner search page {string}")
	public void enternationaltyInOwnerSearchPage(String nationalty) throws InterruptedException {
		ownersearchobject.click_Nationalty();
		ownersearchobject.text_nationalty(ConfigFileUtils.getProperty(nationalty));
		ownersearchobject.sleepWait();
	}
	
	@And("Click reset button in owner search page")
	public void clickResetInOwnerSearchPage() throws InterruptedException {
		ownersearchobject.click_Reset();
	}
	
	@And("Enter random arabic name in owner search page")
	public void updateEnglishNameInOwnerSearchPage() throws InterruptedException {
		ownersearchobject.sleepWait();
		ownersearchobject.click_EditArabicName();
		ownersearchobject.text_EditArabicName("يبلاتنمكط");
	}
	
	@And("Click translate to english in owner search page")
	public void clickTranslateToEnglishInOwnerSearchPage() throws InterruptedException {
		ownersearchobject.click_TranslateToEnglish();
		
	}
	
	@Then("Check that ienglish name, arabic name , nationalty , search button ,reset button , trnslate to arabic button, trnslate to english button is displayed")
	public void checkPagecontent() throws InterruptedException {
		Assert.assertTrue(ownersearchobject.get_PageTitle().contains("OWNER SEARCH"),ownersearchobject.get_PageTitle());
		Assert.assertTrue(ownersearchobject.check_Nationalty());
		Assert.assertTrue(ownersearchobject.check_OwnerArabicName());
		Assert.assertTrue(ownersearchobject.check_OwnerEnglishName());
		Assert.assertTrue(ownersearchobject.check_Reset());
		Assert.assertTrue(ownersearchobject.check_Search());
		Assert.assertTrue(ownersearchobject.check_TranslateToArabic());
		Assert.assertTrue(ownersearchobject.check_TranslateToEnglish());
		
	}

}

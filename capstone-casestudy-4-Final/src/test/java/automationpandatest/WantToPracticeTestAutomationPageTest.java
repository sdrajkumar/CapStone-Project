package automationpandatest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import automationpanda.WantToPracticeTestAutomationPage;

public class WantToPracticeTestAutomationPageTest extends BasePageTest{
	
	WantToPracticeTestAutomationPage wantToPracticeTestAutomationPage;
			
	@Test (priority = 0)
	public void testWantToPracticeTestAutomationPageTitle() {
		
		wantToPracticeTestAutomationPage = new WantToPracticeTestAutomationPage(BasePageTest.driver);
		Assert.assertEquals(wantToPracticeTestAutomationPage.getPageTitle(), "Want to practice test automation? Try these demo sites! | Automation Panda");
		
	}
	
	@Test (priority = 1)
	public void testContactPage() {
		
		wantToPracticeTestAutomationPage.clickContact();
		
	}

}

package automationpandatest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import automationpanda.ContactPage;
import automationpanda.WantToPracticeTestAutomationPage;

public class ContactPageTest extends BasePageTest {
	
	ContactPage contactPage;
	
	@Test
	public void testContactPage() {
		
		//wantToPracticeTestAutomationPage = new WantToPracticeTestAutomationPage(driver);
		contactPage = new ContactPage(BasePageTest.driver);
		
		contactPage.clickContact();
		contactPage.enterContactDetails();
		contactPage.submitContactDetails();
		
		Assert.assertEquals(contactPage.getSentMessage(),"Your message has been sent");
		
	}

}

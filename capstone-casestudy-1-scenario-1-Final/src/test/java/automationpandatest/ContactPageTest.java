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

public class ContactPageTest {
	
	static WebDriver driver;
	String baseURL;
	String driverType;
	String driverPath;
	
	
	@BeforeSuite
	public void openContactPage() {
		
		driverType = "webdriver.chrome.driver";
		driverPath = "D:\\Tools\\Chrome Driver\\chromedriver-win64\\chromedriver.exe";
		baseURL = "https://automationpanda.com/2021/12/29/want-to-practice-test-automation-try-these-demo-sites/";
		System.setProperty(driverType,driverPath);
		driver = new ChromeDriver();
		driver.get(baseURL);
		driver.manage().window().maximize();
	}
	
	@Test
	public void testContactPage() {
		
		WantToPracticeTestAutomationPage wantToPracticeTestAutomationPage = new WantToPracticeTestAutomationPage(driver);
		wantToPracticeTestAutomationPage.clickContact();
		
		ContactPage contactPage = new ContactPage(driver);
		contactPage.enterContactDetails();
		contactPage.submitContactDetails();
		
		Assert.assertEquals(contactPage.getSentMessage(),"Your message has been sent");
		
	}
	
	@AfterSuite
	void closeBrowser() {
		
		driver.quit();
		
	}

}

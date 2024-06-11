package automationpandatest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BasePageTest {
	
	protected static WebDriver driver;
	String baseURL;
	String driverType;
	String driverPath;
	
	@BeforeSuite
	public void initializeDriver() {
		
		System.out.println("Web driver initialization started ...");
		driverType = "webdriver.chrome.driver";
		driverPath = "D:\\Tools\\Chrome Driver\\chromedriver-win64\\chromedriver.exe";
		baseURL = "https://automationpanda.com/2021/12/29/want-to-practice-test-automation-try-these-demo-sites/";
		System.setProperty(driverType,driverPath);
		driver = new ChromeDriver();
		driver.get(baseURL);
		driver.manage().window().maximize();
		System.out.println("InitializeDriver:Driver:" + driver.toString());
		System.out.println("Web driver initialized ...");
	}
	
	@AfterSuite
	void closeBrowser() {
		
		driver.quit();
		
	}
	
}

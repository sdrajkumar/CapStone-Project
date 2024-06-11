package flipkarttest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class BasePageTest {
	
	protected WebDriver driver;
	String baseURL;
	String driverType;
	String driverPath;
	
	@BeforeSuite
	public void initializeDriver() {
		
		System.out.println("Web driver initialization started ...");
		driverType = "webdriver.chrome.driver";
		driverPath = "D:\\Tools\\Chrome Driver\\chromedriver-win64\\chromedriver.exe";
		baseURL = "https://www.flipkart.com/";
		System.setProperty(driverType,driverPath);
		driver = new ChromeDriver();
		driver.get(baseURL);
		driver.manage().window().maximize();
		System.out.println("Web driver initialized ...");
	}
	
}

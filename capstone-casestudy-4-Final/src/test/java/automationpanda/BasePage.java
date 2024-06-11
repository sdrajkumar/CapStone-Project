package automationpanda;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	protected WebDriver driver;
	protected String pageTitle;
	
	public BasePage(WebDriver driver) {
		System.out.println("Insite BasePage constructor ...");
		this.driver = driver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	public WebDriver getDriver() {
		
		return driver;
		
	}
	

}

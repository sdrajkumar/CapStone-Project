package automationpanda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WantToPracticeTestAutomationPage {

	protected WebDriver driver;
	
	private String pageTitle;
	
	private By contact = By.id("menu-item-10");
	
	
	public WantToPracticeTestAutomationPage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public String getPageTitle() {
		 
		pageTitle = driver.getTitle();
		return pageTitle;
	}
	
	public void clickContact() {
		
		driver.findElement(contact).click();
		
	}

}


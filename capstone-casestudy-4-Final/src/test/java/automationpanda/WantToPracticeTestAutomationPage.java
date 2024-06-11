package automationpanda;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class WantToPracticeTestAutomationPage extends BasePage{

	private String pageTitle;
	
	@FindBy (id = "menu-item-10")
	private WebElement contact;
		
	public WantToPracticeTestAutomationPage(WebDriver driver) {
		
		super(driver);
		
		System.out.println("Insite WantToPracticeTestAutomationPage constructor ...");
		System.out.println("Driver ..." + driver.toString());
		
	}
	
	public String getPageTitle() {
		
		System.out.println("Insite WantToPracticeTestAutomationPage.getPageTitle() ...");
		pageTitle = driver.getTitle();
		return pageTitle;
	}
	
	public void clickContact() {
		
		System.out.println("Insite WantToPracticeTestAutomationPage.clickContact() ...");
		contact.click();
		
	}

}


package automationpanda;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage extends BasePage{
	
	@FindBy (id = "menu-item-10")
	private WebElement contact;
		
	@FindBy (id = "g3-name")
	private WebElement name;
		
	@FindBy (id = "g3-email")
	private WebElement email;
		
	@FindBy (id = "contact-form-comment-g3-message")
	private WebElement message;
		
	@FindBy (xpath = "//*[@id=\"contact-form-3\"]/form/div/div[4]/button/strong")
	private WebElement submitButton;
		
	private String sentMessage;
	
	public ContactPage(WebDriver driver) {
		
		super(driver);
		
	}
	
	public void clickContact() {
		
		contact.click();
		
	}
	
	
	public void enterContactDetails() {
		
		name.sendKeys("Raj");
		email.sendKeys("raj@someemail.com");
		message.sendKeys("This is for automation testing...");
	}

	public void submitContactDetails() {
		
		submitButton.click();
	
		sentMessage = driver.findElement(By.id("contact-form-success-header")).getText();
	
		System.out.println("..." + sentMessage);
		
	}
	
	public String getSentMessage() {
		return sentMessage;
	}
}

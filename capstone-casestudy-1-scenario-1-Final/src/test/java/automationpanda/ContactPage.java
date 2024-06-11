package automationpanda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
	
	protected WebDriver driver;
	
	private By name = By.id("g3-name");
	
	private By email = By.id("g3-email");
	
	private By message = By.id("contact-form-comment-g3-message");
	
	private By submitButton = By.xpath("//*[@id=\"contact-form-3\"]/form/div/div[4]/button/strong");
	
	private String sentMessage;
	
	public ContactPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void enterContactDetails() {
		
		driver.findElement(name).sendKeys("Raj");
		driver.findElement(email).sendKeys("raj@someemail.com");
		driver.findElement(message).sendKeys("This is for automation testing...");
	}

	public void submitContactDetails() {
		
	driver.findElement(submitButton).click();
	
	sentMessage = driver.findElement(By.id("contact-form-success-header")).getText();
	
	System.out.println("..." + sentMessage);
		
	}
	
	public String getSentMessage() {
		return sentMessage;
	}
}

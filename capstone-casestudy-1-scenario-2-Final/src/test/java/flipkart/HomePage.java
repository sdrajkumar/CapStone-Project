package flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{
	
	private By logo = By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/div[1]/header/div[1]/div[1]/a/picture/img");
	
	private By searchBox = By.className("Pke_EE");
	
	
	public HomePage(WebDriver driver) {
		
		super(driver);
		
	}
	
	public String getPageTitle() {
		 
		pageTitle = driver.getTitle();
		return pageTitle;
	}
	
	public WebElement getLogo() {
		
		return driver.findElement(logo);
		
	}
	
	public SearchResultPage inputSearchText(String searchText) {
		
		driver.findElement(searchBox).sendKeys(searchText + Keys.ENTER);
		
		return new SearchResultPage(driver);
		
	}
	
}

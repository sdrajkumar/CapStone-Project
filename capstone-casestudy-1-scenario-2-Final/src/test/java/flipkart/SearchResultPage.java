package flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage extends BasePage{
	
	private By searchOutput = By.className("BUOuZu");
	
	private By searchResult1 = By.className("KzDlHZ");
	
	private String searchResult;
	
	public SearchResultPage(WebDriver driver) {
		
		super(driver);
	}

	public String getSearchResult(WebDriver driver) {
		
		searchResult = driver.findElement(searchOutput).getText();
		return searchResult;
		
	}
	
	public void gotoSearchResult(WebDriver driver) {
		
		driver.findElement(searchResult1).click();
		
	}

}

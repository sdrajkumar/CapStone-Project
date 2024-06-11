package flipkarttest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.collections.Lists;

import flipkart.HomePage;
import flipkart.SearchResultPage;

public class SearchResultPageTest extends BasePageTest{
	
	HomePage homePage;
	SearchResultPage searchResultPage;
	
	@Test (priority = 0)
	public void testLogo() {
		
		homePage = new HomePage(driver);
		AssertJUnit.assertTrue(homePage.getLogo().isDisplayed());
				
	}
	
	@Test (priority = 1)
	public void testSearch() {
		
		searchResultPage = homePage.inputSearchText("iphone 14");
		
	}
	
	@Test (priority = 2)
	public void testSearchResult() {
		
		System.out.println("...." + searchResultPage.getSearchResult(driver));
		searchResultPage.gotoSearchResult(driver);
		System.out.println("+++++" + driver.getWindowHandles());
		System.out.println("++++" + driver.switchTo().window(Lists.newArrayList(driver.getWindowHandles()).get(1)).getTitle());
		
		
	}
	
	
}

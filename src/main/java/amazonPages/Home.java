package amazonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;
	
	@FindBy(id = "twotabsearchtextbox") WebElement search;
	@FindBy(id = "nav-search-submit-button") WebElement searchBTN;
	
	public void enterSearch(String wordings) {
		search.sendKeys(wordings);
	}
	
	public void clickSearchBTN() {
		searchBTN.click();
	}
	
	public Home(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}

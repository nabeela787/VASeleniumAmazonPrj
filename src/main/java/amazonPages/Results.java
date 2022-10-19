package amazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Results {
	WebDriver driver;
	
	public int resultsToVerify() {
		int elements = driver.findElements(By.xpath("//*[text()='1-16 of over 20,000 results for']")).size();
		return elements;
		
	}
	
	@FindBy(xpath = "//*[contains(text()='2020 Apple MacBook Air Laptop: Apple M1 Chip, 13” Retina Display, 8GB RAM, 256GB SSD Storage, Backlit Keyboard, FaceTime HD Camera, Touch ID. Works with iPhone/iPad; Silver'])")
	WebElement computer;
	
	public void clickComputer() {
		computer.click();
	}
	
	public Results(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


}

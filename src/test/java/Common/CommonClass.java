package Common;


import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;

public class CommonClass {
	
	public static WebDriver driver;

	@Parameters({"browser", "website"})
	@BeforeTest
	public void browsers(String nameOfBrowsers, String url) {
		if (nameOfBrowsers.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
		} else if (nameOfBrowsers.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get(url);;
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
		} else {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get(url);;
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
		}
		
  }

  @AfterTest
  public void afterTest() {
//	  driver.close();
//	  driver.quit();
  }
  
	public static void screenshots(String folder) throws IOException {
		String path = System.getProperty("user.dir");
		Date ob = new Date();
		System.out.println(ob);
		String files = ob.toString().replace(" ", "_").replace(":", "_");
		System.out.println(files);
	File homeStPage =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(homeStPage, new File(path + "\\Pictures\\" + folder + "\\" + files + ".png"));
	}

}

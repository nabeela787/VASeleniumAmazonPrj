package amazonTests;

import org.testng.annotations.Test;

import Common.CommonClass;
import amazonPages.Home;
import amazonPages.Results;

public class AmazonToPurchase extends CommonClass{
  @Test
  public void f() {
	  Home home = new Home(driver);
	  home.enterSearch("Computer");
	  home.clickSearchBTN();
	  
	  Results result = new Results(driver);
	  result.resultsToVerify();
  }
}

package testCases;



import org.testng.Assert;
import org.testng.annotations.Test;

import commonFunctions.CommonFunctions;
import pageObjects.SS1_Verify_Login_Section_PageObjects;

public class SS2_Verify_Login_Successful extends CommonFunctions{
	
	
	@Test
	public void LoginSuccessful()
	{
    	SS1_Verify_Login_Section_PageObjects.Login_Username.sendKeys(properties.getProperty("username"));
    	SS1_Verify_Login_Section_PageObjects.Login_Password.sendKeys(properties.getProperty("password"));
    	SS1_Verify_Login_Section_PageObjects.Login_Button.click();
    	String title=driver.getTitle();
    	Assert.assertEquals(title,"Guru99 Bank Manager HomePage");
	}

}

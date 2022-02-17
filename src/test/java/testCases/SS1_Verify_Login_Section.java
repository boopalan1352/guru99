package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunctions;
import pageObjects.SS1_Verify_Login_Section_PageObjects;

public class SS1_Verify_Login_Section extends CommonFunctions {
	
	
    @Test
    public void Login()
    {
    	PageFactory.initElements(driver, SS1_Verify_Login_Section_PageObjects.class);
    	SS1_Verify_Login_Section_PageObjects.Login_Username.sendKeys(properties.getProperty("username"));
    	SS1_Verify_Login_Section_PageObjects.Login_Password.sendKeys(properties.getProperty("password"));
    	SS1_Verify_Login_Section_PageObjects.Login_Button.click();
    	SS1_Verify_Login_Section_PageObjects.Log_Out.click();
    	
    	al=driver.switchTo().alert();
    	al.accept();
    	
    }

}

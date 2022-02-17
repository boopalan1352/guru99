package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SS1_Verify_Login_Section_PageObjects {
	
	@FindBy(name="uid")
	public static WebElement Login_Username;
	
	@FindBy(name="password")
	public static WebElement Login_Password;
	
	@FindBy(name="btnLogin")
	public static WebElement Login_Button;
	
	@FindBy(xpath="//*[text()='Log out']")
	public static WebElement Log_Out; 

}

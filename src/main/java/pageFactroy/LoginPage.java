package pageFactroy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement userid;
	@FindBy(xpath="//*[@id=\"pass\"]")
	WebElement pasword;
	@FindBy(xpath="//*[@id=\"u_0_b\"]")
	WebElement loginbutton;
	
	public WebElement setUserid()
	{
		return userid;
	}
	public WebElement setPasword()
	{
		return pasword;
	}
	public WebElement clickLoginbutton()
	{
		return loginbutton;
	}
	
	
}

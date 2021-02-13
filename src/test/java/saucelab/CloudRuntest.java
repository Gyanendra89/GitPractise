package saucelab;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class CloudRuntest {

	//public static void main(String[] args) throws MalformedURLException
	@Test
	public void cloudrun() throws MalformedURLException
	{
		// TODO Auto-generated method stub
		 String sauceUserName = "Gyam89";
		    String sauceAccessKey = "3f330ea1-50b9-4b68-98d0-c1725664c8c8";
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("username", sauceUserName);

	    //set your sauce labs access key
	    caps.setCapability("accessKey", sauceAccessKey);
		caps.setCapability("platform", "Windows 10");
		caps.setCapability("version", "71.0");
	WebDriver	driver = new RemoteWebDriver(new URL("https://ondemand.us-west-1.saucelabs.com:443/wd/hub"), caps);
	driver.get("https://www.google.com/");
	System.out.println(driver.getTitle());
	driver.close();

	driver.get("https://www.facebook.com/");
	System.out.println(driver.getTitle());
	driver.close();


	}

}

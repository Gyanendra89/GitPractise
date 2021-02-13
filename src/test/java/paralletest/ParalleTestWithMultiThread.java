package paralletest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class ParalleTestWithMultiThread {

	public ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	public void setDriver(WebDriver driver)
	{
		this.driver.set(driver);
	}

	public WebDriver getDriver()
	{
		return this.driver.get();
	}
	//WebDriver driver;

	@Test()
	public void testOnChromeWithBrowserStackUrl()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
	setDriver(new ChromeDriver());
	getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	getDriver().get("https://www.browserstack.com/");
	getDriver().manage().window().maximize();
	System.out.println("this is the test related to chrome browserstack homepage"+ " " +Thread.currentThread().getId());

	}
	@Test()
	public void testOnChromeWithBrowserStackSignUp()
	{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Gyanendra\\Desktop\\Gecko\\geckodriver.exe");
	setDriver(new FirefoxDriver());
	((WebDriver) driver).manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	getDriver().get("https://www.browserstack.com/users/sign_up");
	((WebDriver) driver).manage().window().maximize();
	getDriver().findElement(By.id("user_full_name")).sendKeys("Sadhvi Singh");
	getDriver().findElement(By.id("user_email_login")).sendKeys("sadhvisingh24@gmail.com");
	getDriver().findElement(By.id("user_password")).sendKeys("browserstack");
	System.out.println("this is the test related to chrome browserstack login"+ " " +Thread.currentThread().getId());

	}

	@AfterClass
	public void close()
	{
		getDriver().quit();
	}
}

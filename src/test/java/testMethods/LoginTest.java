package testMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageFactroy.LoginPage;

public class LoginTest {

	WebDriver driver;


	  @BeforeTest
	  public void setUp() {
	  System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  }



		@Test
		public void login()
		{

          LoginPage logpage = new LoginPage(driver);
		  logpage.setUserid().sendKeys("gpa5kor");
		  logpage.setPasword().sendKeys("a234");
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  logpage.clickLoginbutton();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
          System.out.println("Entering in login test method");
          String Actual = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img")).getText();
			String expected = "facebook";
			Assert.assertEquals(Actual, expected);


		}


	/*
	 * @Test(priority=1) public void googleTest() {
	 * driver.get("https://www.google.com/"); driver.getTitle(); }
	 *
	 * @Test(priority=2) public void rahulTest() {
	 * driver.get("http://www.qaclickacademy.com/"); driver.getTitle(); }
	 *
	 * @Test(priority=3) public void gyanTest() {
	 * driver.get("https://www.naukri.com/");
	 * driver.findElement(By.xpath("//*[@id=\"lgin_Layer\"]")).click(); }
	 *
	 */
	  @AfterTest
	  public void tearDown() {
		  driver.close(); }

}

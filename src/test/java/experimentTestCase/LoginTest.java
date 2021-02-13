package experimentTestCase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageFactroy.LoginPage;
import resources.base;

public class LoginTest extends base {
	//ExtentReports extent = ExtentReportsNG.getReportObject();
	WebDriver driver;
	//private static Logger log = LogManager.getLogger(LogFourJ.class.getName());
	//Properties prop = new Properties();
	  @BeforeTest
	  public void setUp() throws IOException {
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\ChromeDriver\\chromedriver.exe"); driver = new ChromeDriver();
		 * driver.get("https://www.facebook.com/");
		 */
       //extent.createTest("browser openieng");
      //test.info("browser openend");
	  driver = intializeBrowser();
	  driver.get("https://www.facebook.com/");
	  //log.info("browser lunching");
	 //extent.flush();
	  //driver.get(prop.getProperty("browser"));

	  }



		@Test
		public void login()
		{
			//extent.createTest("Giving input in login page");
          LoginPage logpage = new LoginPage(driver);
		  logpage.setUserid().sendKeys("gpa5kor");
		  logpage.setPasword().sendKeys("a234");
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  logpage.clickLoginbutton();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
          System.out.println("Entering in login test method");
          //log.info("test is passing");
          //extent.flush();

		}

		@Test
		public void googleTest()
		{
			driver.get("https://www.google.com/");
			driver.getTitle();
		}



	  @AfterTest
	  public void tearDown() {
		  //extent.createTest("browser closing");
		  driver.close();
		 // extent.flush();}

}
}

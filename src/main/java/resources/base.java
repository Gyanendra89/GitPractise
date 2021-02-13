package resources;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	public WebDriver driver;
	public  WebDriver intializeBrowser() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Gyanendra\\eclipse-workspace@11072019\\E2ESeleniumProj\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);

		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
			 driver = new ChromeDriver();
		}

		else if(browserName.equals("IE"))
		{

		}
		else if(browserName.equals("firefox"))
		{

		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}


	  public void getScreenShotPath(String testCaseName,WebDriver driver) throws IOException
	  {
		  TakesScreenshot ts =(TakesScreenshot)driver;
		  File source = ts.getScreenshotAs(OutputType.FILE);
		  //File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   // File src = ts.getScreenshotAs(OutputType.FILE);
	    String destinfile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
	    FileUtils.copyFile(source, new File(destinfile));

	  }

}


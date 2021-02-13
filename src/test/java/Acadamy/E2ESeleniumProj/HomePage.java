package Acadamy.E2ESeleniumProj;

import java.io.IOException;

import org.testng.annotations.Test;

import resources.base;

public class HomePage extends base {

	@Test
	public void basePageNavigation() throws IOException
	{
		driver = intializeBrowser();
		driver.get("http://www.qaclickacademy.com/");
		driver.close();
	}

}

package pracise.interview;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsNG {

	static ExtentReports extent;

	public static ExtentReports getReportObj()
	{
      String path = System.getProperty("user.dir")+"//reports//index.html";
      ExtentSparkReporter reporter = new ExtentSparkReporter(path);
      reporter.config().setReportName("Automation Report");
      reporter.config().setDocumentTitle("Test Results");
      extent = new ExtentReports();
      extent.attachReporter(reporter);
      extent.setSystemInfo("Gyanendra", "Automation Specialist");
		return extent;
	}

}

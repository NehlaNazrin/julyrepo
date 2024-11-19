package pkg;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class Demo {
	WebDriver driver;
	String baseurl="https://www.facebook.com";
	ExtentSparkReporter reporter;
	ExtentTest test;
	ExtentReports extent;
	
	@BeforeTest
	public void beforetest()
	{
		reporter=new ExtentSparkReporter("./Reports/myreport1.html");
		reporter.config().setDocumentTitle("Automationreport");
		reporter.config().setReportName("functional test");
		reporter.config().setTheme(Theme.DARK);
		extent= new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("hostname","localhost");
		extent.setSystemInfo("OS", "windows10");
		extent.setSystemInfo("testname", "abc");
		extent.setSystemInfo("Browser Name","chrome");
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void setup()
	{
		driver.get(baseurl);
	}
	@Test
	public void fbtitleverification()
	{
		test=extent.createTest("fbtitleverification");
		String Exp="facebook";
		String actual=driver.getTitle();
		Assert.assertEquals(Exp, actual);
	}
	@AfterTest
	public void teardown()
	{
		extent.flush();
	}
	 @AfterMethod
	 public void browserclose(ITestResult result) throws IOException 
	 {
		 if(result.getStatus()==ITestResult.FAILURE)
		 {
			 test.log(Status.FAIL," test case failed is"+result.getName());
			 test.log(Status.FAIL, "test case failed is"+result.getThrowable());
			 String screenshotpath=screenshotMethod1(driver,result.getName());
			 test.addScreenCaptureFromPath(screenshotpath);
		 }else if (result.getStatus()==ITestResult.SKIP)
		 {
			 test.log(Status.SKIP,"test case is skipped is"+result.getName());
		 }
		 else if(result.getStatus()==ITestResult.SUCCESS)
		 {
			 test.log(Status.PASS, "test case passedis"+result.getName());
		 }
	 }
	 public static String screenshotMethod1(WebDriver driver,String screenshotname) throws IOException
	 {
		 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 String destination="./Screenshot/"+screenshotname+".jpg";
		 FileHandler.copy(src, new File(destination));
		 return destination;
		 
	 
	 
		 }
}

		
	

	
		
		
		
		

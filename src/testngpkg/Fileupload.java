package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.demo.guru99.com/test/upload/");
	}
@Test
public void test()
{
	driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("C:\\Users\\nehla\\OneDrive");
	driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
	String text=driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).getText();
	if(text.equalsIgnoreCase("Submit"))
	{
	System.out.println("passed");	
	}
	else
	{
		System.out.println("Fail");
	}
}
}

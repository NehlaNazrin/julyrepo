package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkavailability {
	ChromeDriver driver;
	@Before
	public void SetUp()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
@Test
public void googlesearch()
{
	String buttontext=driver.findElement(By.xpath("//input[@class='btn_checkavail']")).getAttribute("value");
	if(buttontext.equals("Check availability"))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	
	}
}


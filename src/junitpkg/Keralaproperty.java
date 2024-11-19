package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keralaproperty {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
	}
	@Test
	public void keralapropertylogin()
	{
		driver.findElement(By.id("username")).sendKeys("arya123");
		driver.findElement(By.id("upass")).sendKeys("123456");
		driver.findElement(By.name("sub_logbtn")).click();
	
	}
	

}

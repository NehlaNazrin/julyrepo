package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertprgm {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/nehla/OneDrive/Documents/Alertbox.html");
	}
@Test
public void alertmethod()
{
	driver.findElement(By.xpath("//*[@value='Display alert box']")).click();
	Alert a=driver.switchTo().alert();
	String text=a.getText();
	System.out.println("alert text="+text);
	a.accept();
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("arya");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("hjk");
	driver.findElement(By.xpath("//input[@value='submit']")).click();
}
}

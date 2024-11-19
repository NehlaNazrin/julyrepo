package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facebooklogin {
	ChromeDriver driver;
	@BeforeTest
	public void setUp() {
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	
	
	}
	
	@Parameters({"Username","Password"})
	@Test
	public void test(String username, String password)
	{
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
}
}
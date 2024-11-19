package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Loginvalidation {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();
	}
	@Test
	public void test() throws Exception {
        driver.findElement(By.xpath("//*[@id=\"ulogin\"]")).sendKeys("nehlanazrin872@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"upass\"]")).sendKeys("78324612");
		driver.findElement(By.xpath("//*[@id=\"sub_logbtn\"]")).click();
		Thread.sleep(3000);
		String expurl="https://keralaproperty.in/member/myhome/";
		String actualurl=driver.getCurrentUrl();
		System.out.println(actualurl);
		if(expurl.equals(actualurl))
		{
			System.out.println("login successful");
		}
		else {
			System.out.println("login failed");
		}
		
	}

}

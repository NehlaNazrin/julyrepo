package testngpkg;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazoncart {
	WebDriver driver;
	
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https:/www.amazon.in");
	}
	
	@Test
	public void test()
	{
		String parentwindow=driver.getWindowHandle();
		System.out.println("title of amazon"+driver.getTitle());
		driver.switchTo().newWindow(WindowType.TAB);
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).click();
		
       
        
        	`
        driver.switchTo().window(parentwindow);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
        
        driver.switchTo().newWindow(WindowType.TAB);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[5]/div[3]/div[1]/div[4]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[38]/div[1]/span/span/span/input")).click();
        
       ArrayList<String> windowdetails=new ArrayList<String>(driver.getWindowHandles());
       driver.switchTo().window(windowdetails.get(1));
       
        
        
        
	}

}

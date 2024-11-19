package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	ChromeDriver  driver;
    @Before
    public void setUp()
    
    {
    	driver=new ChromeDriver();
    	driver.get("https://www.google.co.in");
    }
    @Test
    public void googlesearch()
    {
    	WebElement searchfield=driver.findElement(By.name("//input[@type='search']"));
    	searchfield.sendKeys("books",Keys.ENTER);
    	driver.findElement(By.name("")).click();
    }
}

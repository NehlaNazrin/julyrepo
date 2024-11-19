package junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediffmail {
 ChromeDriver driver;
 @Before
 public void setUp()
 {
	 driver=new ChromeDriver();
	 driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	 driver.manage().window().maximize();
 }
 @Test
 public void rediffmailregistrationpage()
 {
	 List<WebElement>li=driver.findElements(By.tagName("a"));
	 System.out.println("no of links<=30");
	 
	 String src=driver.getPageSource();
 
 if(src.contains("Create a Rediffmail account")) {	 
	 System.out.println("Text is present");
		 }
 else
 {
	 System.out.println("Text is not present");
 }
 

 }
}

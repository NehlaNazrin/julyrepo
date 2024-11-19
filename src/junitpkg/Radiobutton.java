package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {
	 ChromeDriver driver;
	 @Before
	 public void SetUp()
	 {
	 	driver=new ChromeDriver();
	 	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	 	driver.manage().window().maximize();

}
	 @Test
	 public void Registrationpage()
	 {
	  WebElement rediflogo=driver.findElement(By.xpath("//input[@value='m']"));
	  boolean l=rediflogo.isSelected();
	  if(l)
	  {
		  System.out.println("button is selected");
	  }
	  else
	  {
		  System.out.println("button is not selected");
	  }
	 }
		 
	 }

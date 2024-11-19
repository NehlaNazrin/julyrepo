package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tests1 {
	ChromeDriver driver;
	@BeforeTest(alwaysRun=true)
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@BeforeMethod()
	public void mthd()
	{
		System.out.println("url loading");
	}
	@Test(priority=2,invocationCount=2,dependsOnMethods= {"test2"},groups="sanity")
	public void test1() {

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
@Test(priority=3,groups= {"smoke","sanity"})
public void test2() {
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
	  @Test
	  public void test3() {

			String buttontext=driver.findElement(By.xpath("//input[@class='btn_checkavail']")).getAttribute("value");
			if(buttontext.equals("Check availability"))
			{
				System.out.println("pass");
			}
			else
			{
				System.out.println("fail");
			}
			@Test
			public void test4() {

				WebElement day= driver.findElement(By.xpath("//*[contains(@name,'DOB_Day')]"));
				Select ob=new Select(day);
				ob.selectByValue("02");
				WebElement month= driver.findElement(By.xpath("//*[contains(@name,'DOB_Month')]"));
				Select ob1=new Select(month);
				ob1.selectByVisibleText("JAN");
				WebElement year=driver.findElement(By.xpath("//*[contains(@name,'DOB_Year')]"));
				Select ob2=new Select(year);
				ob2.selectByValue("2024");
				
			}
	  
}
	



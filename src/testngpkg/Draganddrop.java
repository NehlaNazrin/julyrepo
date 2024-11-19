package testngpkg;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
	}
	
@Test
public void test()
{
	Actions act=new Actions(driver);
	WebElement Bank=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
	WebElement Account=driver.findElement(By.xpath("//*[@id=\"shoppingCart1\"]/div"));
	act.dragAndDrop(Bank, Account).perform();
	WebElement cash=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	WebElement Amount=driver.findElement(By.xpath("//*[@id=\"shoppingCart4\"]/div"));
	act.dragAndDrop(cash, Amount).perform();
	WebElement account=driver.findElement(By.xpath("//*[@id=\"shoppingCart3\"]/div"));
	WebElement Sales=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
	act.dragAndDrop(Sales, account).perform();
	WebElement amount=driver.findElement(By.xpath("//*[@id=\"shoppingCart4\"]/div"));
	WebElement Cash=driver.findElement(By.xpath("//*[@id=\\\"fourth\\\"]/a+"));
	act.dragAndDrop(Cash, amount).perform();
}
}

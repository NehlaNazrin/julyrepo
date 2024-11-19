package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import test.Baseclass;

public class Fbcreatepage  extends Baseclass{
	WebDriver driver;
	
	By createpage=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	By getstarted=By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[1]/div/div[1]/div[2]/button/div/div");
	By login= By.xpath("//*[@id=\"u_0_0_Hv\"]/span");
	
	public Fbcreatepage(WebDriver driver) {
		this.driver=driver;

	}
	public void pageclick()
	{
		driver.findElement(createpage).click();
	}
	public void pagesource()
	{
		driver.getPageSource();
	}
	public void click()
	{
		driver.findElement(login).click();
	}

}

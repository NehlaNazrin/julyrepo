package test;

import org.testng.annotations.Test;

public class Fbcreatepagetest extends Baseclass {
	@Test
	public void createpagetest()
	{
		Fbcreatepage  ob=new Fbcreatepage(driver);
		ob.pageclick();
		ob.getstartbutton();
		
	}


}

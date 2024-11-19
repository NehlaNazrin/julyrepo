package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesourceprgm {
	
    static String baseurl="https://www.google.com";
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get(baseurl);
		String src= driver.getPageSource();
		
		if(src.contains("Gmail")) {
		System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
	}

}

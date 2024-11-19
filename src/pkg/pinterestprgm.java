package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class pinterestprgm {
	static String baseurl="https://www.nykaa.com";

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get(baseurl);
		String src= driver.getPageSource();
		
		if(src.contains("Offers")) {
			System.out.println("Text is present");
		}
		else {
			System.out.println("The text is not present");
		}
		
		

	}

}

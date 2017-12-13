package Selenium_Testing_Gmail.Gmail_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Frames_examples {

	@Test
	public void Test_frame(){

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\teja\\Downloads\\New_folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.firstcry.com/");
		
		driver.close();
		//driver.findElements(By.tagName(name))
	}

}

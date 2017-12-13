package Selenium_Testing_Gmail.Gmail_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Gmail_homepage {
	
	@Test
	public void Test_login(){
	
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\teja\\Downloads\\New_folder\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://mail.google.com/");
	driver.close();

}

}

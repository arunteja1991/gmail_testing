package Selenium_Testing_Gmail.Gmail_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class gmail_login {
	
	@Test
	public void Test_search(){
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\teja\\Downloads\\New_folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com/");
	
	driver.findElement(By.name("q")).sendKeys("arun teja");
	driver.close();

}

}

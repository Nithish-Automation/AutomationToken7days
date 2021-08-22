package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLocatorAssign {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/");
		driver.findElement(By.linkText("LOGIN")).click();
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		driver.findElement(By.name("forgetPasswordEmailOrUsername")).sendKeys("abcd@gmail.com");
		driver.findElement(By.id("forgetPasswordButton")).click(); 
		
		
		
		
	}

}

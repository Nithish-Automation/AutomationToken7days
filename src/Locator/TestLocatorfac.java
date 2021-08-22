package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLocatorfac {
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("kjdsjd");
		driver.findElement(By.name("pass")).sendKeys("dfhkjhfdk");
		
		/* driver.findElement(By.linkText("Forgotten password?")).click(); */
		driver.findElement(By.partialLinkText("password?")).click();
		
		driver.findElement(By.id("identify_email")).sendKeys("123468767");
		driver.findElement(By.id("did_submit")).click();
		
		driver.close();
		
	}

}

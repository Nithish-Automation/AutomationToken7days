package XpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VoterPortal {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.nvsp.in/");
		driver.findElement(By.id("login")).click();
		
		String title =driver.getTitle();
		System.out.println(driver.getCurrentUrl());
		System.out.println(title);
		
		
		driver.findElement(By.id("UserName")).sendKeys("9611445858");
		driver.findElement(By.id("Password")).sendKeys("9611445858");
		
		System.out.println("captcha cannot be automated");
		
		driver.close();
		
		
	}
	
	
	

}

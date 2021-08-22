package XpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UdemyAutomation {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.udemy.com/");
		
		Thread.sleep(8000);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("email--1")).sendKeys("vpnithish@gmail.com");
		driver.findElement(By.id("id_password")).sendKeys("Navpnithish#5858");
		driver.findElement(By.id("submit-id-submit")).click();
		
		String title =driver.getTitle();
		System.out.println(title);
		if (title.equals("Access to this page has been denied.")) {
			
			System.out.println("pass : Access deied for automstion tools");
		}
		
		else {
			System.out.println("fail");
		}
		
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
		
	}

}

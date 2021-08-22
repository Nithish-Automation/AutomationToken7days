package XpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAuto {
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("vpnithish@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Navpnithish#1994");
		Thread.sleep(8000);
		
		driver.findElement(By.name("login")).click();
		
		String name = driver.getTitle();
		
		System.out.println(name);
		
		if (name.equals("Facebook – log in or sign up")) {
			
			System.out.println("Pass: Home page is displayed");
			
		}
		
		else {
			System.out.println("fail: Home page is not displayed");
		}
		
		
		
		
		System.out.println(driver.getCurrentUrl());
		
		
		
		

}
}
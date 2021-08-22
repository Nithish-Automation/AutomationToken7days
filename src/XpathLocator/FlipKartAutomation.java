package XpathLocator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartAutomation {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
//		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
		Thread.sleep(10000);
		
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("vpnithish@outlook.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("navpnithish1994");
		driver.findElement(By.xpath("(//span[text()='Login'])[2]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(4000);
		
		 WebElement ele = driver.findElement(By.name("q"));
		 ele.sendKeys("Samsung Phones");
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 
		 Dimension size = ele.getSize();
		 System.out.println("Hight of search box is "+size.height);
		 System.out.println("Hight of search box is "+size.width);
		 
		 
		 Point loc = ele.getLocation();
		 System.out.println("co ordinate of x is "+loc.x);
		 System.out.println("co ordinate of y is "+loc.y);
		 
		 ele.clear();
		
	}

}

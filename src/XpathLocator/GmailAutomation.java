package XpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailAutomation {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://mail.google.com/");
		
		driver.findElement(By.id("identifierId")).sendKeys("vpnithish@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		
	}

}

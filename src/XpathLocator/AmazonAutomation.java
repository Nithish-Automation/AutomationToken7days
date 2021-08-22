package XpathLocator;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAutomation {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		
		String title =  driver.getTitle();
		System.out.println(title);
		
		if (title.equals("Amazon Sign In")) {
			System.out.println("pass: SignIn Page displayed");
		}
		else {
			System.out.println("fail: SignIn Page not displayed");
		}
		System.out.println();
		System.out.println(driver.getCurrentUrl());
		
		
		driver.findElement(By.id("ap_email")).sendKeys("vpnithish@gmail.com");
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("ap_password")).sendKeys("NAVPnithish#94");
		driver.findElement(By.id("signInSubmit")).click();	
		
		Thread.sleep(8000);
		
		  String home_page= driver.getTitle();
		  System.out.println(home_page);
		  System.out.println();
		  
		  if (home_page.equals(home_page)) {
			  
			  System.out.println("Pass: Home page displayed");
			
		}
		  else {
			System.out.println("Fail: Home page not displayed");
		}
		  
		WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
		ele.sendKeys("Phone");
		
		Thread.sleep(3000);
		
		List<WebElement> ele2 = driver.findElements(By.xpath("//div[@class='s-suggestion']"));
		System.out.println(ele2.size());
		
		for (WebElement webElement : ele2) {
			System.out.println(webElement.getText());
			
		}
		
		Thread.sleep(2000);
		driver.close();
		
		  
		  		  
	}

}

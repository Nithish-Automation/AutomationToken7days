package dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Skillrary {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement drop = driver.findElement(By.name("addresstype"));
		
//		drop down operation
		Select s = new Select(drop);
		s.selectByIndex(1);
		
		driver.findElement(By.xpath("(//a[text()='Selenium Training'])[2]")).click();
		WebElement ele = driver.findElement(By.id("add"));
		
//		action class
		Actions a = new Actions(driver);
		a.doubleClick(ele).perform();
		
	
	}

}
